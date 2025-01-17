package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPage {
    WebDriver driver;

    @FindBy(xpath = "//a[contains(@class,'shopping_cart_link')]")
    WebElement cartLink;

    @FindBy(xpath = "(//div[contains(@class,'inventory_item_name')])[1]")
    WebElement cartItem;

    @FindBy(xpath = "//button[contains(@id,'checkout')]")
    WebElement checkoutButton;

    public CartPage(WebDriver driver) {
        this.driver = driver;
    }

    public void NavigateToCart(){
        cartLink.click();
    }

    public void clickCheckoutButton(){
        checkoutButton.click();
    }

}
