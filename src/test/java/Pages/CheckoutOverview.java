package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CheckoutOverview
{
    WebDriver driver;

    @FindBy(xpath = "//button[contains(@id,'finish')]")
    WebElement CheckOutOverviewFinishButton_xpath;

    @FindBy(xpath = "//button[contains(@id,'cancel')]")
    WebElement Cancel_xpath;

    @FindBy(xpath = "//div[@class='summary_subtotal_label'][contains(.,'Item total: $19.99')]")
    WebElement ItemTotal_xpath;

    @FindBy(xpath = "//div[@class='summary_tax_label'][contains(.,'Tax: $0.80')]")
    WebElement ItemTax_xpath;

    @FindBy(xpath = "//div[@class='summary_total_label'][contains(.,'Total: $10.79')]")
    WebElement TotalAmount_xpath;

    public CheckoutOverview(WebDriver driver)
    {
        this.driver = driver;
    }

    public void CheckoutOverviewPage()
    {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(CheckOutOverviewFinishButton_xpath));
        CheckOutOverviewFinishButton_xpath.isDisplayed();
    }

    public  void  VerifyTotalAmount()
    {
        String itemTotalText = ItemTotal_xpath.getText();
        itemTotalText = itemTotalText.replaceAll("[^\\d.]", "");
        System.out.println(itemTotalText);

        String taxText = ItemTax_xpath.getText();
        taxText = taxText.replaceAll("[^\\d.]", "");
        System.out.println(taxText);

        String grandTotalText = TotalAmount_xpath.getText();
        grandTotalText = grandTotalText.replaceAll("[^\\d.]", "");
        System.out.println(grandTotalText);

        double itemTotal = Double.parseDouble(itemTotalText);
        double tax = Double.parseDouble(taxText);
        double grandTotal = Double.parseDouble(grandTotalText);

        // Calculate Item Total + Tax
        double calculatedTotal = itemTotal + tax;

        if (Math.abs(calculatedTotal - grandTotal) < 0.01) { // Tolerance for floating-point comparison
            System.out.println("Verification passed: Item Total + Tax equals Grand Total.");
            CheckOutOverviewFinishButton_xpath.click();

        } else {
            System.out.println("Verification failed: Item Total + Tax does NOT equal Grand Total.");
            Cancel_xpath.click();
        }







    }


}
