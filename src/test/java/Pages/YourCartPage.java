package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class YourCartPage {

    WebDriver driver;

    @FindBy(xpath = "//span[contains(.,'Your Cart')]")
    WebElement yourCartTitle_xpath;

    public YourCartPage(WebDriver driver) {
        this.driver = driver;
    }



    public void verifyYourCartTextIsDisplayedOnCartPage() {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(yourCartTitle_xpath));
        yourCartTitle_xpath.isDisplayed();

    }


}
