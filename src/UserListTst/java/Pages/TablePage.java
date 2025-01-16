package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class TablePage {

    WebDriver driver;

    @FindBy(xpath = "//input[@name='user-name']")
    WebElement username_xpath;

    WebElement table = driver.findElement(By.id("tableId"));// Replace


    /html/body/table// 'tableId' with the actual table ID or locator


    public TablePage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterUsername(String username) {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(username_xpath));
        username_xpath.clear();
        username_xpath.sendKeys(username);

    }

    public void enterPassword(String password) {
        password_xpath.clear();
        password_xpath.sendKeys(password);

    }

    public void clickLoginButton() {
        loginButton_id.click();

    }

    public void verifyMessagedIsDIsplayedWhenLoginISIncorrect() {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(loginErrorMessage_xpath));

        loginErrorMessage_xpath.isDisplayed();

    }


}
