package GlobalActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import helpers.Environment;

import java.util.UUID;



public class RandomEmailAddressCreation extends Environment {


public static void RandomEmail()
{
           // Find the link to email id field
        WebElement link = driver.findElement(By.id("email"));

        // Click the link
        link.click();
        
        // Generate a random email
        final String randomEmail = randomEmail();
        
        // Find the email form field
        WebElement email = driver.findElement(By.id("email"));
        
        // Type the random email to the form
        email.sendKeys(randomEmail);
        
        
     
   }

    private static String randomEmail() {
        return "SITTester-" + UUID.randomUUID().toString() + "@gmail.com";
    }
}