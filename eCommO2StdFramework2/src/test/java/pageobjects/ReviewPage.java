package pageobjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ReviewPage {
	
	  
	  @FindBy(how=How.ID,using="terms")
	public static WebElement TermsCheckBox;
	  
	  @FindBy(how=How.ID,using="order-review-continue") 
	  public static WebElement PayNow;

	  
	  
}
