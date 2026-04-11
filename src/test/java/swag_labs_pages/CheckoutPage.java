package swag_labs_pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

public class CheckoutPage {

	@FindBy(id = "first-name")
	WebElement FirstName;

	@FindBy(xpath = "//input[@placeholder='Last Name']")
	WebElement LastName;

	@FindBy(xpath = "//input[@placeholder='Zip/Postal Code']")
	WebElement ZipCode;

	@FindBy(id = "continue")
	WebElement ContinueButton;

	@FindBy(xpath = "//div[text()='Free Pony Express Delivery!']")
	WebElement ShippingInfo;

	@FindBy(xpath = "//div[text()='32.39']")
	WebElement price;

	@FindBy(id = "finish")
	WebElement finish;

	WebDriver driver;

	public CheckoutPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;

	}

	public void YourInfo() {

		FirstName.sendKeys("Test");
		LastName.sendKeys("Tester");
		ZipCode.sendKeys("123456");
		ContinueButton.click();

		String shippingverbiage = ShippingInfo.getText();
		String expected = "Free Pony Express Delivery!";

		SoftAssert ass = new SoftAssert();
		ass.assertEquals(shippingverbiage, expected);

		ass.assertAll();

	}

	public void verifyPrice() {
		SoftAssert ass = new SoftAssert();

		String TotalPrice = price.getText();
		String exp = "Total: $32.39";

		ass.assertEquals(TotalPrice, exp);

		ass.assertAll();
		finish.click();
	}

}
