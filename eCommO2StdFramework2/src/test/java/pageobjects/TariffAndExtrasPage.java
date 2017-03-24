package pageobjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class TariffAndExtrasPage {

	WebDriver driver;
	  
	  public TariffAndExtrasPage(WebDriver Idriver)
	  {
		  
		  this.driver=Idriver;
		  
	  }

		@FindBy(how=How.XPATH,using="//*[@id='tariffContainer']/div[1]/ul/li[1]/a")
		public static WebElement PayMTab;
		
		@FindBy(how=How.XPATH,using=("//*[@id='tariffContainer']/div[1]/ul/li[2]/a"))
		public static WebElement PayGTab;		
		
		@FindBy(how=How.XPATH,using=("//*[@id='header']/div[2]/div[1]/div/button"))
		public static WebElement GotoBasket;
		
		@FindBy(how=How.XPATH,using=("//*[@id='orientationMonthly']/div[1]/div[3]/label"))
		public static WebElement Contractlength;
		
		@FindBy(how=How.XPATH,using=("//a[contains(text(),'12 months')]"))
		public static WebElement months12tab;
		
		@FindBy(how=How.XPATH,using=("//a[contains(text(),'30 days')]"))
		public static WebElement days30tab;
		
		@FindBy(how=How.XPATH,using=("(//*[@id='callToAction'])[2]"))
		public static WebElement month12tarrif500mb;
		
		@FindBy(how=How.XPATH,using=("(//*[@id='callToAction'])[3]"))
		public static WebElement month30tarrif500mb;
		
		@FindBy(how=How.XPATH,using=("//*[@id='packageTariff']/li"))
		public static WebElement Tariffvaladity;
		
		@FindBy(how=How.XPATH,using=("(//div/label)[1]"))
		public static WebElement Contract_length;
		
		//Below is for identifying through id
		
				@FindBy(id="qa-proceed-to-basket")
				public static WebElement addToBasket;
				
				@FindBy(id="qa-proceed-to-basket-dock-header")
				public static WebElement addToBasketDockHeader;
	
	
}
