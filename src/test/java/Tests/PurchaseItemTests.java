package Tests;

import org.openqa.selenium.OutputType;

import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;

import java.io.File;

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
    }

    TakesScreenshot screenshot = (TakesScreenshot)driver;
    File source = screenshot.getScreenshotAs(OutputType.FILE);

    @Test(dependsOnMethods = "verifyLoginSuccess")
    public void AddANItemToCart(){homePage.AddBagToCard();}

    @Test(dependsOnMethods = "AddANItemToCart")
    public void CheckItemAdded(){homePage.CheckRemovefromcartisdisplayed();}

    @Test(dependsOnMethods = "CheckItemAdded")
    public void GoToCart(){homePage.ClickOnCart();}

    @Test(dependsOnMethods = "GoToCart")
    public void CartPageTitleIsDisplayed(){cartPage.verifyCartTitleisDisplayed();}

    @Test(dependsOnMethods = "CartPageTitleIsDisplayed")
    public void CheckoutItem(){cartPage.Checkout();}

    @Test(dependsOnMethods = "CheckoutItem")
    public void InformationPageTitleIsDisplayed(){infoPage.verifyInfoTitleisDisplayed();}

    @Test(dependsOnMethods = "InformationPageTitleIsDisplayed")
    public void enterFirstName() {
        infoPage.enterFirstname("Linda");
    }

    @Test(dependsOnMethods = "enterFirstName")
    public void enterSecondName() {
        infoPage.enterLastname("Ntanjana");
    }

    @Test(dependsOnMethods = "enterSecondName")
    public void enterPostalCode() {
        infoPage.enterPostalCode("7100");
    }

    @Test(dependsOnMethods = "enterPostalCode")
    public void ContinueOnInformationPage() {
        infoPage.ClickContinue();
    }
    @Test(dependsOnMethods = "ContinueOnInformationPage")
    public void CheckoutOverviewTitleIsdisplayed() {
        checkoutOverviewPage.verifyCheckoutOverviewTitleisDisplayed();
    }
    @Test(dependsOnMethods = "CheckoutOverviewTitleIsdisplayed")
    public void ClickTheFinishButton() {
        checkoutOverviewPage.ClickFinish();
    }
    @Test(dependsOnMethods = "ClickTheFinishButton")
    public void CheckoutCompleteTitleIsDisplayed() {
        checkoutCompletPage.verifyCheckoutCompleteTitleisDisplayed();
    }
    @Test(dependsOnMethods = "CheckoutCompleteTitleIsDisplayed")
    public void GoBackToHome() {
        checkoutCompletPage.ClickBackToHomeButton();
    }
    @Test(dependsOnMethods = "GoBackToHome")
    public void verifyBackToHome() {
        homePage.verifyProductTextIsDisplayedIHomePage();
    }

    @Test(dependsOnMethods = "verifyBackToHome")
    public void ClickTheBurgerMenu() {
        homePage.ClickBurgerMenu();
    }
    @Test(dependsOnMethods = "ClickTheBurgerMenu")
    public void Logout() {
        homePage.ClickLogout();
    }
    @Test(dependsOnMethods = "Logout")
    public void VerifyUserIsLoggedOut() {
        loginPage.verifyLoginpageTitleisDisplayed();
    }








    //@AfterTest
    //public void closeBrowser(){
       // driver.quit();
    //}

}
