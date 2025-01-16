package Tests;

import Pages.CheckOutPage;
import Pages.HomePage;
import Pages.LoginPage;
//import Pages.ProductPage;
import Pages.OverviewPage;
import Utils.BrowserFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Base {

    BrowserFactory browserFactory = new BrowserFactory();
    final WebDriver driver = browserFactory.startBrowser("chrome","https://www.saucedemo.com/");
    LoginPage loginPage = PageFactory.initElements(driver,LoginPage.class);
    HomePage homePage = PageFactory.initElements(driver, HomePage.class);
    CheckOutPage checkOutPage = PageFactory.initElements(driver, CheckOutPage.class);
    OverviewPage overviewPage = PageFactory.initElements(driver, OverviewPage.class);
}
