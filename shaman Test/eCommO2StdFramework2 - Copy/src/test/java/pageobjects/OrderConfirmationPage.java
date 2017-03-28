package pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class OrderConfirmationPage {
	
	  
	  @FindBy(how=How.ID,using="terms") 
		WebElement TermsCheckBox;
	  
	  @FindBy(how=How.XPATH,using="//*[@id='order-number']/h2") 
	  WebElement Message;

	  
	  

	  }
	 
	  

