package swag_labs_steps;

import java.io.IOException;
import java.time.Duration;

import common_utilities.Utility;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import swag_labs_pages.Base;
import swag_labs_pages.CartPage;
import swag_labs_pages.CheckoutPage;
import swag_labs_pages.Home_Page;
import swag_labs_pages.Login_Page;

public class Swag_Lab_StepDefination extends Base {
	Login_Page login;
	Home_Page homePage;
	CartPage cartpageCheckoutButton;
	CheckoutPage checkout;

	@Given("User login to swag_labs application")
	public void user_login_to_swag_labs_application() throws IOException {
		LaunchBrowser();
		login = new Login_Page(driver);

		login.EnterUsername(Utility.ReadDataFromExcel(0, 0));
		login.EnterPassword(Utility.ReadDataFromExcel(0, 1));

		login.ClickLoginButton();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));

	}

	@When("User added backpack to the cart")
	public void user_added_backpack_to_the_cart() {
		homePage = new Home_Page(driver);
		homePage.addToCart();

	}

	@And("User proceed with the Checkout page")
	public void User_proceed_with_the_Checkout_page() {
		cartpageCheckoutButton = new CartPage(driver);
		checkout = new CheckoutPage(driver);

		cartpageCheckoutButton.CheckoutButton();

	}

	@And("User checking verbiage on the checkout page")
	public void User_checking_verbiage_on_the_checkout_page() {
		checkout.YourInfo();

	}

	@And("User checking price on the checkout page")
	public void User_checking_price_on_the_checkout_page() {
		checkout.YourInfo();
		checkout.verifyPrice();

	}

	@Then("User submitted order successfully")
	public void User_submitted_order_successfully() {
		checkout.SubmitOrder();
	}

}
