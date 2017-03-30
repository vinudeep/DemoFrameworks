package pageobjects;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import helpers.Environment;


public class MouseHoverPage extends Environment
{
	
   	 
   	//Below will click on the Header Just to move mouse
  	@FindBy(how=How.ID,using=("shop-simplicity-header-xxl"))
  	public static WebElement MoveMouseOnShopHeader;
  	
  	
   	//Below will click on the Shop Tab
   	@FindBy(how=How.ID,using="pn1") 
	public static WebElement MoveMouseOnShopTab;
   	
   	//Below will click on the Phones Link	
	@FindBy(how=How.XPATH,using=("//a[contains(text(), 'Phones')]"))
	public static WebElement MoveMouseOnPhones;

	@FindBy(how=How.XPATH,using=("//a[contains(text(), 'Pay Monthly phones')]"))
	public static WebElement MoveMouseOnPAYMPhones;
	
	@FindBy(how=How.XPATH,using=("//a[contains(text(), 'Pay As You Go phones')]"))
	public static WebElement MoveMouseOnPAYGPhones;
	
	@FindBy(how=How.XPATH,using=("//a[contains(text(), 'Browse Phones')]"))
	public static WebElement MoveMouseOnBrowsePhones;
	
	
	//Below will click on the Phone -- > Like New 
	@FindBy(how=How.XPATH,using=("//a[contains(text(), 'Like New')]"))
	public static WebElement MoveMouseOnLikeNew;
	
	//Below will click on the Sims 
	@FindBy(how=How.XPATH,using=("//a[contains(text(), 'Sims')]"))
	public static WebElement MoveMouseOnSims;
	
	//Below will click on the Sims -- > PayM 
	@FindBy(how=How.XPATH,using=("//a[contains(text(), 'Pay Monthly sims')]"))
	public static WebElement MoveMouseOnPayMSims;
	
		
	
	
	@FindBy(how=How.XPATH,using=("//a[contains(text(), 'Upgrades')]"))
	public static WebElement MouseMoveonUpgrade;
	
	@FindBy(how=How.XPATH,using=("//a[contains(text(), 'Upgrade now')]"))
	public static WebElement MouseMoveonUpgradeAndUpgradeNow;
	
	
	//Below will click on the Tablets Tab
	
	@FindBy(how=How.XPATH,using=("//a[contains(text(), 'Browse Tablets')]"))
	public static WebElement MoveMouseOnBrowseTablets;
	
	@FindBy(how=How.XPATH,using=("//a[contains(text(), 'Tablets')]"))
	public static WebElement MoveMouseOnTablets;
	
	
}


