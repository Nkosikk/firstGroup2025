package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CaptureInfoPage {

    WebDriver driver;

    @FindBy(xpath = "//span[contains(.,'Checkout: Your Information')]")
    WebElement yourInfoTitle_xpath;

    @FindBy(xpath = "//input[@name='firstName']")
    WebElement firstname_xpath;

    @FindBy(xpath = "//input[@id='last-name']")
    WebElement lastname_xpath;

    @FindBy(xpath = "//input[@id='postal-code']")
    WebElement postalCode_xpath;

    @FindBy(id = "continue")
    WebElement continueButton_id;



    public CaptureInfoPage(WebDriver driver) {
        this.driver = driver;
    }



    public void verifyYourInfoTitleIsDisplayedInCaptureInfoPage() {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(yourInfoTitle_xpath));
        yourInfoTitle_xpath.isDisplayed();

    }

    public void enterFirstname(String firstname) {
        firstname_xpath.clear();
        firstname_xpath.sendKeys(firstname);

    }

    public void enterLastname(String lastname) {
        lastname_xpath.clear();
        lastname_xpath.sendKeys(lastname);

    }

    public void enterPostalCode(String postalcode) {
        postalCode_xpath.clear();
        postalCode_xpath.sendKeys(postalcode);

    }

    public void clickContinueButton() {
        continueButton_id.click();

    }


}
