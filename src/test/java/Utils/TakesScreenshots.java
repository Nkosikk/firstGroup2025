package Utils;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TakesScreenshots {

    private static String screenshotDir = System.getProperty("user.dir") + "/Screenshots";

    public void takeScreenshot(WebDriver driver, String ScreenshotName) {

        TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
        File src = takesScreenshot.getScreenshotAs(OutputType.FILE);
        String todaysDate = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
        File destination = new File(screenshotDir, ScreenshotName +todaysDate+".png");

        try {
            FileUtils.copyFile(src, destination);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


   /* public static String takeScreenshot (WebDriver driver) throws IOException {
        String pageName = driver.getTitle();

        TakesScreenshot ts = (TakesScreenshot) driver;
        String todaysDate = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
        File source = ts.getScreenshotAs(OutputType.FILE);
        String destination = System.getProperty("user.dir") + "/Screenshots/"+pageName+todaysDate+".png";
        File fileDestination = new File(destination);
        FileUtils.copyFile(source, fileDestination);
        return destination;
    }*/

}


