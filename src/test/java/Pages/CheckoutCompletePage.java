package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutCompletePage {

    WebDriver driver;

    @FindBy(xpath = "//h2[@class='complete-header'][contains(.,'Thank you for your order!')]")
    WebElement ThankYou_xpath;

    @FindBy(xpath = "//button[@id='react-burger-menu-btn']")
    WebElement burgermenu_xpath;

    @FindBy( id = "logout_sidebar_link")
    WebElement Logout_id;




    public CheckoutCompletePage(WebDriver driver) {
        this.driver = driver;
    }

    public void verifyThankYouisdisplayedCheckcomplete() {
        ThankYou_xpath.isDisplayed();
    }

    public void clickburgermenu() {
     burgermenu_xpath.click();
    }

    public void clickLogout() {
        Logout_id.click();
    }


}
