package Tests;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

@Test
public class PurchaseItemTests extends Base {

    @Test
    public void enterUsernameTests() {
        loginPage.enterUsername("standard_user");
    }

    @Test(dependsOnMethods = "enterUsernameTests")
    public void enterPasswordTests() {
        loginPage.enterPassword("secret_sauce");
    }

    @Test(dependsOnMethods = "enterPasswordTests")
    public void clickLoginTests() {
        loginPage.clickLoginButton();
    }

    @Test(dependsOnMethods = "clickLoginTests")
    public void verifyLoginSuccess() {
        homePage.verifyProductTextIsDisplayedIHomePage();
    }

    @Test(dependsOnMethods = "verifyLoginSuccess")
    public void addToCart(){
        homePage.addToCart();
    }

    @Test(dependsOnMethods ="addToCart")
    public void verifyProductIsAdded(){
        homePage.verifyProductIsAddedOnCart();
    }

    @Test(dependsOnMethods ="verifyProductIsAdded")
    public void navigateToCart(){
        homePage.navigateToCart();
    }



    @AfterTest
    public void closeBrowser(){
        driver.quit();
    }

}
