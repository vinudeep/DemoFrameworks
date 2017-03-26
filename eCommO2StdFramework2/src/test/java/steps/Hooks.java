package steps;

import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import helpers.*;

public class Hooks extends Environment{
	
   // protected static WebDriver driver;

	    @Before
    /**
     * Delete all cookies at the start of each scenario to avoid
     * shared state between tests
     */
      public WebDriver openBrowser() throws MalformedURLException, InterruptedException {
    	
    	//Below will handle unexpected browser popups, here we are passing entire launching inside try catch block and catching if an popup with iframe appears
    	
    	try
    	{
    		System.out.println("Called openBrowser");
        	String relativePath = System.getProperty("user.dir");
        	String EnvPropFilePath = relativePath + "\\src\\test\\java\\Properties\\AppConfig.properties";
        	String BrowserType = Filereadingutility.getPropertyValue(EnvPropFilePath, "Browser_Type");
        	String Currenturl = Filereadingutility.getPropertyValue(EnvPropFilePath, "url");
        	BrowserHelper.Invoke_browser(BrowserType);
    		Environment.driver.get(Currenturl);
        	Environment.driver.manage().deleteAllCookies();
        	Environment.driver.manage().window().maximize();
        	Thread.sleep(3000);
    	}
    	catch(ElementNotVisibleException e)
    	{
    	//check if popup is present, if yes, handle it.
    		Environment.driver.switchTo().frame("edr_l_first"); 
    		System.out.println("********We are switch to the iframe*******");
    		//Saying no to survey
    		driver.findElement(By.xpath("//a[@id='no']/span")).click();
    		System.out.println("*******Saying no to survey*******");
    		System.out.println("*********Existing the popups present in iframe***************"); 
    	}
    	
    	
		return null;
    }

     
    @After
    /**
     * Embed a screenshot in test report if test is marked as failed
     */
    public void embedScreenshot(Scenario scenario) {
       
        if(scenario.isFailed()) {
        try {
        	 scenario.write("Current Page URL is " +driver.getCurrentUrl());
//            byte[] screenshot = getScreenshotAs(OutputType.BYTES);
            byte[] screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
            scenario.embed(screenshot, "image/png");
        } catch (WebDriverException somePlatformsDontSupportScreenshots) {
            System.err.println(somePlatformsDontSupportScreenshots.getMessage());
        }
        
        }
        Environment.driver.close();
        
    }
    
}