package Utils;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;


public class ScreenShot {

    private WebDriver driver;

    public ScreenShot(WebDriver driver) {
        this.driver = driver;
    }

    public void TakeScreenShot(String fileName) {
        if (!(driver instanceof TakesScreenshot)) {
            throw new IllegalStateException("Driver does not support taking screenshots");
        }
        try {
            File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            File destFile = new File(fileName);
            FileUtils.copyFile(srcFile, destFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

//public class ScreenShot {
//
//    static WebDriver driver;
//        public void TakeScreenShot(String filename) {
//        TakesScreenshot screenshot = (TakesScreenshot) driver;
//        File source = screenshot.getScreenshotAs(OutputType.FILE);
//        File destFile = new File(filename);
//
//        // Copy the screenshot to the destination file
//        try {
//            FileUtils.copyFile(source, destFile);
//            System.out.println("Screenshot saved at" +filename);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }

//}


