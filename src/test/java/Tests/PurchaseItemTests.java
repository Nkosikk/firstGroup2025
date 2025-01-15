package Tests;

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
    }

    @Test(dependsOnMethods = "verifyLoginSuccess")
    public void Add_To_Cart(){homePage.Click_Add_To_Cart_Button();}

    @Test(dependsOnMethods = "Add_To_Cart")
    public void clickShoppingCart(){homePage.Click_Shopping_Cart_Button();}
    
    @Test(dependsOnMethods = "clickShoppingCart")
    public void verifyCartTextIsDisplayed(){cartPage.verify_CartText_Is_Displayed_In_CartPage();}

    @Test(dependsOnMethods = "verifyCartTextIsDisplayed")
    public void CheckoutButton(){cartPage.checkout_Button_Clicked();}

    @Test(dependsOnMethods = "CheckoutButton")
    public void checkoutTextDisplayed(){checkoutPage.Checkout_Text_Is_Displayed();}

    @Test(dependsOnMethods = "checkoutTextDisplayed" )
    public void enterFirstNameTest(){checkoutPage.EnterFirstName("Tumi");}

    @Test(dependsOnMethods = "enterFirstNameTest")
    public void enterLastNameTest(){checkoutPage.EnterLastName("Morei");}

    @Test(dependsOnMethods = "enterLastNameTest")
    public void enterPostCode(){checkoutPage.EnterPostalCode("9301");}

    @Test(dependsOnMethods = "enterPostCode")
    public void clickContinueTest(){checkoutPage.ContinueButtonClicked();}

    @Test(dependsOnMethods = "clickContinueTest")
    public void verifyOverviewTextDisplayed(){checkOutOverviewPage.verifyOverviewtextDisplayed();}

    @Test(dependsOnMethods = "verifyOverviewTextDisplayed")
    public void verifyItemIsAdded(){checkOutOverviewPage.ItemAddedVerification();}

    @Test(dependsOnMethods = "verifyItemIsAdded")
    public void priceTotal(){checkOutOverviewPage.TotalAmount();}

    @Test(dependsOnMethods = "priceTotal")
    public void verifyCompleteTextDisplayed(){checkoutCompletePage.verifyCompleteTextDisplayed();}

    @Test(dependsOnMethods = "verifyCompleteTextDisplayed")
    public void menu(){checkoutCompletePage.MenuClick();}

    @Test(dependsOnMethods = "menu")
    public void loginButton(){checkoutCompletePage.logout();}







//    @AfterTest
//    public void closeBrowser(){
//        driver.quit();
//    }

}
