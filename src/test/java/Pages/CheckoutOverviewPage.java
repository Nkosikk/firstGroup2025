package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CheckoutOverviewPage {

    WebDriver driver;

    @FindBy(xpath = "//span[contains(.,'Checkout: Overview')]")
    WebElement PageTitle_xpath;

    @FindBy(xpath = "//div[@class='inventory_item_name'][contains(.,'Sauce Labs Backpack')]")
    WebElement ItemTitle_xpath;

    @FindBy(xpath = "//div[@data-test='subtotal-label']")
    WebElement itemTotal_xpath;

    @FindBy(xpath = "//div[@data-test='total-label']")
    WebElement total_xpath;

    @FindBy(id = "finish")
    WebElement finishButton_id;

    @FindBy(id = "cancel")
    WebElement cancelButton_id;



    public CheckoutOverviewPage(WebDriver driver) {
        this.driver = driver;
    }



    public void verifyYourInfoTitleIsDisplayedInCaptureInfoPage() {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(PageTitle_xpath));
        PageTitle_xpath.isDisplayed();

    }

    public void verifyItemIsDisplayedInCaptureInfoPage() {
        ItemTitle_xpath.isDisplayed();

    }

    public void verifyItemTotalPlusTaxEqualsTotal(){

        double itemTotal = Double.parseDouble(itemTotal_xpath.getText().replaceAll("[^0-9.]", "").replace("$", ""));
        double total = Double.parseDouble(total_xpath.getText().replaceAll("[^0-9.]", "").replace("$", ""));

        // Calculate tax and total
        double taxRate = 0.08; // Assuming 8% tax
        double expectedTotal = itemTotal + (itemTotal * taxRate);

        expectedTotal = Math.round(expectedTotal * 100.0) / 100.0;
        total = Math.round(total * 100.0) / 100.0;

        // Compare and perform actions
        if (Math.abs(expectedTotal - total) < 0.01) { // Allow minor differences due to rounding
            finishButton_id.click();
        } else {
            cancelButton_id.click();
        }
    }
}
