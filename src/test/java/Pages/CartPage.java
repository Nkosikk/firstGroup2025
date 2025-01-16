package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CartPage {

    WebDriver driver;

    @FindBy(xpath = "//span[@class='title'][contains(.,'Your Cart')]")
    WebElement cartTitle_xpath;

    @FindBy(xpath = "//div[@class='inventory_item_name'][contains(.,'Sauce Labs Backpack')]")
    WebElement backPack;

    @FindBy(xpath="//button[@id='checkout']")
    WebElement btnCheckout_xpath;

    public CartPage(WebDriver driver) {
        this.driver = driver;
    }

    public void verifyCart(){
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(cartTitle_xpath));
        cartTitle_xpath.isDisplayed();
    }

    public void itemInCart(){
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(backPack));
        backPack.isDisplayed();
    }

    public void clickCheckOut(){
        btnCheckout_xpath.click();
    }

}
