package Pages;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
public class LoginPage {
    WebDriver driver;

    @FindBy(xpath = "//input[contains(@id,'user-name')]")
    WebElement username_xpath;

    @FindBy(xpath = "//input[contains(@id,'password')]")
    WebElement password_xpath;

    @FindBy(xpath = "//input[contains(@id,'login-button')]")
    WebElement loginButton_xpath;

    @FindBy(xpath = "//h3[@data-test='error'][contains(.,'Epic sadface: Username and password do not match any user in this service')]")
    WebElement loginErrorMessageDisplayed_xpath;

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
        loginButton_xpath.click();
    }

    public void verifyMessageIsDisplayedWhenLoginIsIncorrect() {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(loginErrorMessageDisplayed_xpath));
        loginErrorMessageDisplayed_xpath.isDisplayed();
    }



}
