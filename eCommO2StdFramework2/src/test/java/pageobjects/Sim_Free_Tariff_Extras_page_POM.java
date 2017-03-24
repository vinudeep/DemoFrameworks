package pageobjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Sim_Free_Tariff_Extras_page_POM {

	WebDriver driver;
	  
	  public Sim_Free_Tariff_Extras_page_POM(WebDriver Idriver)
	  {
		  
		  this.driver=Idriver;
		  
	  }

		@FindBy(how=How.XPATH,using="(//a[contains(text(),'Pay Monthly')])[5]")
		WebElement PayMTab;
		
		@FindBy(how=How.XPATH,using=("(//a[contains(text(),'Pay As You Go')])[9]"))
		WebElement PayGTab;
		
		
	//	@FindBy(how=How.XPATH,using=("//*[@id='header']/div[2]/div[1]/div/button"))
		//WebElement GotoBasket;
		
		@FindBy(how=How.XPATH,using=("//*[@id='orientationMonthly']/div[1]/div[3]/label"))
		WebElement Contractlength;
		
		@FindBy(how=How.XPATH,using=("//a[contains(text(),'12 months')]"))
		WebElement months12tab;
		
		@FindBy(how=How.XPATH,using=("//a[contains(text(),'30 days')]"))
		WebElement days30tab;
		
		@FindBy(how=How.XPATH,using=("(//*[@id='callToAction'])[2]"))
		WebElement month12tarrif500mb;
		
		@FindBy(how=How.XPATH,using=("(//*[@id='callToAction'])[3]"))
		WebElement month30tarrif500mb;
		
		@FindBy(how=How.XPATH,using=("//*[@id='qa-tariff-contract-length']"))
		WebElement Tariffvaladity;
		
		@FindBy(how=How.XPATH,using=("(//div/label)[1]"))
		WebElement Contract_length;
		
		//Below is for identifying through id
		
		@FindBy(id="qa-proceed-to-basket")
		WebElement addToBasketLive;
		
		@FindBy(id="qa-proceed-to-basket-dock-header")
		WebElement addToBasketDockHeader;
		
		@FindBy(id="addToBasket")
		WebElement addToBasketTest;
		
		
		public void validateElements()
		{  System.out.println(" ");
			System.out.println("SIM_FREE_TARIFF_EXTRAS_PAGE_VALIDATION");
			
			if(PayMTab.getText().contains("Pay Monthly"))
			 {
				System.out.println("The Paym_Tab is Present and the Text is :" + PayMTab.getText() );
			 }else{
			  System.out.println("The  Paym_Tab is Absent and the Text is :" + PayMTab.getText());
			 }
		
			if(PayGTab.getText().contains("Pay As You Go"))
			 {
				System.out.println("The PayG_Tab is Present and the Text is :" +PayGTab.getText() );
			 }else{
			  System.out.println("The  PayG_Tab is Absent and the Text is :" +PayGTab.getText());
			 }
			
			/* if(GotoBasket.getText().contains("Go to basket"))
			 {
				System.out.println("The GoToBasket_Tab is Present and the Text is :" +GotoBasket.getText());
			 }else{
			  System.out.println("The  GoToBasket_Tab is Absent and the Text is :" +GotoBasket.getText());
			  
			 }*/
			
			if(Contractlength.getText().contains("Contract length"))
			 {
				System.out.println("The Contractlength_label is Present and the Text is :" +Contractlength.getText());
			 }else{
			  System.out.println("The  Contractlength_label is Absent and the Text is :" +Contractlength.getText());
			  
			 }
			if(months12tab.getText().contains("12 months"))
			 {
				System.out.println("The 12 months_Tab is Present and the Text is :" +months12tab.getText());
			 }else{
			  System.out.println("The  12 months_Tab is Absent and the Text is :" +months12tab.getText());
			  
			 }
			if(months12tab.isEnabled())
			{
				System.out.println("The 12 months_Tab is enabled by defaultly");
			}else
			{
				System.out.println("The 12 months_Tab is not enabled by defaultly");
				
			}
			
			if(days30tab.getText().contains("30 days"))
			 {
				System.out.println("The 30 days_Tab is Present and the Text is :" +days30tab.getText());
			 }else{
			  System.out.println("The  30 days_Tab is Absent and the Text is :" +days30tab.getText());
			  
			 }
			
			
     
		}
		public void tariff_select(String ElementName) 
		{
			if(ElementName.contains("tariff_12"))
			{
				month12tarrif500mb.sendKeys(Keys.ENTER);
			}
			
			if(ElementName.contains("tariff_30"))
			{
				month12tarrif500mb.sendKeys(Keys.ENTER);
			}
			
			
		}
		
		public void basket_selectLive()
		{
			
			System.out.println("Now Adding to the basket");
			addToBasketLive.click();
			System.out.println("Added to the basket");
			
					
		}
		
		
		public void basket_selectTest()
		{
			System.out.println("Now Adding to the basket");
			addToBasketDockHeader.click();
			System.out.println("Added to the basket");
					
			
		}
		
		public void Tab_Select(String elementName) {
			if(elementName.equalsIgnoreCase("12months"))
			{
				months12tab.sendKeys(Keys.ENTER);
			}
			
			if(elementName.equalsIgnoreCase("30days"))
			{
				days30tab.sendKeys(Keys.ENTER);
			}
			
		}
		public void tariffvalidation(String ElementName) 
		{
			if(ElementName.equalsIgnoreCase(Tariffvaladity.getText()))
			{
				
				System.out.println("The Tariff detail is Present and the Text is :" +Tariffvaladity.getText());
			 }
			else
			{
			  System.out.println("The Tariff detail is  Absent and the Text is :" +Tariffvaladity.getText());	
			
		    }
		}
		public void elementvisibility()
		{
			if(Contract_length.isDisplayed())
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
