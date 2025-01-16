package Basics;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class Chrome {
    WebDriver driver;

    @Test
    public void loginToSauceDemoWithBrowser() throws IOException {
        driver = new ChromeDriver();
//        driver = new FirefoxDriver();
//        driver = new EdgeDriver();
//        driver = new SafariDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        FileUtils.copyFile(((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE), new File("/Users/nkosi/Projects/Automation2025/firstGroup2025/src/test/Screenshots/login page.png"));

        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.xpath("//input[@id='login-button']")).click();

        driver.findElement(By.xpath("//span[contains(.,'Products')]")).isDisplayed();
        FileUtils.copyFile(((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE), new File("/Users/nkosi/Projects/Automation2025/firstGroup2025/src/test/Screenshots/Product page.png"));

//        String productText = driver.findElement(By.xpath("//span[contains(.,'Products')]")).getText();
//
//        Assert.assertEquals(productText,"Products");



    }

    @AfterTest
    public void closeBrowser() {
        driver.quit();
    }

}
