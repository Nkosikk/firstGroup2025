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

    @FindBy(id ="add-to-cart-sauce-labs-backpack")
    WebElement addToCartButton_id;

    @FindBy(xpath = "//a[contains(@class,'shopping_cart_link')]")
    WebElement ShoppingCartButton_id;


    public HomePage(WebDriver driver) {
        this.driver = driver;
    }


    public void verifyProductTextIsDisplayedIHomePage() {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(productTitle_xpath));
        productTitle_xpath.isDisplayed();

    }

    public void Click_Add_To_Cart_Button()
    {
        addToCartButton_id.click();
    }
//
    public void Click_Shopping_Cart_Button()
    {
        ShoppingCartButton_id.click();

    }
}
