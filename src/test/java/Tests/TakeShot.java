
//package Tests;
//
//import org.openqa.selenium.*;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import java.io.File;
//import java.io.IOException;
//import org.apache.commons.io.FileUtils;
//import org.testng.annotations.Test;
//
//@Test
//public class TakeShot
//{
//    static WebDriver driver;
//
//    public  void takeShots() throws IOException {
//
//        // Initialize the ChromeDriver
//        WebDriver driver = new ChromeDriver();
//
//        // Take screenshot using TakesScreenshot interface
//        TakesScreenshot screenshot = (TakesScreenshot) driver;
//        File srcFile = screenshot.getScreenshotAs(OutputType.FILE);
//
//        // Define the destination file
//        File destFile = new File("C:\\Users\\20996\\OneDrive - Cape Union Mart International (Pty) Ltd\\Desktop\\screenshot.png");
//
//        // Copy the screenshot to the destination file
//        FileUtils.copyFile(srcFile, destFile);
//
//        // Close the browser
//        driver.quit();
//    }
//}
