package actionsPerformed;


import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.support.ui.Select;



public class UpgradeCustomerPageActions {
	  
	public WebDriver driver;
	public List<HashMap<String, String>> datamap;

	  		

		public static void Login() throws InterruptedException
		{
			pageobjects.UpgradeCustomerPage.username.sendKeys("ink_jun9198");
			pageobjects.UpgradeCustomerPage.password.sendKeys("test123");
			Thread.sleep(5000);
			if(pageobjects.UpgradeCustomerPage.signInButton.isDisplayed())
			{
				pageobjects.UpgradeCustomerPage.signInButton.click();
			}
			Thread.sleep(5000);
		}
		
		public static void PickSimOTariff() throws InterruptedException
		{
			if(pageobjects.UpgradeCustomerPage.SimOLink.isDisplayed())
			{
				pageobjects.UpgradeCustomerPage.SimOLink.click();
			}
			Thread.sleep(5000);

		}
		
				
		
		
}
