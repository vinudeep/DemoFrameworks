package actionsPerformed;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class MouseSimfreeLandingActions {
	 static WebDriver driver;
	  
	  public MouseSimfreeLandingActions(WebDriver Idriver)
	  {
		  
		  this.driver=Idriver;
		  
	  }
	
	public static void NavSimFreeLandingPage() throws InterruptedException{
	Actions action = new Actions(driver);
	  WebElement we = driver.findElement(By.id("pn1"));
	  action.moveToElement(we).build().perform();
	  WebElement we1 = driver.findElement(By.xpath("//*[@id='pn1']/ul/li[3]/a"));
	  action.moveToElement(we1).build().perform();
	  Thread.sleep(3000);
	  WebElement we2 = driver.findElement(By.xpath("//*[@id='pn1']/ul/li[3]/ul/li[4]/a"));
	  action.moveToElement(we2).build().perform();
	  we2.click();
	}
}
