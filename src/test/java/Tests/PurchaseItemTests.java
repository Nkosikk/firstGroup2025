package Tests;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import java.io.IOException;

import static Pages.HomePage.*;

@Test
public class PurchaseItemTests extends Base {

    public void enterUsernameTests() {
        loginPage.enterUsername(readFromExcel.username);
    }

    @Test(dependsOnMethods = "enterUsernameTests")
    public void enterPasswordTests() {
        loginPage.enterPassword(readFromExcel.password);
        takesScreenshots.takesSnapShot(driver,"Login Page");
    }


    @Test(dependsOnMethods = "enterPasswordTests")
    public void clickLoginTests() {
        loginPage.clickLoginButton();
    }

    @Test(dependsOnMethods = "clickLoginTests")
    public void verifyLoginSuccess() {
        homePage.verifyProductTextIsDisplayedIHomePage();
        takesScreenshots.takesSnapShot(driver,"Home Page");
    }

    @Test(dependsOnMethods = "verifyLoginSuccess")
    public void addItemsToCart() throws IOException {
        homePage.addProductsToCart();
        this.getScreenShot();
    }

    @Test(dependsOnMethods = "addItemsToCart")
    public void verifyProductIsAddedToCart() {
        homePage.verifyProductIsAddedToCart();
    }

    @Test(dependsOnMethods = "verifyProductIsAddedToCart")
    public void navigateToCart() throws IOException {
        homePage.navigateToCart();
        this.getScreenShot();
    }

    @Test(dependsOnMethods = "navigateToCart")
    public void verifyCartIsDisplayedAndCheckOut() throws IOException {
        homePage.verifyCartIsDisplayedAndCheckOut();
        this.getScreenShot();
    }

    @Test(dependsOnMethods = "verifyCartIsDisplayedAndCheckOut")
    public void verifyCheckOutInfoAndFillIn() throws IOException {
        checkOutPage.verifyCheckOutInfoAndFillIn();
        this.getScreenShot();
    }

    @Test(dependsOnMethods = "verifyCheckOutInfoAndFillIn")
    public void verifyOverviewPageIsDisplayed() throws IOException {
        overviewPage.verifyOverviewPageIsDisplayed();
        this.getScreenShot();
    }

    @Test(dependsOnMethods = "verifyOverviewPageIsDisplayed")
    public void verifyTotal() throws IOException {
        overviewPage.verifyTotal();
        this.getScreenShot();
    }


    public void getScreenShot() throws IOException {
        String screenshotpath = null;
        try {
            screenshotpath = takeScreenshot(driver);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        //System.out.println(screenshotpath);
    }

    @AfterTest
    public void closeBrowser(){
        driver.quit();
    }
}

