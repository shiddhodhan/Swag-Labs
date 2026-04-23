package swaglab_tests;

 
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.model.Report;
 
import common_utilities.Utility;
import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
 
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import swag_labs_pages.Base;
import swag_labs_pages.CartPage;
import swag_labs_pages.CheckoutPage;
 
import org.testng.annotations.Test;
import swag_labs_pages.Base;
 
import swag_labs_pages.Home_Page;
import swag_labs_pages.Login_Page;

import java.io.IOException;
import java.time.Duration;

 
public class LoginTest extends Base {

	Login_Page login;
	Home_Page homePage;
	ExtentReports extent = Utility.Reports();
 
	
	@BeforeClass
	public void setup() {
		LaunchBrowser();
		login = new Login_Page(driver);
		homePage = new Home_Page(driver);
		 

	}

	@AfterClass
	public void shutdown() {
		// CloseBrowser();
		extent.flush();

	}

	@Test 
	public void LoginToSwagLabs() throws EncryptedDocumentException, IOException {

		login.EnterUsername(Utility.ReadDataFromExcel(0, 0));
		login.EnterPassword(Utility.ReadDataFromExcel(0, 1));

		login.ClickLoginButton();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));

	}

	 
 

 

}
