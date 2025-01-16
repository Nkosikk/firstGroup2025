package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutOverviewPage {

    WebDriver driver;

    @FindBy(xpath = "//span[contains(.,'Checkout: Overview')]")
    WebElement CheckoutOverview_xpath;

    @FindBy(xpath = "//div[contains(@class,'summary_subtotal_label')]")
    WebElement ItemPrice_xpath;
    @FindBy(xpath = "//div[@data-test='tax-label']")
   WebElement TaxPrice_xpath;
    @FindBy(xpath = "//div[@data-test='total-label']")
    WebElement TotalPrice_xpath;
    @FindBy (xpath = "//button[@id='cancel']")
    WebElement CancelButton_xpath;

    @FindBy(id = "finish")
     WebElement finish_id;




    public CheckoutOverviewPage(WebDriver driver) {
        this.driver = driver;
    }

    public void verifyCheckoutOverviewisdisplayedCheckOverviewPage() {
        CheckoutOverview_xpath.isDisplayed();
    }


    public boolean Totaliscalculatedcorrectly() {
        String itemPriceStr = ItemPrice_xpath.getText().replaceAll("[^\\d.]", "");
        String taxStr = TaxPrice_xpath.getText().replaceAll("[^\\d.]", "");
        String totalStr = TotalPrice_xpath.getText().replaceAll("[^\\d.]", "");
    Double ItemPrice = Double.parseDouble(itemPriceStr );
    Double TaxPrice = Double.parseDouble(taxStr);
    Double TotalPrice = Double.parseDouble(totalStr);
    return ItemPrice + TaxPrice == TotalPrice;
    }

    public void clickCancelButton() {CancelButton_xpath.click();}

    public void clickfinishbutton() {
        finish_id.click();
    }
}
