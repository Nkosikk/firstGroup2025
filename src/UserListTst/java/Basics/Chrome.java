package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;



import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Chrome {
    WebDriver driver;

    @Test
    public void loginToSauceDemoWithBrowser() throws Exception {
        driver = new ChromeDriver();
//        driver = new FirefoxDriver();
//        driver = new EdgeDriver();
//        driver = new SafariDriver();
        driver.get("http://www.way2automation.com/angularjs-protractor/webtables/");
        driver.manage().window().maximize();

    }


    @AfterTest
    public void closeBrowser() {
        driver.quit();
    }

}
