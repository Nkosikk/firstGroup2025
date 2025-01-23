package Tests;

import Pages.CheckOutPage;
import Pages.HomePage;
import Pages.LoginPage;
//import Pages.ProductPage;
import Pages.OverviewPage;
import Utils.BrowserFactory;
import Utils.ReadFromExcel;
import Utils.TakesScreenshots;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import java.io.IOException;

public class Base {

    BrowserFactory browserFactory = new BrowserFactory();
    final WebDriver driver = browserFactory.startBrowser("chrome","https://www.saucedemo.com/");
    LoginPage loginPage = PageFactory.initElements(driver,LoginPage.class);
    HomePage homePage = PageFactory.initElements(driver, HomePage.class);
<<<<<<< HEAD
    CheckOutPage checkOutPage = PageFactory.initElements(driver, CheckOutPage.class);
    OverviewPage overviewPage = PageFactory.initElements(driver, OverviewPage.class);
=======

    TakesScreenshots takesScreenshots = new TakesScreenshots();

    ReadFromExcel readFromExcel;

    {
        try {
            readFromExcel = new ReadFromExcel();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

>>>>>>> 659da97743076a141c0e8ac64cce1ba6edb10cbd
}
