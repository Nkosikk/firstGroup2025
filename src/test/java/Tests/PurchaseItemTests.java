package Tests;

import Pages.CheckoutOverviewPage;
import Utils.ScreenShot;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

@Test
public class PurchaseItemTests extends Base {

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
        screenShot.TakeScreenShot("sceenshot.png");
    }

    @Test(dependsOnMethods = "verifyLoginSuccess")
    public void AddFistItemToCart(){homePage.AddItemsToCart();
        screenShot.TakeScreenShot("sceenshot1.png");
    }

    @Test(dependsOnMethods = "AddFistItemToCart")
    public void clickCheckOutItem(){homePage.CheckItemOutOfCart();}

    @Test(dependsOnMethods = "clickCheckOutItem")
    public void verifyItemAdded(){homePage.CheckItemOutOfCart();}

    @Test(dependsOnMethods = "verifyItemAdded")
    public void verifyItemIsDisplayedInCartPage(){yourCartPage.verifyItemAddedToCartIsDisplayedOnCartPage();
        screenShot.TakeScreenShot("sceenshot2.png");}

    @Test(dependsOnMethods = "verifyItemIsDisplayedInCartPage")
    public void clickCheckoutTest(){yourCartPage.clickCheckoutButton(); }

    @Test(dependsOnMethods = "clickCheckoutTest")
    public void verifyYourInfoPageIsDisplayed(){captureInfoPage.verifyYourInfoTitleIsDisplayedInCaptureInfoPage();
        screenShot.TakeScreenShot("sceenshot3.png");}

    @Test(dependsOnMethods = "verifyYourInfoPageIsDisplayed")
    public void enterFirstnameTest(){captureInfoPage.enterFirstname("Sisho");}

    @Test(dependsOnMethods = "enterFirstnameTest")
    public void enterLastnameTest(){captureInfoPage.enterLastname("Khoza");}

    @Test(dependsOnMethods = "enterLastnameTest")
    public void enterPostalCodeTest(){captureInfoPage.enterPostalCode("3699");
        screenShot.TakeScreenShot("sceenshot4.png");}

    @Test(dependsOnMethods = "enterPostalCodeTest")
    public void clickContinueTest(){captureInfoPage.clickContinueButton(); }

    @Test(dependsOnMethods = "clickContinueTest")
    public void verifyTitleIsDisplayedInInfoTest(){checkoutOverviewPage.verifyYourInfoTitleIsDisplayedInCaptureInfoPage();}

    @Test(dependsOnMethods = "verifyTitleIsDisplayedInInfoTest")
    public void verifyItemIsDisplayedInInfoTest(){checkoutOverviewPage.verifyItemIsDisplayedInCaptureInfoPage();
        screenShot.TakeScreenShot("sceenshot5.png");}

    @Test(dependsOnMethods = "verifyItemIsDisplayedInInfoTest")
    public void verifyItemTotalPlusTaxEqualsTotalTest(){checkoutOverviewPage.verifyItemTotalPlusTaxEqualsTotal();}

    @Test(dependsOnMethods = "verifyItemTotalPlusTaxEqualsTotalTest")
    public void verifyOrderCompletedIsDisplayedTest(){checkoutCompletedPage.verifyThankYouPage();
        screenShot.TakeScreenShot("sceenshot6.png");}

    @Test(dependsOnMethods = "verifyOrderCompletedIsDisplayedTest")
    public void clickBackHomeTest(){checkoutCompletedPage.clickBackHomeButton();
        screenShot.TakeScreenShot("sceenshot7.png");}


    @AfterTest
    public void closeBrowser(){
        driver.quit();
    }

}
