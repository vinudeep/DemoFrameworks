package actionsPerformed;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import helpers.Environment;
import helpers.Environment;


public class OrderConfirmationPageActions extends Environment {
		 	  
	  
	  public static void gettitlepage()
	  {
		  
		   System.out.println(driver.getTitle());
	  
	   }
	  
	
	  public static void MessageDisplayed() 
	  {
		  System.out.println("This is order confirmation page and the message in this page is as below......");
		  try{
		  List<WebElement> outercontainer = driver.findElements(By.xpath("//*[@id='order-number']"));

			List<WebElement> DataContainer = outercontainer.get(0).findElements(By.xpath("//*[@id='order-number']"));
				        
				      
				        for (int i=0; i<=DataContainer.size();i++)
				        {
				        			            
				        	System.out.println(DataContainer.get(i).getText());			        
				        }
		  }
			catch (IndexOutOfBoundsException e) {
				
			}
						}
		        	
	  public static void VolteMessageDisplayed() 
	  {
		  System.out.println("The Volte message in this page is as below......");
		  try{
		  List<WebElement> outercontainer = driver.findElements(By.xpath("//*[@id='imsMessage']"));

			List<WebElement> DataContainer = outercontainer.get(0).findElements(By.xpath("//*[@id='imsMessage]"));
				        
				      
				        for (int i=0; i<=DataContainer.size();i++)
				        {
				        			            
				        	System.out.println(DataContainer.get(i).getText());			        
				        }
		  }
			catch (IndexOutOfBoundsException e) {
				
			}
						}
		        	
          	
		          	


	  }
	 
	  

