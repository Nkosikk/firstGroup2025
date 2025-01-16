package Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;


public class BrowserSelection {
    static WebDriver driver;

    @BeforeTest
    public static WebDriver StartBrowser(String browserChoice, String url) {
        if (browserChoice.equalsIgnoreCase("Chrome")) {
            driver = new ChromeDriver();
        } else if (browserChoice.equalsIgnoreCase("edge")) {
            driver = new EdgeDriver();
        } else if (browserChoice.equalsIgnoreCase("firefox")) {
            driver = new FirefoxDriver();
        } else {
            driver = new SafariDriver();
        }

        driver.manage().window().maximize();
        driver.get(url);
        return driver;

    }

}

