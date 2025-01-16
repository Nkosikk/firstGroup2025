package Tests;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import java.io.File;
import org.apache.commons.io.FileUtils;
import java.text.SimpleDateFormat;
import java.util.Date;

@Test
public class SauceDemoTests extends Base{
    String username="standard_user";
    String password="secret_sauce";

    public void loginWithInvalidDetailsAndVerifyErrorMessageReturned(){
        loginPage.enterUsername(password);
        loginPage.enterPassword(username);
        loginPage.clickLoginButton();
        loginPage.verifyMessagedIsDIsplayedWhenLoginISIncorrect();
    }


    public void loginWithValidDetailAndVerifyHomePageIsDisplayed(){
        loginPage.enterUsername(username);
        loginPage.enterPassword(password);
        loginPage.clickLoginButton();
        homePage.verifyProductTextIsDisplayedIHomePage();
    }



    @AfterTest
    public void closeBrowser(){
        driver.quit();
    }

}
