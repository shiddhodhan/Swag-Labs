package swag_labs_pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_Page {

	@FindBy(id = "add-to-cart-sauce-labs-backpack")
	WebElement BagpackAddToCart;

	@FindBy(id = "shopping_cart_container")
	WebElement MiniCart;

	WebDriver driver;

	public Home_Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;

	}

	public void addToCart() {
		BagpackAddToCart.click();
		MiniCart.click();

	}

}
