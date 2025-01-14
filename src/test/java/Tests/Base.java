package Tests;

import Pages.*;
import Utils.BrowserFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Base {

    BrowserFactory browserFactory = new BrowserFactory();
    final WebDriver driver = browserFactory.startBrowser("chrome","https://www.saucedemo.com/");
    LoginPage loginPage = PageFactory.initElements(driver,LoginPage.class);
    HomePage homePage = PageFactory.initElements(driver, HomePage.class);
    YourCartPage yourCartPage = PageFactory.initElements(driver, YourCartPage.class);
    CaptureInfoPage captureInfoPage = PageFactory.initElements(driver, CaptureInfoPage.class);
    CheckoutOverviewPage checkoutOverviewPage = PageFactory.initElements(driver, CheckoutOverviewPage.class);
    CheckoutCompletedPage checkoutCompletedPage = PageFactory.initElements(driver, CheckoutCompletedPage.class);
}
