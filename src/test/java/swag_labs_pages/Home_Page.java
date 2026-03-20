package swag_labs_pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Home_Page {
    WebDriver driver;

    public Home_Page(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;

    }


}
