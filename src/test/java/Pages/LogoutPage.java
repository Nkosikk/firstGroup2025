package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogoutPage {
    WebDriver driver;

    @FindBy(xpath = "//button[contains(@id,'react-burger-menu-btn')]")
    WebElement burgerMenu;

    @FindBy(xpath = "//a[contains(@id,'logout_sidebar_link')]")
    WebElement logout;

    public LogoutPage(WebDriver driver) {
        this.driver = driver;
    }
    public void clickBurgerMenu(){
        burgerMenu.click();
    }

    public void clickLogout(){
        logout.click();
    }
}
