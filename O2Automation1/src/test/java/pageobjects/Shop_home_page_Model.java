package pageobjects;

import java.awt.AWTException;
import java.awt.Robot;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import junit.framework.Assert;

public class Shop_home_page_Model {
	
	 WebDriver driver;
	 
	 public Shop_home_page_Model(WebDriver Idriver)
	  {
		  
		  this.driver=Idriver;
		  
	  }

		@FindBy(how=How.XPATH,using="//*[@id='pn1']/a/dl/dt") 
		WebElement shomhome;
		
		@FindBy(how=How.XPATH,using=("//*[@id='pn1']/ul/li[6]/a"))   
		WebElement shopsims;
		
		@FindBy(how=How.XPATH,using=("//*[@id='no']/span"))  //no thank for customer help
		WebElement shopnothanks;
		
		
		@FindBy(how=How.XPATH,using=("//*[@id='pn1']/ul/li[6]/ul/li[2]/a"))
		WebElement shopsimspaymsims;
		
		
		@FindBy(how=How.XPATH,using=("//*[@id='tablet']"))
		WebElement shoptablet;		
				//*[@id="tablet"]
		
		@FindBy(how=How.XPATH,using=("//*[@id='id-12-months']/p/a"))
		WebElement twelevemonths;	
		
		@FindBy(how=How.XPATH,using=("//*[@id='id-30-days']/p/a"))
		WebElement thirtydays;
		
		@FindBy(how=How.XPATH,using=("//*[@id='67533f03-4e8b-4089-8d3a-fdaf4e1cd2a2']/div[5]"))
		WebElement month12firsttariff;
				
		@FindBy(how=How.XPATH,using=("//*[@id='11ca80ab-cee8-4b8a-afc5-d638ce897899']/div[6]"))
		WebElement day30firsttariff;
		
		@FindBy(how=How.XPATH,using=("//*[@id='contentWrapper']/div[3]/div"))
		WebElement tariffsorting;		
		
		// Modified on 10/03/2017- Nag			
		@FindBy(how=How.XPATH,using=("//*[@id='2906f2c0-ac58-4e64-b199-e8d0c21b36df']/div[4]"))
		WebElement promotionprimary;
		
		@FindBy(how=How.XPATH,using=("//*[@id='2906f2c0-ac58-4e64-b199-e8d0c21b36df']/div[5]"))
		WebElement promotionsecondary;
		
		// Modified on 10/03/2017- Nag	
		
		

		public void ElementClick1(String elementName) throws InterruptedException, AWTException {
			
			if(elementName.contains("shomhome"))
			{
				  Point coordinates = driver.findElement(By.id("pn1")).getLocation();
				  Robot robot = new Robot();
				  robot.mouseMove(coordinates.getX(),coordinates.getY()+120);
				 Thread.sleep((4000));
			}
			if(elementName.contains("shopsims"))
			{
				Actions action = new Actions(driver);
				 WebElement we1 = driver.findElement(By.xpath("//*[@id='pn1']/ul/li[6]/a"));
				 action.moveToElement(we1).build().perform();
				 Thread.sleep((4000));
			}
			if(elementName.contains("shopsimspaymsims"))
			{
				Actions action = new Actions(driver);
				 WebElement we2 = driver.findElement(By.xpath("//*[@id='pn1']/ul/li[6]/ul/li[2]/a"));
				 action.moveToElement(we2).build().perform();
				// Thread.sleep((1000));
				 we2.click();
			}
			if(elementName.contains("shoptablet"))
			{
				shoptablet.click();
			}
			
			if(elementName.contains("thirtydays"))
			{
				thirtydays.click();
			}
			}
		
		
			
public void Elementverify(String elementName) throws InterruptedException {

	if(elementName.contains("twelevemonths"))
	{
		if(driver.findElements(By.xpath("//*[@id='id-12-months']/p/a")).size() != 0){
			System.out.println("12 month Contract length is Present");
			}else{
			System.out.println("12 month Contract length is not available");
			}
		
	}	
	
	if(elementName.contains("thirtydays"))
	{
		if(driver.findElements(By.xpath("//*[@id='id-30-days']/p/a")).size() != 0){
			System.out.println("30 days Contract length is Present");
			}else{
			System.out.println("30 days Contract length is not available");
		}
			}
	
	
	if(elementName.contains("month12firsttariff"))
	{
		if(driver.findElements(By.xpath("//*[@id='67533f03-4e8b-4089-8d3a-fdaf4e1cd2a2']/div[5]")).size() != 0){
			System.out.println("A 12 month Tariff is Present");
			}else{
			System.out.println("Not able to find any 12 month tariff");
			}
		
	}
	
	if(elementName.contains("day30firsttariff"))
	{
		if(driver.findElements(By.xpath("//*[@id='11ca80ab-cee8-4b8a-afc5-d638ce897899']/div[6]")).size() != 0){
			System.out.println("A 30 day Tariff is Present");
			}else{
			System.out.println("Not able to find any 30 day tariff");
			}
		
	}
	
}


public void Sorting(String elementName) throws InterruptedException {
	List<WebElement> list = driver.findElements(By.xpath("//span[@class='pound'"));
		System.out.println(list); 

// Modified on 10/03/2017- Nag	
	
	if(elementName.contains("promotionprimary"))
	{
		if(driver.findElements(By.xpath("//*[@id='2906f2c0-ac58-4e64-b199-e8d0c21b36df']/div[4]")).size() != 0){
			System.out.println("Primary Promotion Element is present");
			}else{
			System.out.println("Primary Promotion Element is NOT present");
			}
		
	if(elementName.contains("promotionsecondary"))
	{
		if(driver.findElements(By.xpath("//*[@id='2906f2c0-ac58-4e64-b199-e8d0c21b36df']/div[5]")).size() != 0){
	
			System.out.println("Secondary Promotion Element is present");
			}else{
			System.out.println("Secondary Promotion Element is NOT present");
		}			
		
	}	
	
	}

	}

	public void ElementColour(String elementName , String colouractual) throws InterruptedException {
		
		String blueexpected="rgba(3, 43, 90, 1)";
		String greenexpected="rgba(0, 204, 204, 1)";
		
		if(elementName.contains("promotionprimary"))
		{
			Actions action = new Actions(driver);
			 String colora = driver.findElement(By.xpath("//*[@id='2906f2c0-ac58-4e64-b199-e8d0c21b36df']/div[4]")).getCssValue("background-color");
			 if (colora.equals(blueexpected)){
			 System.out.println("Primary Promotion Element is in Blue colour as expected");} else
			 {System.out.println("Primary Promotion Element is NOT in Blue colour as expected");} 
		}
		
		if(elementName.contains("promotionsecondary"))
		{
			Actions action = new Actions(driver);
			 String colora = driver.findElement(By.xpath("//*[@id='2906f2c0-ac58-4e64-b199-e8d0c21b36df']/div[5]")).getCssValue("background-color");
			if (colora.equals(greenexpected)){
			 System.out.println("Secondary Promotion Element is in Green colour as expected");} else
			 {System.out.println("Secondary Promotion Element is NOT in Green colour as expected");} 
		}
		
}
public void charlengthcheck(String elementName , int elengthvalue) throws InterruptedException {
		
		
		
		if(elementName.contains("promotionprimary"))
		{
			Actions action = new Actions(driver);
			 int alengthvalue = driver.findElement(By.xpath("//*[@id='2906f2c0-ac58-4e64-b199-e8d0c21b36df']/div[4]")).getText().length();
			 		
			 if (elengthvalue >= alengthvalue){
			 System.out.println("Primary Promotion Element characters is within or equal to the expected length");} else
			 {System.out.println("Primary Promotion Element characters is NOT within or equal to the expected length");} 
		}
		
		if(elementName.contains("promotionsecondary"))
		{
			@SuppressWarnings("unused")
			Actions action = new Actions(driver);
			 int alengthvalue = driver.findElement(By.xpath("//*[@id='2906f2c0-ac58-4e64-b199-e8d0c21b36df']/div[5]")).getText().length();
			 		
			 if (elengthvalue >= alengthvalue){
			 System.out.println("Secondary Promotion Element characters is within or equal to the expected length");} else
			 {System.out.println("Secondary Promotion Element characters is NOT within or equal to the expected length");} 
		}
		
}

//Modified on 10/03/2017- Nag	
        


	    }



