package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutInfoPage {

    WebDriver driver;

    @FindBy(xpath = "//span[contains(.,'Checkout: Your Information')]")
    WebElement checkoutinfo_xpath;

    @FindBy(id = "first-name")
    WebElement firstname_id;

    @FindBy (id = "last-name")
    WebElement lastname_id;

    @FindBy (id = "postal-code")
    WebElement postalcode_id;

    @FindBy (id = "continue")
    WebElement continue_id;

    public CheckoutInfoPage(WebDriver driver) {
        this.driver = driver;
    }

    public void verifyyourinformationisdisplayedCheckoutInfoPage() {
        checkoutinfo_xpath.isDisplayed();
    }

    public void enterfirstname(String firstname) {
       firstname_id.sendKeys(firstname);
    }

    public void enterlastname (String lastname) {
        lastname_id.sendKeys(lastname);
    }

    public void enterpostalcode (String postalcode) {
        postalcode_id.sendKeys(postalcode);
    }

    public void clickContinuebutton () {
        continue_id.click();
    }
}
