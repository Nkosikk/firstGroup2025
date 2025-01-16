package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Chrome {
    WebDriver driver;

    @Test
    public void StartChromeBrowser() {
        String First_Name = "Gumi";

        driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.xpath("//input[contains(@id,'login-button')]")).click();
        driver.findElement(By.xpath("//span[@class='title'][contains(.,'Products')]")).isDisplayed();
        driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
        driver.findElement(By.xpath("//a[@class='shopping_cart_link']")).click();
        driver.findElement(By.xpath("//span[@class='title'][contains(.,'Your Cart')]")).isDisplayed();
        driver.findElement(By.id("checkout")).click();
        driver.findElement(By.xpath("//span[@class='title'][contains(.,'Checkout: Your Information')]")).isDisplayed();
        driver.findElement(By.id("first-name")).sendKeys(First_Name);
        driver.findElement(By.id("last-name")).sendKeys("Testing");
        driver.findElement(By.id("postal-code")).sendKeys("Testing");
        driver.findElement(By.id("continue")).click();
        //Assert.assertEquals(productText,"Products");
    }

    @AfterTest
    public void Close() {
        driver.quit();
    }

}



