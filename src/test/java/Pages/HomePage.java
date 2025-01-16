package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage {

    WebDriver driver;

    @FindBy(xpath = "//span[contains(.,'Products')]")
    WebElement productTitle_xpath;
    @FindBy(id = "add-to-cart-sauce-labs-bolt-t-shirt")
    WebElement AddBagToCard;
    @FindBy(id = "remove-sauce-labs-bolt-t-shirt")
    WebElement CheckBagOnCart;
    @FindBy(id = "shopping_cart_container")
    WebElement ClickTheCart;
    @FindBy(id = "react-burger-menu-btn")
    WebElement BurgerMenu_id;
    @FindBy(id = "logout_sidebar_link")
    WebElement LogoutLink_id;



    public HomePage(WebDriver driver) {
        this.driver = driver;
    }



    public void verifyProductTextIsDisplayedIHomePage() {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(productTitle_xpath));
        productTitle_xpath.isDisplayed();

    }
    public void AddBagToCard(){
        AddBagToCard.click();
    }
    public void CheckRemovefromcartisdisplayed(){
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(CheckBagOnCart));
        CheckBagOnCart.isDisplayed();
    }
    public void ClickOnCart(){
        ClickTheCart.click();}
    public void ClickBurgerMenu(){
        BurgerMenu_id.click();}
    public void ClickLogout(){
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(LogoutLink_id));
        LogoutLink_id.click();}





}
