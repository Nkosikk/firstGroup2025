package Pages;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
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

    @FindBy(xpath = "//span[contains(.,'1')]")
    WebElement cartContainsCount_xpath;

    @FindBy(id = "add-to-cart-sauce-labs-backpack")
    WebElement addToCartButton_id;

    @FindBy(xpath ="//a[@data-test='shopping-cart-link']")
    WebElement checkOut_link;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void AddItemsToCart(){
        addToCartButton_id.click();
    }

    public void CheckItemOutOfCart(){
        checkOut_link.click();
    }



    public void verifyProductTextIsDisplayedIHomePage() {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(productTitle_xpath));
        productTitle_xpath.isDisplayed();
    }

    public void verifyItemIsAddedToCart(){
        cartContainsCount_xpath.isDisplayed();
    }




}
