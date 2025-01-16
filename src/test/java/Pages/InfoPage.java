package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class InfoPage {

    WebDriver driver;

    @FindBy(xpath = "//*[@id=\"header_container\"]/div[2]/span")
    WebElement InformationPageTitle_xpath;
    @FindBy(xpath = "//*[@id=\"first-name\"]")
    WebElement FirstName_xpath;
    @FindBy(xpath = "//*[@id=\"last-name\"]")
    WebElement LastName_xpath;
    @FindBy(xpath = "//*[@id=\"postal-code\"]")
    WebElement Postalcode_xpath;
    @FindBy(id = "continue")
    WebElement InforpageContinue_id;


    public InfoPage(WebDriver driver) {
        this.driver = driver;}

    public void verifyInfoTitleisDisplayed() {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(InformationPageTitle_xpath));
        InformationPageTitle_xpath.isDisplayed();}

    public void enterFirstname(String firstname) {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(FirstName_xpath));
        FirstName_xpath.clear();
        FirstName_xpath.sendKeys(firstname);}

    public void enterLastname(String lastname) {
        LastName_xpath.clear();
        LastName_xpath.sendKeys(lastname);}

    public void enterPostalCode(String postalcode) {
        Postalcode_xpath.clear();
        Postalcode_xpath.sendKeys(postalcode);}

    public void ClickContinue() {
       InforpageContinue_id.click();}




}
