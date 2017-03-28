package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

;

public class Sim_Free_Phone_POM extends BaseClass {
	
	 
	  
	  public Sim_Free_Phone_POM(WebDriver Idriver)
	  {
		  
		  super(driver);
		  
	  }

		@FindBy(how=How.XPATH,using="(//*[@id='PayMonthlyTariffsGridTab']/li[1]/div/h3)[1]") 
		WebElement Device_only_sim_free_Tile ;
	
		
		@FindBy(how=How.XPATH,using="(//*[@id='PayMonthlyTariffsGridTab']/li[2]/div/h3)[1]") 
		WebElement PayM_sim_free_Tile ;
		
		@FindBy(how=How.XPATH,using="(//*[@id='PayMonthlyTariffsGridTab']/li[3]/div/h3)[1]") 
		WebElement PayG_sim_free_Tile ;
		
		@FindBy(how=How.XPATH,using="(//*[@id='PayMonthlyTariffsGridTab']/li[1]/div/div[4]/button[@value='Select'])[1]") 
		WebElement Device_only_sim_free_Select ;
		
		
		@FindBy(how=How.XPATH,using="(//a[contains(@href, '/shop/phones/oneplus/3t/#contractType=paymonthly')]") 
		WebElement Oneplus3TSelect;
				
		@FindBy(how=How.XPATH,using="(//*[@id='PayMonthlyTariffsGridTab']/li[2]/div/div[5]/button[@value='Select'])[1]") 
		WebElement PayM_sim_free_Select ;

		@FindBy(how=How.XPATH,using="(//*[@id='PayMonthlyTariffsGridTab']/li[3]/div/div[5]/button[@value='Select'])[1]") 
		WebElement PayG_sim_free_Select;
		
		
		public void validatetile()
		{   System.out.println(" ");
			System.out.println("SIM_FREE_PHONE_PAGE_VALIDATION");
			
			if(Device_only_sim_free_Tile.getText().contains("Device only - sim free"))
			 {
				System.out.println("The Element Tile is Present and the Text is :" + Device_only_sim_free_Tile.getText() );
			 }else{
			  System.out.println("The  Element Tile is Absent and the Text is :" +Device_only_sim_free_Tile.getText());
			 }
		
			if(PayM_sim_free_Tile.getText().contains("Add a Pay Monthly sim"))
			 {
				System.out.println("The Element Tile is Present and the Text is :" +PayM_sim_free_Tile.getText() );
			 }else{
			  System.out.println("The  Element Tile is Absent and the Text is :" +PayM_sim_free_Tile.getText());
			 }
			if(PayG_sim_free_Tile.getText().contains("Add a Pay As You Go Sim"))
			 {
				System.out.println("The Element Tile is Present and the Text is :" +PayG_sim_free_Tile.getText());
			 }else{
			  System.out.println("The  Element Tile is Absent and the Text is :" +PayG_sim_free_Tile.getText());
			 }
				
			
		}
		public void ElementClick(String elementName) throws InterruptedException {
			
			if(elementName.contains("Device_only_sim_free_Select"))
			{
				Device_only_sim_free_Select.sendKeys(Keys.ENTER);;
			}
			if(elementName.contains("PayM_sim_free_Select"))
			{    
				PayM_sim_free_Select.sendKeys(Keys.ENTER);;
			}
			if(elementName.contains("PayG_sim_free_Select"))
			{
				PayM_sim_free_Select.sendKeys(Keys.ENTER);;
			}
			if(elementName.contains("Oneplus3TSelect"))
			{
				Device_only_sim_free_Select.sendKeys(Keys.ENTER);;
			}
			
			}

	
}
