package GlobalActions;

import java.awt.AWTException;
import java.awt.Robot;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


public class MouseHoverAction 
{
	
   	  WebDriver driver;
	  
	  public MouseHoverAction(WebDriver Idriver)
	  {
		  
		  this.driver=Idriver;
		  
	  }
/*##############   All the Below are for the CFA customer journey ###################*/
	  //Below will navigate to BestSelling Devices Page

	 
	  //Below will navigate to PayM Phones Page
	 
	  
	  //Below will navigate to PayG Phones Page
	  
	  //Below will navigate to Like New Phones Page
	  public void likeNewHomepageNavigateion() throws InterruptedException, AWTException 
	  {
		  Point coordinates = driver.findElement(By.id("pn1")).getLocation();
		  Robot robot = new Robot();
		  robot.mouseMove(coordinates.getX(),coordinates.getY()+120);
		 
		  
		  Actions action = new Actions(driver);
		  WebElement we1 = driver.findElement(By.xpath("//a[contains(text(), 'Phones')]"));
		  action.moveToElement(we1).build().perform();
		  Thread.sleep(2000);
		  WebElement we2 = driver.findElement(By.xpath("//a[contains(text(), 'Like New')]"));
		  action.moveToElement(we2).build().perform();
		  Thread.sleep(2000);
		  we2.click();
		  Point coordinates2 = driver.findElement(By.id("shop-simplicity-header-xxl")).getLocation();
		  Robot robot2 = new Robot();
		  robot2.mouseMove(coordinates2.getX(),coordinates.getY()+120);
	  }
	  //Below will navigate to Tablets PayM Page
	  
	  //Below will navigate to Tablets PayG Page
	  
	  
	  //Below will navigate to Upgrade > Upgrade now Page
	  
	  
	  //Below will navigate to PAYM SIMO Page
	  public void PayMSimoNavigation() throws InterruptedException, AWTException 
	  {
		 
		  Point coordinates = driver.findElement(By.id("pn1")).getLocation();
		  Robot robot = new Robot();
		  robot.mouseMove(coordinates.getX(),coordinates.getY()+120);
		  
		  Actions action = new Actions(driver);
		  WebElement we1 = driver.findElement(By.xpath("//a[contains(text(), 'Sims')]"));
		  action.moveToElement(we1).build().perform();
		  Thread.sleep(3000);
		  WebElement we2 = driver.findElement(By.xpath("//a[contains(text(), 'Pay Monthly sims')]"));
		  action.moveToElement(we2).build().perform();
		  Thread.sleep(3000);
		  we2.click();
	  }
	  
	  //Below will navigate to PAYG SIMO Page

	  //Below will navigate to INTERNATIONAL SIMO Page
	  
	  
	  //Below will navigate to IPAD SIMO Page
	  
	  
	  //Below will navigate to Tablet SIMO Page
	  
	  
	  //Below will navigate to Great Deals Page
	  
	 
	  //Below will navigate to SMART TECH Page
	  
	  
	  //Below will navigate to BROWSE SMART TECH Page
	  
	  
	  //Below will navigate to SMART TECH > SMART WATCHES Page
	  
	  
	  //Below will navigate to SMART TECH > FITNESS TRACKERS Page
	  
	  	  
	  //Below will navigate to ACCESSORIES Page
  

 
}


