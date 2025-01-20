package Tests;

import Pages.CartPage;
import Pages.CheckoutStepOnePage;
import Pages.HomePage;
import Pages.LoginPage;
import Utils.BrowserFactory;
import Utils.TakesScreenshots;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Base {

    BrowserFactory browserFactory = new BrowserFactory();
    final WebDriver driver = browserFactory.startBrowser("chrome","https://www.saucedemo.com/");
    LoginPage loginPage = PageFactory.initElements(driver,LoginPage.class);
    HomePage homePage = PageFactory.initElements(driver, HomePage.class);
    TakesScreenshots takesScreenshots = new TakesScreenshots();
    CartPage cartPage = PageFactory.initElements(driver, CartPage.class);
    CheckoutStepOnePage checkoutStepOnePage = PageFactory.initElements(driver, CheckoutStepOnePage.class);


}
