package Utils;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


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
            String timestamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd_HH-mm-ss"));
            String filePath = fileName + "_" +timestamp+".png";

            File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            File destFile = new File(filePath);
            FileUtils.copyFile(srcFile, destFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}



