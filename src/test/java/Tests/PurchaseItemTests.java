package Tests;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

@Test
public class PurchaseItemTests extends Base {

    @Test public void enterUsernameTests() {
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
    public void verifyproducts() { homePage.clickaddToCart();
   }

   @Test (dependsOnMethods = "verifyproducts")
   public void verifyremovebutton() {homePage.verifyRemovebutton();}

    @Test (dependsOnMethods = "verifyremovebutton")
    public void clickcartlink() {homePage.clickcartlink();}

    @Test (dependsOnMethods = "clickcartlink" )
    public void verifyyourcart() {CartPage.verifyyourcartisdisplayedCartPage();}

    @Test (dependsOnMethods = "verifyyourcart" )
    public void clickcheckoutbutton() {CartPage.clickcheckoutbutton();
    }

    @Test (dependsOnMethods = "clickcheckoutbutton")
    public void verifyyourInformation() {CheckoutInfoPage.verifyyourinformationisdisplayedCheckoutInfoPage();}

    @Test (dependsOnMethods = "verifyyourInformation")
    public void enterfirstname() {CheckoutInfoPage.enterfirstname("Atha");}

    @Test (dependsOnMethods = "enterfirstname")
    public void enterlastname() {CheckoutInfoPage.enterlastname("Mdoda");}

    @Test (dependsOnMethods = "enterlastname" )
    public void enterpostalcode() {CheckoutInfoPage.enterpostalcode("7750");}

    @Test (dependsOnMethods = "enterpostalcode")
    public void clickContinuebutton() {CheckoutInfoPage.clickContinuebutton();}

    @Test (dependsOnMethods = "clickContinuebutton")
    public void verifyCheckoutOverview() {CheckoutOverviewPage.verifyCheckoutOverviewisdisplayedCheckOverviewPage();}

    @Test (dependsOnMethods = "verifyCheckoutOverview")
    public void Totaliscalculatedcorrectly() {assertTrue(CheckoutOverviewPage.Totaliscalculatedcorrectly(),"Total doens't Match");
    }

//   @Test (dependsOnMethods = "Totaliscalculatedcorrectly")
 // public void clickCancelbutton() {assertFalse(CheckoutOverviewPage."Total does't Match");}


    @Test (dependsOnMethods = "verifyCheckoutOverview")
    public void clickfinishbutton() {CheckoutOverviewPage.clickfinishbutton();}

    @Test(dependsOnMethods = "clickfinishbutton")
    public void verifyThankYou() {CheckoutComplete.verifyThankYouisdisplayedCheckcomplete();}

    @Test(dependsOnMethods = "verifyThankYou")
    public void clickburgermenu() {CheckoutComplete.clickburgermenu();}

    @Test(dependsOnMethods = "clickburgermenu")
    public void clickLogout(){CheckoutComplete.clickLogout();}

    @AfterTest
    public void closeBrowser(){
        driver.quit();
    }

}
