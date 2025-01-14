package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CheckoutCompletedPage {

    WebDriver driver;

    @FindBy(xpath = "//h2[contains(.,'Thank you for your order!')]")
    WebElement thankYouTitle_xpath;

    @FindBy(id = "back-to-products")
    WebElement backHomeButton_id;



    public CheckoutCompletedPage(WebDriver driver) {
        this.driver = driver;
    }



    public void verifyThankYouPage() {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(thankYouTitle_xpath));
        thankYouTitle_xpath.isDisplayed();

    }

    public void clickBackHomeButton() {
        backHomeButton_id.click();

    }


}
