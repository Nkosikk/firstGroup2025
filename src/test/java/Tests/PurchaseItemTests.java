package Tests;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

@Test
public class PurchaseItemTests extends Base {

    public void enterUsernameTests() {
        loginPage.enterUsername(readFromExcel.username);
    }

    @Test(dependsOnMethods = "enterUsernameTests")
    public void enterPasswordTests() {
        loginPage.enterPassword(readFromExcel.password);
    }

    @Test(dependsOnMethods = "enterPasswordTests")
    public void clickLoginTests() {
        loginPage.clickLoginButton();
    }

    @Test(dependsOnMethods = "clickLoginTests")
    public void verifyLoginSuccess() {

        homePage.verifyProductTextIsDisplayedIHomePage();
        takesScreenshots.takesSnapShot(driver,"screenshot");
    }

    @Test(dependsOnMethods = "verifyLoginSuccess")
    public void AddFistItemToCart(){homePage.AddItemsToCart();
        takesScreenshots.takesSnapShot(driver,"screenshot");
    }

    @Test(dependsOnMethods = "AddFistItemToCart")
    public void clickCheckOutItem(){homePage.CheckItemOutOfCart();}

    @Test(dependsOnMethods = "clickCheckOutItem")
    public void verifyItemAdded(){homePage.CheckItemOutOfCart();}

    @Test(dependsOnMethods = "verifyItemAdded")
    public void verifyItemIsDisplayedInCartPage(){yourCartPage.verifyItemAddedToCartIsDisplayedOnCartPage();
        takesScreenshots.takesSnapShot(driver,"screenshot");}

    @Test(dependsOnMethods = "verifyItemIsDisplayedInCartPage")
    public void clickCheckoutTest(){yourCartPage.clickCheckoutButton(); }

    @Test(dependsOnMethods = "clickCheckoutTest")
    public void verifyYourInfoPageIsDisplayed(){captureInfoPage.verifyYourInfoTitleIsDisplayedInCaptureInfoPage();
        takesScreenshots.takesSnapShot(driver,"screenshot");}

    @Test(dependsOnMethods = "verifyYourInfoPageIsDisplayed")
    public void enterFirstnameTest(){captureInfoPage.enterFirstname(readFromExcel.firstName);}

    @Test(dependsOnMethods = "enterFirstnameTest")
    public void enterLastnameTest(){captureInfoPage.enterLastname(readFromExcel.lastName);}

    @Test(dependsOnMethods = "enterLastnameTest")
    public void enterPostalCodeTest(){captureInfoPage.enterPostalCode(readFromExcel.zipCode);
        takesScreenshots.takesSnapShot(driver,"screenshot");}

    @Test(dependsOnMethods = "enterPostalCodeTest")
    public void clickContinueTest(){captureInfoPage.clickContinueButton(); }

    @Test(dependsOnMethods = "clickContinueTest")
    public void verifyTitleIsDisplayedInInfoTest(){checkoutOverviewPage.verifyYourInfoTitleIsDisplayedInCaptureInfoPage();}

    @Test(dependsOnMethods = "verifyTitleIsDisplayedInInfoTest")
    public void verifyItemIsDisplayedInInfoTest(){checkoutOverviewPage.verifyItemIsDisplayedInCaptureInfoPage();
        takesScreenshots.takesSnapShot(driver,"screenshot");}

    @Test(dependsOnMethods = "verifyItemIsDisplayedInInfoTest")
    public void verifyItemTotalPlusTaxEqualsTotalTest(){checkoutOverviewPage.verifyItemTotalPlusTaxEqualsTotal();}

    @Test(dependsOnMethods = "verifyItemTotalPlusTaxEqualsTotalTest")
    public void verifyOrderCompletedIsDisplayedTest(){checkoutCompletedPage.verifyThankYouPage();
        takesScreenshots.takesSnapShot(driver,"screenshot");}

    @Test(dependsOnMethods = "verifyOrderCompletedIsDisplayedTest")
    public void clickBackHomeTest(){checkoutCompletedPage.clickBackHomeButton();
        takesScreenshots.takesSnapShot(driver,"screenshot");}


    @AfterTest
    public void closeBrowser(){
        driver.quit();
    }

}
