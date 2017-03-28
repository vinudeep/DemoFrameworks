package pageobjects;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


public class MouseHoverPage extends BaseClass 
{
	
   	  public MouseHoverPage(WebDriver driver) 
   	  {
		super(driver);
		// TODO Auto-generated constructor stub
   	  }

   	//Below will click on the Header Just to move mouse
  	@FindBy(how=How.ID,using=("shop-simplicity-header-xxl"))
  	public static WebElement MoveMouseOnShopHeader;
  	
  	
   	//Below will click on the Shop Tab
   	@FindBy(how=How.ID,using="pn1") 
	public static WebElement MoveMouseOnShopTab;
   	
   	//Below will click on the Phones Link	
	@FindBy(how=How.XPATH,using=("//a[contains(text(), 'Phones')]"))
	public static WebElement MoveMouseOnPhones;

	//Below will click on the Phone -- > Like New 
	@FindBy(how=How.XPATH,using=("//a[contains(text(), 'Like New')]"))
	public static WebElement MoveMouseOnLikeNew;
	
	//Below will click on the Sims 
	@FindBy(how=How.XPATH,using=("//a[contains(text(), 'Sims')]"))
	public static WebElement MoveMouseOnSims;
	
	//Below will click on the Sims -- > PayM 
	@FindBy(how=How.XPATH,using=("//a[contains(text(), 'Pay Monthly sims')]"))
	public static WebElement MoveMouseOnPayMSims;
	
		
	//Below will click on the Tablets Tab
	@FindBy(how=How.ID,using=("shop-simplicity-header-xxl"))
	public static WebElement MoveMouseOnTablets;
}


