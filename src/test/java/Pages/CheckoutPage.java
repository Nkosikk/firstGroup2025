package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CheckoutPage {

    WebDriver driver;


    @FindBy(xpath = "//span[contains(.,'Checkout: Your Information')]")
    WebElement checkoutTitle_xpath;

    @FindBy(xpath = "//input[@name='firstName']")
    WebElement firstname_xpath;

    @FindBy(xpath = "//input[@name='lastName']")
    WebElement lastname_xpath;

    @FindBy(xpath = "//input[@name='postalCode']")
    WebElement postalCode_xpath;

    @FindBy(id = "continue")
    WebElement continue_id;

    public CheckoutPage(WebDriver driver) {
        this.driver = driver;
    }

    public void Checkout_Text_Is_Displayed()
    {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(checkoutTitle_xpath));
        checkoutTitle_xpath.isDisplayed();
    }

    public void EnterFirstName(String firstname)
    {
        firstname_xpath.clear();
        firstname_xpath.sendKeys(firstname);
    }

    public void EnterLastName(String lastname)
    {
        lastname_xpath.clear();
        lastname_xpath.sendKeys(lastname);
    }

    public void EnterPostalCode(String postcode)
    {
        postalCode_xpath.clear();
        postalCode_xpath.sendKeys(postcode);
    }

    public void ContinueButtonClicked()
    {
        continue_id.click();
    }
}
