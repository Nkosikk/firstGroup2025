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
    CartPage CartPage = PageFactory.initElements(driver, CartPage.class);
    CheckoutInfoPage CheckoutInfoPage = PageFactory.initElements(driver, Pages.CheckoutInfoPage.class);
    CheckoutOverviewPage CheckoutOverviewPage = PageFactory.initElements(driver, Pages.CheckoutOverviewPage.class);
    CheckoutCompletePage CheckoutComplete = PageFactory.initElements(driver, CheckoutCompletePage.class);
}
