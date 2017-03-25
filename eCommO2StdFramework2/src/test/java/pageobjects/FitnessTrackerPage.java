package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class FitnessTrackerPage extends BaseClass{
	
	 public FitnessTrackerPage(WebDriver Idriver)
	  {
		  
		  super(driver);
		  
	  }
	  
	  
		@FindBy(how=How.XPATH,using="//h2[contains(text(),'Filter')]")
		public static WebElement FitnessFilterTab;
		
		@FindBy(how=How.XPATH,using="//h2[contains(text(),'Sort')]")
		public static WebElement FitnessSortTab;
}
