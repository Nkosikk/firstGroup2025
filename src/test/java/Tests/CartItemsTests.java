package Tests;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import java.time.Duration;

@Test
public class CartItemsTests extends Base{

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

    @Test(dependsOnMethods = "navigateToCart")
    public void verifyItemInCart(){
        cartPage.verifyCart();
    }

    @Test(dependsOnMethods = "verifyItemInCart")
    public void itemsInCart(){
        cartPage.itemInCart();
    }

    @Test(dependsOnMethods = "itemsInCart")
    public void clickCheckOut(){
        cartPage.clickCheckOut();
    }

    @AfterTest
    public void closeBrowser(){
        driver.quit();
    }
}
