package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddtoCartPage {

    WebDriver driver;

    @FindBy(xpath = "//span[contains(.,'Products')]")
    WebElement productTitle_xpath;

    // Step 3: Add items to cart
    WebElement addToCartButton = driver.findElement(By.id("add-to-cart-sauce-labs-backpack"));
        addToCartButton.click();

    // Navigate to the cart
    WebElement cartButton = driver.findElement(By.className("shopping_cart_link"));
        cartButton.click();

}
