package Pages;

import org.openqa.selenium.By;
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

    @FindBy(xpath = "//button[@name='remove-sauce-labs-backpack']")
    WebElement btnRemove_xpath;

    @FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-backpack']" )
    WebElement sauceLabBackpack;

    @FindBy(xpath = "//a[@class='shopping_cart_link']")
    WebElement shoppingCart;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void verifyProductTextIsDisplayedIHomePage() {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(productTitle_xpath));
        productTitle_xpath.isDisplayed();

    }

    public void addToCart(){
        sauceLabBackpack.click();
    }

    public void verifyProductIsAddedOnCart(){
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(btnRemove_xpath));
        btnRemove_xpath.isDisplayed();
    }

    public void navigateToCart(){
        shoppingCart.click();
    }


}
