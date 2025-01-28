package Pages;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;

public class MyscreenShot {

public static void takeScreenshot(WebDriver driver, String filePath) {
    try {
        File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(src, new File(filePath));
        System.out.println("Screenshot saved at: " + filePath);
    } catch (IOException e) {
        System.out.println("Failed to save screenshot: " + e.getMessage());
    }
}}

//Parameters: The method takes a WebDriver instance and the file path (filePath) to save the screenshot.
//Capture Screenshot: The TakesScreenshot interface is used to capture the screenshot.
//Save File: FileUtils.copyFile() saves the captured screenshot to the specified path.
//Error Handling: Includes a try-catch block to handle potential IOException.