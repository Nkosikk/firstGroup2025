package Tests;

import Pages.CartPage;
import Pages.CompletePage;
import org.testng.annotations.Test;


public class PurchaseItem extends Base
{
    @Test
    public void enterUsername(){ loginPage.enterUsername("standard_user");

    }
    @Test(dependsOnMethods = "enterUsername")
    public void enterPassword(){loginPage.enterPassword("secret_sauce");}

    @Test(dependsOnMethods = "enterPassword")
    public void clickEnter(){loginPage.clickLoginButton();}

    @Test(dependsOnMethods = "clickEnter")
    public void PageIsDisplayed(){inventoryPage.inventoryPageDisplayed();}

    @Test(dependsOnMethods = "clickEnter")
    public void EmptyCart(){inventoryPage.CartValidation();}

     @Test(dependsOnMethods = "PageIsDisplayed")
    public void selectItem(){inventoryPage.addItem();}

    @Test(dependsOnMethods = "selectItem")
    public void ProductAdded(){inventoryPage.CartValidation();}

    @Test(dependsOnMethods = "ProductAdded")
    public void ClickCart(){inventoryPage.ClickCart();}

    @Test(dependsOnMethods = "ClickCart")
    public void CartDisplayed(){cartPage.CartPageDisplayed();}

    @Test(dependsOnMethods = "CartDisplayed")
    public void CartValidation(){cartPage.CartValidationProduct();}

    @Test(dependsOnMethods = "CartValidation")
    public void checkout(){cartPage.checkout();}

    @Test(dependsOnMethods = "checkout")
    public void CheckoutPage (){checkOutPage.CheckOutPageDisplayed();}

    @Test(dependsOnMethods = "checkout")
    public void firstname(){checkOutPage.EnterFirstName("Gumi");}

    @Test(dependsOnMethods = "firstname")
    public void lastname(){checkOutPage.EnterLastName("Hlungwane");}

    @Test(dependsOnMethods = "lastname")
    public void postcode(){checkOutPage.EnterPostalCode("2120");}

    @Test(dependsOnMethods = "postcode")
    public void click(){checkOutPage.clickContinueButton();}

    @Test(dependsOnMethods = "click")
    public void CheckoutOverviewPage(){checkoutOverview.CheckoutOverviewPage();}

    @Test(dependsOnMethods = "CheckoutOverviewPage")
    public void TotalVerification(){checkoutOverview.VerifyTotalAmount();}

    @Test(dependsOnMethods = "TotalVerification")
    public void DropDown(){completePage.DropDown();}

    @Test(dependsOnMethods = "DropDown")
    public void Logout(){completePage.Logout();}


}
