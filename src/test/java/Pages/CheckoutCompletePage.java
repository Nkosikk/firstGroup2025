package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CheckoutCompletePage {

    WebDriver driver;

    @FindBy(xpath = "//span[@class='title'][contains(.,'Checkout: Complete!')]")
    WebElement CompleteText_xpath;

    @FindBy(xpath = "//button[contains(@id,'react-burger-menu-btn')]")
    WebElement menu_xpath;

    @FindBy(xpath = "//a[@id='logout_sidebar_link']")
    WebElement logout_xpath;

    public CheckoutCompletePage(WebDriver driver) {   this.driver = driver;}

    public void verifyCompleteTextDisplayed()
    {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(CompleteText_xpath));
        CompleteText_xpath.isDisplayed();
    }

    public void MenuClick() {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(menu_xpath));
        menu_xpath.click();
    }

    public void logout()
        {
            new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(logout_xpath));
            if (logout_xpath.isEnabled()) {
                logout_xpath.click();
            } else {
                System.out.println("Element is disabled");
            }
//
//    }
        }


}
