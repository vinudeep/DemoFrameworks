package pageobjects;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class OrderConfirmationPage {
	
	  
	  @FindBy(how=How.ID,using="terms") 
		WebElement TermsCheckBox;
	  
	  @FindBy(how=How.XPATH,using="//*[@id='order-number']/h2") 
	  WebElement Message;

	  
	  

	  }
	 
	  

