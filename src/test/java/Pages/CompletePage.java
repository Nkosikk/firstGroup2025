package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CompletePage {

    WebDriver driver;


    @FindBy(xpath = "//button[@type='button'][contains(.,'Open Menu')]")
    WebElement DropDown_xpath;

    @FindBy(xpath = "//a[contains(@id,'link')][@class='bm-item menu-item'][contains(.,'Logout')]")
    WebElement Logout_xpath;

    public CompletePage(WebDriver driver) {       this.driver = driver;
    }

    public  void  DropDown()
    {
        DropDown_xpath.click();

    }

    public  void  Logout()
    {
        Logout_xpath.click();

    }
}
