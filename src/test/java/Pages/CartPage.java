package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CartPage
{
    WebDriver driver;

    @FindBy(xpath = "//button[contains(@id,'checkout')]")
    WebElement CheckOutButton_xpath;

    @FindBy(xpath = "//div[@class='inventory_item_name'][contains(.,'Sauce Labs Bike Light')]")
    WebElement CartValidationProduct_xpath;

    public CartPage(WebDriver driver)
    {
        this.driver = driver;
    }

    public void CartPageDisplayed()
    {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(CheckOutButton_xpath));
        CheckOutButton_xpath.isDisplayed();
    }

    public void CartValidationProduct()
    {
        String itemName = CartValidationProduct_xpath.getText();
        if (itemName.contains("Sauce Labs Bike Light")) {
            System.out.println("Correct Item Added");
        } else {
            System.out.println("Incorrect item added");
        }

    }

    public  void  checkout()
    {
        CheckOutButton_xpath.click();

    }


}
