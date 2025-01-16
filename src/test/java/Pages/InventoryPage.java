package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class InventoryPage {
    WebDriver driver;

    @FindBy(xpath = "//span[@class='title'][contains(.,'Products')]")
    WebElement inventoryPageDisplayed_xpath;

    @FindBy(xpath = "//button[contains(@id,'add-to-cart-sauce-labs-bike-light')]")
    WebElement addBackpack_xpath;

    @FindBy(xpath = "//a[contains(@class,'shopping_cart_link')]")
    WebElement validateCartIsEmpty_xpath;

    @FindBy(xpath = "//a[contains(@class,'shopping_cart_link')]")
    WebElement clickCart_xpath;


    public InventoryPage(WebDriver driver) {
        this.driver = driver;
    }

    public void inventoryPageDisplayed()
    {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(inventoryPageDisplayed_xpath));
        inventoryPageDisplayed_xpath.isDisplayed();
    }
    public  void  addItem()
    {
        addBackpack_xpath.click();

    }

    public void CartValidation()
    {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(validateCartIsEmpty_xpath));
        validateCartIsEmpty_xpath.isDisplayed();

        String cartCount = validateCartIsEmpty_xpath.getText();
        if (cartCount.contains("1")) {
            System.out.println("Item Added to cart");
        } else {
            System.out.println("No Item At Cart");
        }

    }

    public  void ClickCart()
    {
        clickCart_xpath.click();
    }

}
