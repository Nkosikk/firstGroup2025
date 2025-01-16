package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage {

    WebDriver driver;

    @FindBy(xpath = "//span[contains(.,'Products')]")
    WebElement productTitle_xpath;

    @FindBy (id = "add-to-cart-sauce-labs-backpack")
    public WebElement addToCart_id;

    @FindBy(xpath = "//button[@id='remove-sauce-labs-backpack']")
    WebElement RevomeButton_xpath;

    @FindBy(xpath = "//a[@class='shopping_cart_link']")
    WebElement cartlink_xpath;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void verifyProductTextIsDisplayedIHomePage() {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(productTitle_xpath));
        productTitle_xpath.isDisplayed();

    }
    public void clickaddToCart() {
        addToCart_id.click();
        }
    public void verifyRemovebutton() {
        RevomeButton_xpath.isDisplayed();

    }

    public void clickcartlink() {
        cartlink_xpath.click();
    }

}
