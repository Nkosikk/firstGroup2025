package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutCompletePage {

    WebDriver driver;

    @FindBy(xpath = "//h2[@class='complete-header'][contains(.,'Thank you for your order!')]")
    static WebElement ThankYouFor_xpath;

    @FindBy(xpath = "//button[@id='react-burger-menu-btn']")
    static WebElement burgermenu_xpath;

    @FindBy( id = "logout_sidebar_link")
    static WebElement Logout_id;




    public CheckoutCompletePage(WebDriver driver) {
        this.driver = driver;
    }

    public static void verifyThankYouForisdisplayedCheckCompletePage() {
        ThankYouFor_xpath.isDisplayed();
    }

    public static void clickburgermenu() {
     burgermenu_xpath.click();
    }

    public static void clickLogout() {
        Logout_id.click();
    }


}
