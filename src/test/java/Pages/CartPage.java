package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CartPage {

    WebDriver driver;

    @FindBy(xpath = "//span[contains(.,'Your Cart')]")
    WebElement yourcart_xpath;

    @FindBy(id = "checkout")
    WebElement checkout_id;




    public CartPage(WebDriver driver) {
        this.driver = driver;
    }

    public void verifyyourcartisdisplayedCartPage() {
      //  new WebDriverWait(driver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(yourcart_xpath));
        yourcart_xpath.isDisplayed();
    }

    public void clickcheckoutbutton() {
        checkout_id.click();
    }


}
