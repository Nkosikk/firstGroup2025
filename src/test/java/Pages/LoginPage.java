package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage {

    WebDriver driver;

    @FindBy(xpath = "//input[@name='user-name']")
    WebElement username_xpath;

    @FindBy(xpath = "//input[@id='password']")
    WebElement password_xpath;

    @FindBy(id = "login-button")
    WebElement loginButton_id;

    @FindBy(xpath = "//h3[contains(.,'Epic sadface: Username and password do not match any user in this service')]")
    WebElement loginErrorMessage_xpath;

    public LoginPage(WebDriver driver) {
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
