package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SmartwatchesPage extends BaseClass{
	public SmartwatchesPage(WebDriver Idriver)
	  {
		  
		  super(driver);
		  
	  }
	  
	  
		@FindBy(how=How.XPATH,using="//h2[contains(text(),'Filter')]")
		public static WebElement SmartwatchesFilterTab;
		
		@FindBy(how=How.XPATH,using="//h2[contains(text(),'Sort')]")
		public static WebElement SmartwatchesSortTab;
}
