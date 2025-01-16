package Pages;

import org.openqa.selenium.WebDriver;

public class CheckOutPage {
    // Step 4: Checkout
    WebDriver driver;
    WebElement checkoutButton = driver.findElement(By.id("checkout"));
        checkoutButton.click();

    // Step 5: Fill in checkout details
    WebElement firstName = driver.findElement(By.id("first-name"));
    WebElement lastName = driver.findElement(By.id("last-name"));
    WebElement postalCode = driver.findElement(By.id("postal-code"));
    WebElement continueButton = driver.findElement(By.id("continue"));

        firstName.sendKeys("John");
        lastName.sendKeys("Doe");
        postalCode.sendKeys("12345");
        continueButton.click();

    // Step 6: Complete the checkout
    WebElement finishButton = driver.findElement(By.id("finish"));
        finishButton.click();

    // Step 7: Validate the final confirmation page
    WebElement confirmationMessage = driver.findElement(By.className("complete-header"));
    assertTrue(confirmationMessage.getText().contains("THANK YOU FOR YOUR ORDER"));
}
