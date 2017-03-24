package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


public class SimFreeDevicePage {
	
	 WebDriver driver;
	  
	  public SimFreeDevicePage(WebDriver Idriver)
	  {
		  
		  this.driver=Idriver;
		  
	  }

		@FindBy(how=How.XPATH,using="(//*[@id='PayMonthlyTariffsGridTab']/li[1]/div/h3)[1]") 
		public static WebElement Device_only_sim_free_Tile ;
	
		
		@FindBy(how=How.XPATH,using="(//*[@id='PayMonthlyTariffsGridTab']/li[2]/div/h3)[1]") 
		public static WebElement PayM_sim_free_Tile ;
		
		@FindBy(how=How.XPATH,using="(//*[@id='PayMonthlyTariffsGridTab']/li[3]/div/h3)[1]") 
		public static WebElement PayG_sim_free_Tile ;
		
		@FindBy(how=How.XPATH,using="(//*[@id='PayMonthlyTariffsGridTab']/li[1]/div/div[4]/button[@value='Select'])[1]") 
		public static WebElement Device_only_sim_free_Select ;
		
		@FindBy(how=How.XPATH,using="(//*[@id='PayMonthlyTariffsGridTab']/li[2]/div/div[5]/button[@value='Select'])[1]") 
		public static WebElement PayM_sim_free_Select ;

		@FindBy(how=How.XPATH,using="(//*[@id='PayMonthlyTariffsGridTab']/li[3]/div/div[5]/button[@value='Select'])[1]") 
		public static WebElement PayG_sim_free_Select;
		

	
}
