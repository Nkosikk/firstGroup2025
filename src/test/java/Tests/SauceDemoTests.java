package Tests;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

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
