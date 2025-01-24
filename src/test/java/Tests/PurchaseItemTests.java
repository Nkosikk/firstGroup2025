package Tests;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;

import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;

import java.io.File;

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
        takesScreenshots.takesSnapShot(driver,"Home Page");
    }


    @Test(dependsOnMethods = "verifyLoginSuccess")
    public void AddANItemToCart(){homePage.AddBagToCard();
        takesScreenshots.takesSnapShot(driver,"IteminCart");
    }

    @Test(dependsOnMethods = "AddANItemToCart")
    public void CheckItemAdded(){homePage.CheckRemovefromcartisdisplayed();}

    @Test(dependsOnMethods = "CheckItemAdded")
    public void GoToCart(){homePage.ClickOnCart();}

    @Test(dependsOnMethods = "GoToCart")
    public void CartPageTitleIsDisplayed(){cartPage.verifyCartTitleisDisplayed();
        takesScreenshots.takesSnapShot(driver,"CartPage");}

    @Test(dependsOnMethods = "CartPageTitleIsDisplayed")
    public void CheckoutItem(){cartPage.Checkout();}

    @Test(dependsOnMethods = "CheckoutItem")
    public void InformationPageTitleIsDisplayed(){infoPage.verifyInfoTitleisDisplayed();
       }

    @Test(dependsOnMethods = "InformationPageTitleIsDisplayed")
    public void enterFirstName() {
        infoPage.enterFirstname(readFromExcel.FirstName);
    }

    @Test(dependsOnMethods = "enterFirstName")
    public void enterSecondName() {
        infoPage.enterLastname(readFromExcel.LastName);
    }

    @Test(dependsOnMethods = "enterSecondName")
    public void enterPostalCode() {
        infoPage.enterPostalCode("test");
        takesScreenshots.takesSnapShot(driver,"Info Page");
    }

    @Test(dependsOnMethods = "enterPostalCode")
    public void ContinueOnInformationPage() {
        infoPage.ClickContinue();
    }
    @Test(dependsOnMethods = "ContinueOnInformationPage")
    public void CheckoutOverviewTitleIsdisplayed() {
        checkoutOverviewPage.verifyCheckoutOverviewTitleisDisplayed();
        takesScreenshots.takesSnapShot(driver,"Checkout overview");
    }
    @Test(dependsOnMethods = "CheckoutOverviewTitleIsdisplayed")
    public void testing() {
        double itemTotal = 15.99;
        double tax = 1.28;

        double ItemTotalPlusTax = itemTotal + tax;

        double total = 17.27;

        if (ItemTotalPlusTax == total) {
            System.out.println("Tests has passed");
            checkoutOverviewPage.ClickFinish();
        } else {
            System.out.println("Tests has Failed");
            checkoutOverviewPage.clickCancel();
        }
    }
    /*@Test(dependsOnMethods = "testing")
    public void ClickTheFinishButton() {
        checkoutOverviewPage.ClickFinish();
    }*/


   @Test(dependsOnMethods = "testing")
    public void CheckoutCompleteTitleIsDisplayed() {
        checkoutCompletPage.verifyCheckoutCompleteTitleisDisplayed();
       takesScreenshots.takesSnapShot(driver,"Checkout Complete");
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
