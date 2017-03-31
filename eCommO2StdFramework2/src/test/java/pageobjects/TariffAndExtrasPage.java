package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class TariffAndExtrasPage {

	@FindBy(how=How.XPATH,using="(//a[contains(text(),'Pay Monthly')])[5]")
	public static WebElement PayMTab;
	
	@FindBy(how=How.XPATH,using=("(//a[contains(text(),'Pay As You Go')])[9]"))
	public static WebElement PayGTab;		
		
		@FindBy(how=How.XPATH,using=("//*[@id='header']/div[2]/div[1]/div/button"))
		public static WebElement GotoBasket;
		
		@FindBy(how=How.XPATH,using=("//label[contains(text(),'Contract length')]"))
		public static WebElement Contractlength;
		
		@FindBy(how=How.XPATH,using=("//a[contains(text(),'12 months')]"))
		public static WebElement months12tab;
		
		@FindBy(how=How.XPATH,using=("//a[contains(text(),'30 days')]"))
		public static WebElement days30tab;
		
		@FindBy(how=How.XPATH,using=("(//*[@id='callToAction'])[2]"))
		public static WebElement month12tarrif500mb;
		
		@FindBy(how=How.XPATH,using=("(//*[@id='callToAction'])[3]"))
		public static WebElement month30tarrif500mb;
		
		@FindBy(how=How.XPATH,using=("//*[@id='qa-tariff-contract-length']"))
		public static WebElement Tariffvaladity;
		
		@FindBy(how=How.XPATH,using=("(//div/label)[1]"))
		public static WebElement Contract_length;
		
		//Below is for identifying through id
		
		@FindBy(id="qa-proceed-to-basket")
		public static WebElement addToBasketLive;
		
		@FindBy(id="qa-proceed-to-basket-dock-header")
		public static WebElement addToBasketDockHeader;
		
		@FindBy(id="addToBasket")
		public static WebElement addToBasketTest;
}
