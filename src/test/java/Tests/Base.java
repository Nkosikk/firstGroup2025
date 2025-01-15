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
    CartPage cartPage = PageFactory.initElements(driver,CartPage.class);
    CheckoutPage checkoutPage = PageFactory.initElements(driver,CheckoutPage.class);
    CheckOutOverviewPage checkOutOverviewPage = PageFactory.initElements(driver,CheckOutOverviewPage.class);
    CheckoutCompletePage checkoutCompletePage = PageFactory.initElements(driver,CheckoutCompletePage.class);

}
