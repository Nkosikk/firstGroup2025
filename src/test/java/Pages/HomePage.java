package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class HomePage {

    WebDriver driver;

    @FindBy(xpath = "//span[contains(.,'Products')]")
    WebElement productTitle_xpath;

    @FindBy(xpath = "//button[contains(@id,'add-to-cart-sauce-labs-backpack')]")
    WebElement backpackItem;

    @FindBy(xpath = "(//div[contains(@class,'inventory_item_name ')])[1]")
    WebElement backpackItemInfo;

    @FindBy(xpath = "//button[contains(@id,'add-to-cart-sauce-labs-bike-light')]")
    WebElement bikeLightItem;

    @FindBy(xpath = "//a[contains(@class,'shopping_cart_link')]")
    WebElement cartIcon;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }



    public void verifyProductTextIsDisplayedIHomePage() {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(productTitle_xpath));
        productTitle_xpath.isDisplayed();

    }

    public void addItemToCart(){
        backpackItem.click();
        bikeLightItem.click();
    }

    public void verifyItemAddedToCart(){
        // Verify item added to cart
        WebElement cartBadge = new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(cartIcon));

        if (cartBadge == null || Integer.parseInt(cartBadge.getText()) <= 0) {
            throw new AssertionError("Item not added to cart");
        }
    }

    public  void clickCartIcon(){
        cartIcon.click();
    }
}
