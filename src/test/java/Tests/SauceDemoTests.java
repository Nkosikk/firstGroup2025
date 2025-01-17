package Tests;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

@Test
public class SauceDemoTests extends Base{
    String username="standard_user";
    String password="secret_sauce";

/*    public void loginWithInvalidDetailsAndVerifyErrorMessageReturned(){
        loginPage.enterUsername(password);
        loginPage.enterPassword(username);
        loginPage.clickLoginButton();
        loginPage.verifyMessagedIsDIsplayedWhenLoginISIncorrect();

    }*/


    public void loginWithValidDetailAndVerifyHomePageIsDisplayed(){
        /*1.Login with username “standard_user” and Password as “secret_sauce”2.Verify that you are logged in 3.Take a screenshot*/
        loginPage.enterUsername(username);
        loginPage.enterPassword(password);
        loginPage.clickLoginButton();
        homePage.verifyProductTextIsDisplayedIHomePage();
        takesScreenshots.takesSnapShot(driver,"LoggedIn");
    }

    @Test(dependsOnMethods = "loginWithValidDetailAndVerifyHomePageIsDisplayed")
    public void addItemsToCartAndVerifyItemIsAdded(){
        /*4.Add any item of your choice to CART5.Verify that your item was added to the CART6.Take a screenshot*/
        homePage.addItemToCart();
        homePage.verifyItemAddedToCart();
        takesScreenshots.takesSnapShot(driver,"ItemAddedToCart");

    }
    @AfterTest
    public void closeBrowser(){
        driver.quit();
    }

}
