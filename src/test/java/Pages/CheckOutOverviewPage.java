package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CheckOutOverviewPage {

    WebDriver driver;

    @FindBy(xpath = "//span[contains(.,'Checkout: Overview')]")
    WebElement checkoutOverviewTitle_xpath;

    @FindBy(xpath = "(//div[contains(.,'Sauce Labs Backpack')])[9]")
    WebElement itemadded_xpath;

    @FindBy(xpath = "//div[@class='summary_subtotal_label'][contains(.,'Item total: $29.99')]")
    WebElement itemTotal_xpath;

    @FindBy(xpath = "//div[@class='summary_tax_label'][contains(.,'Tax: $2.40')]")
    WebElement tax_xpath;

    @FindBy(xpath = "//div[@class='summary_total_label'][contains(.,'Total: $32.39')]")
    WebElement totalincTax_xpath;

    @FindBy(xpath = "//button[@id='finish']")
    WebElement finish_xpath;

    @FindBy(xpath = "//button[@id='cancel']")
    WebElement cancel_xpath;

    @FindBy(xpath = "//h2[@class='complete-header'][contains(.,'Thank you for your order!')]")
    WebElement ThankYouText_xpath;

    public CheckOutOverviewPage(WebDriver driver) {   this.driver = driver;}

    public void verifyOverviewtextDisplayed()
    {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(checkoutOverviewTitle_xpath));
        checkoutOverviewTitle_xpath.isDisplayed();
    }

    public void ItemAddedVerification()
    {
         itemadded_xpath.isDisplayed();
    }

    private static double parseAmount(String itemTotal) {
        String cleanedText = itemTotal.replaceAll("[^0-9.]", "");
        return Double.parseDouble(cleanedText);
    }

    public void TotalAmount()
    {
        String Item_Total = itemTotal_xpath.getText(); // item total displayed before adding the tax value
        String Tax_Value = tax_xpath.getText();
        String Total_TaxValue = totalincTax_xpath.getText();


        //We use the parseAmount() method to remove any non-numeric characters (such as the $ symbol)
        double totalValue = parseAmount(Item_Total);
        double taxValue = parseAmount(Tax_Value);
        double totaltaxvalue = parseAmount(Total_TaxValue);

        //Define the expected total
        double expectedTotal = totaltaxvalue;

        // Calculate the actual total
        double actualTotal = totalValue + taxValue;

        if (expectedTotal == actualTotal) {
            assert true;
            finish_xpath.click();
            ThankYouText_xpath.isDisplayed();
        } else {
            cancel_xpath.click();
            assert false;
        }

//        //Verify total
//        if (Math.abs(actualTotal - expectedTotal) < 0.01) { // Allow small tolerance for floating-point comparison
//            finish_xpath.click();
//            assert true;
//            ThankYouText_xpath.isDisplayed();
//        } else {
//            assert false;
//          cancel_xpath.click();
//        }






    }




}
