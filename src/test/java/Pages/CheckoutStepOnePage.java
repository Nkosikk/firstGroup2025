package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import static Utils.generateTestData.*;

public class CheckoutStepOnePage {
    WebDriver driver;

    @FindBy(xpath = "//input[contains(@id,'first-name')]")
    WebElement shippingName_xpath;

    @FindBy(xpath = "//input[contains(@id,'last-name')]")
    WebElement shippingSurname_xpath;

    @FindBy(xpath = "//input[contains(@id,'postal-code')]")
    WebElement shippingAddress_xpath;

    @FindBy(xpath = "//input[contains(@id,'continue')]")
    WebElement shippingContinueButton;

    @FindBy(xpath = "//span[contains(.,'Checkout: Overview')]")
    WebElement checkoutPageTitle;


    public CheckoutStepOnePage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterDetails() {
        shippingName_xpath.click();
        shippingName_xpath.sendKeys(firstName);
        shippingSurname_xpath.clear();
        shippingSurname_xpath.sendKeys(lastName);
        shippingAddress_xpath.clear();
        shippingAddress_xpath.sendKeys(postalCode);
        shippingContinueButton.click();// Verify on checkout overview screen
    }

    public void verifyCheckoutPageTitle(){
        String checkoutTitle = checkoutPageTitle.getText();
        System.out.println(checkoutTitle);
        Assert.assertEquals(checkoutTitle,"Checkout: Overview");
    }

}
