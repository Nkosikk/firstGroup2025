package Utils;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import java.io.File;
import java.io.IOException;

public class TakeScreenshots {

    private static String screenshotsDir = System.getProperty("user.dir") + "/Screenshots";

    public void takeSnapshot(WebDriver driver, String ScreenshotName){

        TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
        File src = takesScreenshot.getScreenshotAs(OutputType.FILE);
        File destination = new File(screenshotsDir,ScreenshotName+ ".png");

        try{
            FileUtils.copyFile(src,destination);
        } catch (IOException e) {
           e.printStackTrace();
        }

    }
}
