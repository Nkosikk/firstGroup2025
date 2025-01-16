package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CheckoutCompletPage {

    WebDriver driver;

    @FindBy(xpath = "//*[@id=\"header_container\"]/div[2]/span")
    WebElement CheckoutComplteTitle_xpath;
    @FindBy(id = "back-to-products")
    WebElement BackToHomeButton_id;

    public CheckoutCompletPage(WebDriver driver) {
        this.driver = driver;}

    public void verifyCheckoutCompleteTitleisDisplayed() {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(CheckoutComplteTitle_xpath));
        CheckoutComplteTitle_xpath.isDisplayed();}
    public void ClickBackToHomeButton() {
        BackToHomeButton_id.click();}

}
