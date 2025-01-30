package Pages;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

public class HomePage {

    WebDriver driver;

    @FindBy(xpath = "//span[contains(.,'Products')]")
    WebElement productTitle_xpath;

    @FindBy(xpath = "//button[@name='add-to-cart-sauce-labs-backpack']")
    WebElement addBackpack;

    @FindBy(xpath = "//button[@name='add-to-cart-sauce-labs-bolt-t-shirt']")
    WebElement addBoltshirt;

    @FindBy(xpath = "//span[contains(@data-test,'shopping-cart-badge')]")
    WebElement ShoppingCartHasSomething;

    @FindBy(xpath = "//a[contains(@data-test,'shopping-cart-link')]")
    WebElement ShoppingCartIsEmpty;

    @FindBy(xpath = "//span[contains(.,'Your Cart')]")
    WebElement YourCart;

    @FindBy(xpath = "//button[contains(.,'Checkout')]")
    WebElement CheckOut;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }


    public void verifyProductTextIsDisplayedIHomePage() {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(productTitle_xpath));
        productTitle_xpath.isDisplayed();

    }

    public void addProductsToCart() {
        addBackpack.click();
        addBoltshirt.click();
    }

    public void verifyProductIsAddedToCart() {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(ShoppingCartHasSomething));
        ShoppingCartHasSomething.isDisplayed();
    }

    public void navigateToCart() {
        ShoppingCartHasSomething.click();
    }

    public void verifyCartIsDisplayedAndCheckOut() {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(YourCart));
        YourCart.isDisplayed();
        CheckOut.click();
    }

   /* public static String takeScreenshot (WebDriver driver) throws IOException {
        String pageName = driver.getTitle();

        TakesScreenshot ts = (TakesScreenshot) driver;
        String todaysDate = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
        File source = ts.getScreenshotAs(OutputType.FILE);
        String destination = System.getProperty("user.dir") + "/SeleniumScreenshots/"+pageName+todaysDate+".png";
        File fileDestination = new File(destination);
        FileUtils.copyFile(source, fileDestination);
        return destination;
    }*/


}
