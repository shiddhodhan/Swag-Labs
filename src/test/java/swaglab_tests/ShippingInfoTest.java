package swaglab_tests;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import common_utilities.Utility;
import swag_labs_pages.Base;
import swag_labs_pages.CartPage;
import swag_labs_pages.CheckoutPage;
import swag_labs_pages.Home_Page;
import swag_labs_pages.Login_Page;

public class ShippingInfoTest extends Base {
	Login_Page login;
	Home_Page homePage;
	CartPage checkout;
	CheckoutPage yourinfo;
	CheckoutPage verifyPrice;

	ExtentReports extent = Utility.Reports();

	@BeforeClass
	public void setup() {
		LaunchBrowser();
		login = new Login_Page(driver);
		homePage = new Home_Page(driver);
		checkout = new CartPage(driver);
		yourinfo = new CheckoutPage(driver);
		verifyPrice = new CheckoutPage(driver);
		

	}

	@AfterClass
	public void shutdown() {
		 CloseBrowser();
		extent.flush();

	}

	@Test(priority = 1)
	public void LoginToSwagLabs() throws EncryptedDocumentException, IOException {
		ExtentTest test1 = extent.createTest("Login Test");
		login.EnterUsername(Utility.ReadDataFromExcel(0, 0));
		login.EnterPassword(Utility.ReadDataFromExcel(0, 1));

		login.ClickLoginButton();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		test1.pass("login successfull");

	}

	@Test(priority = 2)
	public void AddtoCart() {
		ExtentTest test2 = extent.createTest("user want to add BackPack to the cart");
		homePage.addToCart();
		test2.pass("BackPack added to cart page");

	}

	@Test(priority = 3)
	public void checkout() {
		ExtentTest test3 = extent.createTest("Verify shipping verbiage as expected or not");
		checkout.Checkout();
		yourinfo.YourInfo();
		test3.pass("Shipping verbiage is expected");
	}
	
	@Test(priority=4)
	public void VerifyPrice(){
		
		ExtentTest test4 = extent.createTest("Verify Total Price");
		 verifyPrice.verifyPrice();
		
		test4.pass("price is expected");
		
		
	}
	
		
		
	

}
