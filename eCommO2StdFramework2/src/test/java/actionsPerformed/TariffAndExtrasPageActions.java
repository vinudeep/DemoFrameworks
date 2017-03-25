package actionsPerformed;

import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import helpers.DataHelper;
import steps.Hooks;

public class TariffAndExtrasPageActions {

	   
		public static void validateElements()
		{  System.out.println(" ");
			System.out.println("SIM_FREE_TARIFF_EXTRAS_PAGE_VALIDATION");
			
			if(pageobjects.TariffAndExtrasPage.PayMTab.getText().contains("Pay Monthly"))
			 {
				System.out.println("The Paym_Tab is Present and the Text is :" + pageobjects.TariffAndExtrasPage.PayMTab.getText() );
			 }else{
			  System.out.println("The  Paym_Tab is Absent and the Text is :" + pageobjects.TariffAndExtrasPage.PayMTab.getText());
			 }
		
			if(pageobjects.TariffAndExtrasPage.PayGTab.getText().contains("Pay As You Go"))
			 {
				System.out.println("The PayG_Tab is Present and the Text is :" +pageobjects.TariffAndExtrasPage.PayGTab.getText() );
			 }else{
			  System.out.println("The  PayG_Tab is Absent and the Text is :" +pageobjects.TariffAndExtrasPage.PayGTab.getText());
			 }
			if(pageobjects.TariffAndExtrasPage.GotoBasket.getText().contains("Go to basket"))
			 {
				System.out.println("The GoToBasket_Tab is Present and the Text is :" +pageobjects.TariffAndExtrasPage.GotoBasket.getText());
			 }else{
			  System.out.println("The  GoToBasket_Tab is Absent and the Text is :" +pageobjects.TariffAndExtrasPage.GotoBasket.getText());
			  
			 }
			if(pageobjects.TariffAndExtrasPage.Contractlength.getText().contains("Contract length"))
			 {
				System.out.println("The Contractlength_label is Present and the Text is :" +pageobjects.TariffAndExtrasPage.Contractlength.getText());
			 }else{
			  System.out.println("The  Contractlength_label is Absent and the Text is :" +pageobjects.TariffAndExtrasPage.Contractlength.getText());
			  
			 }
			if(pageobjects.TariffAndExtrasPage.months12tab.getText().contains("12 months"))
			 {
				System.out.println("The 12 months_Tab is Present and the Text is :" +pageobjects.TariffAndExtrasPage.months12tab.getText());
			 }else{
			  System.out.println("The  12 months_Tab is Absent and the Text is :" +pageobjects.TariffAndExtrasPage.months12tab.getText());
			  
			 }
			
			if(pageobjects.TariffAndExtrasPage.days30tab.getText().contains("30 days"))
			 {
				System.out.println("The 30 days_Tab is Present and the Text is :" +pageobjects.TariffAndExtrasPage.days30tab.getText());
			 }else{
			  System.out.println("The  30 days_Tab is Absent and the Text is :" +pageobjects.TariffAndExtrasPage.days30tab.getText());
			  
			 }
			
			
     
		}
		public static void tariff_select(String ElementName) 
		{
			if(ElementName.contains("tariff"))
			{
				pageobjects.TariffAndExtrasPage.month12tarrif500mb.sendKeys(Keys.ENTER);
			}
			
		}
			
		
		public static void basket_selectLive()
		{
			
			System.out.println("Now Adding to the basket");
			pageobjects.TariffAndExtrasPage.addToBasketLive.click();
			System.out.println("Added to the basket");
			
					
		}
		
		
		public static void basket_selectTest()
		{
			System.out.println("Now Adding to the basket");
			pageobjects.TariffAndExtrasPage.addToBasketDockHeader.click();
			System.out.println("Added to the basket");
					
			
		}
		
	
		public static void Tab_Select(String elementName) {
			if(elementName.equalsIgnoreCase("12months"))
			{
				pageobjects.TariffAndExtrasPage.months12tab.sendKeys(Keys.ENTER);
			}
			
			if(elementName.equalsIgnoreCase("30days"))
			{
				pageobjects.TariffAndExtrasPage.days30tab.sendKeys(Keys.ENTER);
			}
			
		}
		public static void tariffvalidation(String ElementName) 
		{
			if(ElementName.equalsIgnoreCase(pageobjects.TariffAndExtrasPage.Tariffvaladity.getText()))
			{
				
				System.out.println("The Tariff detail is Present and the Text is :" +pageobjects.TariffAndExtrasPage.Tariffvaladity.getText());
			 }
			else
			{
			  System.out.println("The Tariff detail is  Absent and the Text is :" +pageobjects.TariffAndExtrasPage.Tariffvaladity.getText());	
			
		    }
		}
		public static void elementvisibility()
		{
			if(pageobjects.TariffAndExtrasPage.Contract_length.isDisplayed())
			{
				System.out.println();
				System.out.println("The Element"+'\u0022'+" Contract length is 12 months"+'\u0022'+ "is not Displaying on the Screen");
			}
			else
			{
				System.out.println("The Element"+'\u0022'+"Contract length is 12 months"+'\u0022'+ "is not displaying on the Screen");
			}
		}
	
}
