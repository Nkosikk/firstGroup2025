package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CartPage {

    WebDriver driver;

    @FindBy(xpath = "//span[contains(.,'Your Cart')]")
    WebElement cartTitle_xpath;

    @FindBy(id = "checkout")
    WebElement checkout_id;

    public CartPage(WebDriver driver) {
        this.driver = driver;
    }

    public void verify_CartText_Is_Displayed_In_CartPage() {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(cartTitle_xpath));
        cartTitle_xpath.isDisplayed();

    }
 public void checkout_Button_Clicked(){
        checkout_id.click();

    }



}
