package Tests;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

@Test
public class CheckOutTests extends Base {

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

    @Test(dependsOnMethods = "clickCheckOut")
    public void verifyCheckout(){
        checkOut.verifyCheckoutpage();
    }

    @Test(dependsOnMethods = "verifyCheckout")
    public void enterDetails(){
        checkOut.enterDetails();
    }

    @Test(dependsOnMethods = "enterDetails")
    public void continueCheckout(){
        checkOut.clickContinue();
    }

    @Test(dependsOnMethods = "continueCheckout")
    public void verifyTotal(){
        checkOut.verifyTotalItem();
    }

    @Test(dependsOnMethods = "verifyTotal")
    public void logout(){
        checkOut.logout();
    }

    @AfterTest
    public void closeBrowser(){
        //driver.quit();
    }


}
