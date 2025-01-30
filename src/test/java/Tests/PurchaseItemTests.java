package Tests;

import Utils.TakesScreenshots;
import Utils.ReadFromExcel;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import java.io.IOException;

import static Pages.HomePage.*;

@Test
public class PurchaseItemTests extends Base {

    public void enterUsernameTests() {
        loginPage.enterUsername("standard_user");
        //loginPage.enterUsername(readFromExcel.username);
    }

    @Test(dependsOnMethods = "enterUsernameTests")
    public void enterPasswordTests() {
        loginPage.enterPassword("secret_sauce");
        //loginPage.enterPassword(readFromExcel.password);
        takesScreenshots.takeScreenshot(driver,"Login Page");
    }


    @Test(dependsOnMethods = "enterPasswordTests")
    public void clickLoginTests() {
        loginPage.clickLoginButton();
    }

    @Test(dependsOnMethods = "clickLoginTests")
    public void verifyLoginSuccess() {
        homePage.verifyProductTextIsDisplayedIHomePage();
        takesScreenshots.takeScreenshot(driver,"Home Page");
    }

    @Test(dependsOnMethods = "verifyLoginSuccess")
    public void addItemsToCart() throws IOException {
        homePage.addProductsToCart();
        takesScreenshots.takeScreenshot(driver,"Items Page");
        //this.getScreenShot();
    }

    @Test(dependsOnMethods = "addItemsToCart")
    public void verifyProductIsAddedToCart() {
        homePage.verifyProductIsAddedToCart();
    }

    @Test(dependsOnMethods = "verifyProductIsAddedToCart")
    public void navigateToCart() throws IOException {
        homePage.navigateToCart();
        takesScreenshots.takeScreenshot(driver,"Cart");
        //this.getScreenShot();
    }

    @Test(dependsOnMethods = "navigateToCart")
    public void verifyCartIsDisplayedAndCheckOut() throws IOException {
        homePage.verifyCartIsDisplayedAndCheckOut();
    }

    @Test(dependsOnMethods = "verifyCartIsDisplayedAndCheckOut")
    public void verifyCheckOutInfoAndFillIn() throws IOException {
        checkOutPage.verifyCheckOutInfoAndFillIn();

    }

    @Test(dependsOnMethods = "verifyCheckOutInfoAndFillIn")
    public void verifyOverviewPageIsDisplayed() throws IOException {
        overviewPage.verifyOverviewPageIsDisplayed();
        takesScreenshots.takeScreenshot(driver,"Overview Page");
    }

    @Test(dependsOnMethods = "verifyOverviewPageIsDisplayed")
    public void verifyTotal() throws IOException {
        overviewPage.verifyTotal();
    }

   /* @Test(dependsOnMethods = "verifyTotal")
    public void DisplayReport() throws IOException {
        extentReportManager.

    }*/


    @AfterTest
    public void closeBrowser(){
        driver.quit();
    }
}

