package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PurchaseitemsPage {

    WebDriver driver;


    public void addItemToCart(WebDriver driver, String tagName) {
        // Locate the item by its visible text and click the associated "Add to Cart" button
        WebElement item = driver.findElement(By.xpath(("//img[@alt='Sauce Labs Backpack']") + By.className("inventory_item_img")));
        item.click();
    }


    public void addToCart(WebDriver driver, String productLocator, String cartLocator) {
        try {
            driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']")).click(); // Click "Add to Cart" button
            WebElement cart = driver.findElement(By.xpath("//a[@class='shopping_cart_link']")); // Locate cart element
            if (cart.isDisplayed()) { // Check if cart is displayed
                System.out.println("Item successfully added to the cart!");
            } else {
                System.err.println("Failed to add item to the cart.");
            }

        } catch (Exception e) {
            System.out.println("An error occured" + e.getMessage());
        }
    }
}



