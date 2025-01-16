package Tests;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

@Test
public class SauceDemoTest extends Base
{

    String username = "standard_user";
    String password = "secret_sauce";

    public void loginWithInvalidDetails()
    {
        loginPage.enterUsername(password);
        loginPage.enterPassword(username);
        loginPage.clickLoginButton();
        loginPage.verifyMessageIsDisplayedWhenLoginIsIncorrect();

    }

    public void loginWithValidDetails()
    {
        loginPage.enterUsername(username);
        loginPage.enterPassword(password);
        loginPage.clickLoginButton();
        inventoryPage.inventoryPageDisplayed();

    }

    @AfterTest
    public void Close() {
        driver.quit();
    }
}
