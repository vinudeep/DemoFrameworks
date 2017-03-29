package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class UpgradeCustomerPage {
	 
	  
		@FindBy(how=How.ID,using="username")
		public static WebElement username;
		
		@FindBy(how=How.ID,using="password")
		public static WebElement password;
		
		@FindBy(how=How.ID,using="signInButton")
		public static WebElement signInButton;
		
		@FindBy(how=How.CLASS_NAME,using="simo-link")
		public static WebElement SimOLink;
		
		////a[contains(text(), 'Pick a Sim only tariff')]		
		/*
		@FindBy(how=How.XPATH, using="a[contains(text(), 'Pick a sim only tariff')]")
		public static WebElement SimOLink;
		*/
		
}
