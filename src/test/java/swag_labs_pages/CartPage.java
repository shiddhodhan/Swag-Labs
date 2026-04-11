package swag_labs_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage {
	
	@FindBy(xpath="//button[text()='Checkout']") WebElement CheckoutButton;
	
	WebDriver driver;
	public CartPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver= driver;
	}
	
	
	
	public void Checkout() {
		CheckoutButton.click();
		
	}
	
	

}
