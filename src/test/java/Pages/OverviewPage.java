package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class OverviewPage {
    WebDriver driver;

    @FindBy(xpath = "//span[contains(.,'Checkout: Overview')]")
    WebElement overview;

    @FindBy(xpath = "//div[contains(@data-test,'subtotal-label')]")
    WebElement subTotal;

    @FindBy(xpath = "//div[contains(@data-test,'tax-label')]")
    WebElement tax;

    @FindBy(xpath = "//div[@data-test='total-label']")
    WebElement total;

    @FindBy(xpath = "//button[@id='finish']")
    WebElement btn_Finish;

    @FindBy(xpath = "//button[@id='cancel']")
    WebElement btn_Cancel;

    public void verifyOverviewPageIsDisplayed() {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(overview));
        overview.isDisplayed();
    }

    public void verifyTotal() {

        String strSubTotal = subTotal.getText();
        String justSubTotal = strSubTotal.replaceAll("[^\\d.]", "");
        float fTotal = Float.parseFloat(justSubTotal);

        String strTax = tax.getText();
        String justTax = strTax.replaceAll("[^\\d.]", "");
        float fTax = Float.parseFloat(justTax);

        float gTotal = fTotal + fTax;

        System.out.println(fTotal);
        System.out.println(fTax);
        System.out.println(gTotal);

        String strTotal = total.getText();
        String justTotal =  strTotal.replaceAll("[^\\d.]", "");
        float fltTotal = Float.parseFloat(justTotal);
        Assert.assertEquals(gTotal, fltTotal, "Item total and tax not equal to Total");

        if (gTotal == fltTotal) {
            System.out.println("Item total and tax equal to Total");
                btn_Finish.click();
                assert true;
        } else {
            Assert.fail("Item total and tax NOT equal to Total");
            btn_Cancel.click();
            assert false;
        }

    }

}
