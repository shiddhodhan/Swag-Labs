package swag_labs_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page  {

    @FindBy(id = "user-name")
    private WebElement Username;

    @FindBy(id = "password")
    private WebElement Password;
    @FindBy(id = "login-button")
    private WebElement LoginButton;

    public Login_Page(WebDriver driver) {

        PageFactory.initElements(driver, this);

    }

    public void EnterUsername(String UN) {

        Username.sendKeys(UN);

    }

    public void EnterPassword(String PWD) {
        Password.sendKeys(PWD);
    }

    public void ClickLoginButton() {
        LoginButton.click();
    }


}
