package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class CartPage {
    WebDriver driver;

    @FindBy(xpath = "//a[contains(@class,'shopping_cart_link')]")
    WebElement cartLink;

    @FindBy(xpath = "(//div[contains(@class,'inventory_item_name')])[1]")
    WebElement cartItem;

    @FindBy(xpath = "//button[contains(@id,'checkout')]")
    WebElement checkoutButton;

    @FindBy(xpath = "//input[@name='firstName']")
    WebElement firstName_xpath;


    public CartPage(WebDriver driver) {
        this.driver = driver;
    }

    public void navigateToCart(){
        cartLink.click();

    }
    public void verifyItemInTheCart(){
    // Verify item is in the cart
        if (cartItem == null) {
            throw new AssertionError("Item not found in cart");
        }
    }
    public void clickCheckoutButtonAndVerifyCaptureScreen(){
        checkoutButton.click();
        // Verify capture information screen
        if (firstName_xpath == null) {
            throw new AssertionError("Not on capture information screen");
        }
    }

    public void enterDetails(){

    }

}
