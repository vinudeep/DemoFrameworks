package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


public class FitnessTrackerPage{

	  
	  
		@FindBy(how=How.XPATH,using="//h2[contains(text(),'Filter')]")
		public static WebElement FitnessFilterTab;
		
		@FindBy(how=How.XPATH,using="//h2[contains(text(),'Sort')]")
		public static WebElement FitnessSortTab;
}
