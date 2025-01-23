package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CheckoutCompletePage {

    static WebDriver driver;

    @FindBy(xpath = "//button[@id='react-burger-menu-btn']")
    static WebElement burgermenu_xpath;

    @FindBy( id = "logout_sidebar_link")
    static WebElement logout_id;


    public CheckoutCompletePage(WebDriver driver) {
        this.driver = driver;
    }

    public static void clickburgermenu() {
     burgermenu_xpath.click();
    }

    public static void clicklogout() {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(logout_id));
        logout_id.click();
    }
}
