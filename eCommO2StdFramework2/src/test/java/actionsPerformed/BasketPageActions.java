package actionsPerformed;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import pageobjects.BasketPage.*;

@SuppressWarnings("unused")
public class BasketPageActions 
{


	public static void validatelabel() throws InterruptedException
	{   
		System.out.println(" ");
		System.out.println("SHOP_BASKET_PAGE_VALIDATION");
		
		
		if(pageobjects.BasketPage.DeviceRemovebtn.getText().contains("Remove"))
		 {
			System.out.println("The Device_Remove_Link is Present and the Text is :" +pageobjects.BasketPage.DeviceRemovebtn.getText() );
		 }else{
		  System.out.println("The Device_Remove_Link is Absent and the Text is :" +pageobjects.BasketPage.DeviceRemovebtn.getText());
		 }
		Thread.sleep(5000);
		 
			if(pageobjects.BasketPage.tariffRemovebtn.getText().contains("Remove"))
			 {
				System.out.println("The Tarrif_Remove_link is Present and the Text is :" +pageobjects.BasketPage.tariffRemovebtn.getText() );
			 }else{
			  System.out.println("The Tarrif_Remove_link is Absent and the Text is :" +pageobjects.BasketPage.tariffRemovebtn.getText());
			 }

		
	}
	public static void labelvaluedisplay() throws InterruptedException	
	{
		
		System.out.println("The upfront cost display :" +pageobjects.BasketPage.upfrontcost.getAttribute("data-qa-upfront-total"));
		Thread.sleep(5000);
		
		System.out.println("The monthly cost display :" +pageobjects.BasketPage.monthlycost.getAttribute("data-qa-monthly-total"));	
		
	}
	

	public static void ValidateBasketPage() throws InterruptedException
	{   
		System.out.println(" ");
		System.out.println("SHOP_BASKET_PAGE_VALIDATION");
		
		
		if(pageobjects.BasketPage.checkoutbtn.getText().contains("Go to checkout"))
		 {
			System.out.println("Go To Checkout is Present and the Text is :" +pageobjects.BasketPage.checkoutbtn.getText() );
			pageobjects.BasketPage.checkoutbtn.sendKeys(Keys.ENTER);;
		 }else{
		  System.out.println("Go To Checkout is Absent and the Text is :" +pageobjects.BasketPage.checkoutbtn.getText());
		 }
		Thread.sleep(5000);
	 		
	}
	public static void gotoCheckout()
	{
		pageobjects.BasketPage.checkoutbtn.click();
	}

}
