package actionsPerformed;


import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;



@SuppressWarnings("unused")
public class LikefreeHomepageAction {


	public static void ElementClick(String elementName) {
		
		if(elementName.contains("simfree"))
		{
			pageobjects.LikeFreePage.simfree1.click();
		}
		if(elementName.contains("Paym"))
		{
			pageobjects.LikeFreePage.Paym.click();
		}
		if(elementName.contains("PayG"))
		{
			pageobjects.LikeFreePage.PayG.click();
		}

		
		}
	/*
	public class VerifyAddressProceed {
		@SuppressWarnings("deprecation")
		public static void Execute(WebDriver driver,List<HashMap<String,String>> map) throws Exception{
			assertEquals("ADDRESSES", AddressPage.page_heading.getText());
			AddressPage.message.sendKeys(map.get(0).get("message"));
			AddressPage.proceed_to_checkout.click();
			Reporter.log("Address page verify and proceed successful");
		}*/
		
	}
	
	
	

