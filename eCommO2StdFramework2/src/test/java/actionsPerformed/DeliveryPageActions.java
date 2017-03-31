package actionsPerformed;


import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.support.ui.Select;

import GlobalActions.RandomEmailAddressCreation;



public class DeliveryPageActions {
	  
	public WebDriver driver;
	public List<HashMap<String, String>> datamap;

	  		

		public static void SetDelivery() throws InterruptedException
		{
			pageobjects.DeliveryPage.Housenumber.sendKeys("12");
			pageobjects.DeliveryPage.Postcode.sendKeys("B15 2LG");
			pageobjects.DeliveryPage.Find_Address.click();
			Thread.sleep(5000);
			if(pageobjects.DeliveryPage.SelectAddress1.isDisplayed())
			{
				pageobjects.DeliveryPage.SelectAddress1.click();
			}
		}
		
		public static void AboutYou()
		{
			//Email_Address.sendKeys("TestersitAuto9@gmail.com");
			RandomEmailAddressCreation.RandomEmail();
			System.out.println("Setting the About you options");
			Select dropdown = new Select(pageobjects.DeliveryPage.Title);
			dropdown.selectByIndex(2);
			pageobjects.DeliveryPage.First_Name.sendKeys("Test");
			pageobjects.DeliveryPage.Last_Name.sendKeys("Accepta");
			pageobjects.DeliveryPage.Contact_Number.sendKeys("07829483426");
			pageobjects.DeliveryPage.Password.sendKeys("NTTDATA123");
			pageobjects.DeliveryPage.security_answer.sendKeys("vodafone");
			pageobjects.DeliveryPage.date.sendKeys("01");
			pageobjects.DeliveryPage.Month.sendKeys("08");
			pageobjects.DeliveryPage.year.sendKeys("1991");
		}
		
		public static void ClickContinue()
		{
			System.out.println("Continuing to next page");

			pageobjects.DeliveryPage.Continue.click();	
		
		}
		
		
		
		
		
}