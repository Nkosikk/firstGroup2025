package Tests;

import Pages.*;
import Utils.BrowserSelection;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Base
{
    BrowserSelection browserSelection= new BrowserSelection();
    final WebDriver driver= browserSelection.StartBrowser("chrome","https://www.saucedemo.com/");
    LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
    InventoryPage inventoryPage = PageFactory.initElements(driver, InventoryPage.class);
    CartPage cartPage = PageFactory.initElements(driver,CartPage.class);
    CheckOutPage checkOutPage = PageFactory.initElements(driver,CheckOutPage.class);
    CheckoutOverview checkoutOverview = PageFactory.initElements(driver,CheckoutOverview.class);
    CompletePage completePage = PageFactory.initElements(driver, CompletePage.class);

}
