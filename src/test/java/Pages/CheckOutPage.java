package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CheckOutPage {
    WebDriver driver;

    @FindBy(xpath = "//span[contains(.,'Checkout: Your Information')]")
    WebElement CheckOutPage;

    @FindBy(xpath = "//input[@name='firstName']")
    WebElement firstName;

    @FindBy(xpath = "//input[@name='lastName']")
    WebElement lastName;

    @FindBy(xpath = "//input[@name='postalCode']")
    WebElement postCode;

    @FindBy(xpath = "//input[@value='Continue']")
    WebElement Btn_Continue;

    public CheckOutPage(WebDriver driver) {
        this.driver = driver;
    }


    public void verifyCheckOutInfoAndFillIn() {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(CheckOutPage));
        CheckOutPage.isDisplayed();
        firstName.sendKeys("Lebza");
        lastName.sendKeys("Test");
        postCode.sendKeys("1234");
        Btn_Continue.click();
    }


}
