package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CheckOutPage
{
    WebDriver driver;

    @FindBy(xpath = "//span[@class='title'][contains(.,'Checkout: Your Information')]")
    WebElement CheckOutPageDisplayed_xpath;

    @FindBy(xpath = "//input[contains(@id,'first-name')]")
    WebElement FirstName_xpath;

    @FindBy(xpath = "//input[contains(@id,'last-name')]")
    WebElement LastName_xpath;

    @FindBy(xpath = "//input[contains(@id,'postal-code')]")
    WebElement PostalCode_xpath;

    @FindBy(xpath = "//input[contains(@id,'continue')]")
    WebElement ClickContinue_xpath;


    public CheckOutPage(WebDriver driver)
    {
        this.driver = driver;
    }

    public void CheckOutPageDisplayed()
    {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(CheckOutPageDisplayed_xpath));
        CheckOutPageDisplayed_xpath.isDisplayed();
    }


    public void EnterFirstName(String firstName) {
        FirstName_xpath.sendKeys(firstName);
    }

    public void EnterLastName(String lastname) {
        LastName_xpath.sendKeys(lastname);
    }

    public void EnterPostalCode(String postcode) {
        PostalCode_xpath.sendKeys(postcode);
    }

    public  void  clickContinueButton()
    {
        ClickContinue_xpath.click();

    }

}
