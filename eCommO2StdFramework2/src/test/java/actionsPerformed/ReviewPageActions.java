package actionsPerformed;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import helpers.Environment;

public class ReviewPageActions extends Environment  {
		      
	  
	  public static void gettitlepage()
	  {
		  
		   System.out.println(driver.getTitle());
	  
	   }
	  
	
	  public static void TermsCheckBox() 
	  {
		  System.out.println("Clicking on the checkbox");
		  pageobjects.ReviewPage.TermsCheckBox.click();
	  }
	 
	  public static void PayNow() 
	  {
		  System.out.println("Clicking on Pay now");
		  pageobjects.ReviewPage.PayNow.click();
		  System.out.println("Completing on Review page");

	  }
}
