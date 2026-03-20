package swag_labs_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;


public  class Base {
 public WebDriver driver;

    public void LaunchBrowser(){

        ChromeOptions op = new ChromeOptions();
        op.addArguments("--incognito");
       // op.addArguments("disable-notifications");
        driver = new ChromeDriver(op);

        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
        driver.manage().deleteAllCookies();

    }

    public void CloseBrowser(){

        driver.quit();

    }
}
