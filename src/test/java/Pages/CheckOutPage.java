package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CheckOutPage {
    WebDriver driver;

    @FindBy(xpath = "//span[@class='title'][contains(.,'Checkout: Your Information')]")
    WebElement checkOutTitle_xpath;

    @FindBy(xpath = "//input[@id='first-name']")
    WebElement firstName_xpath;

    @FindBy(xpath = "//input[@id='last-name']")
    WebElement lastName_xpath;

    @FindBy(xpath = "//input[@id='postal-code']")
    WebElement postCode_xpath;

    @FindBy(xpath = "//input[@id='continue']")
    WebElement continueCheckout_xpath;

    @FindBy(xpath = "//div[contains(@class,'summary_subtotal_label')]")
    WebElement totalItem;

    @FindBy(xpath = "//div[contains(@class,'summary_tax_label')]")
    WebElement taxAmount;

    @FindBy(xpath = "//div[contains(@class,'summary_total_label')]")
    WebElement totalAmount;

    @FindBy(xpath = "//button[contains(@id,'finish')]")
    WebElement btnFinish;

    @FindBy(xpath = "//button[@id='cancel']")
    WebElement btnCancel;

    @FindBy(xpath = "//h2[@class='complete-header'][contains(.,'Thank you for your order!')]")
    WebElement txtThankYou;

    @FindBy(xpath = "//button[@type='button'][contains(.,'Open Menu')]")
    WebElement openMenu;

    @FindBy(xpath = "//a[@id='logout_sidebar_link']")
    WebElement lnkLogout;

    public CheckOutPage(WebDriver driver) {
        this.driver = driver;
    }
    public void verifyCheckoutpage(){
        checkOutTitle_xpath.isDisplayed();
    }

    public void enterDetails(){
        firstName_xpath.sendKeys("Jabulane");
        lastName_xpath.sendKeys("Mtimkulu");
        postCode_xpath.sendKeys("1983");
    }

    public void clickContinue(){
        continueCheckout_xpath.click();
    }


    public void verifyTotalItem(){
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(totalAmount));

        String subTotalAmtItem = totalItem.getText().substring(13);
        String subTax = taxAmount.getText().substring(6);
        String subTotalPrice = totalAmount.getText().substring(8);

        double totalAmount_item = Double.parseDouble(subTotalAmtItem);
        double totalAmount_Price = Double.parseDouble(subTotalPrice);
        double txAmount = Double.parseDouble( subTax );
        double total = 0.0;

        total = totalAmount_item + txAmount;

        if( total == totalAmount_Price ){
            btnFinish.click();

            // verify confirmation dispatch
            txtThankYou.isDisplayed();

        }else{
            btnCancel.click();
        }

    }

    public void logout(){
        openMenu.click();

        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(lnkLogout));

        lnkLogout.click();
    }


}
