package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class YourCartPage {

    WebDriver driver;

    @FindBy(xpath = "//div[@class='inventory_item_name'][contains(.,'Sauce Labs Backpack')]")
    WebElement itemAddedToCartTitle_xpath;

    @FindBy(id = "checkout")
    WebElement checkoutButton_id;

    public YourCartPage(WebDriver driver) {
        this.driver = driver;
    }



    public void verifyItemAddedToCartIsDisplayedOnCartPage() {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(itemAddedToCartTitle_xpath));
        itemAddedToCartTitle_xpath.isDisplayed();

    }

    public void clickCheckoutButton() {
        checkoutButton_id.click();

    }


}
