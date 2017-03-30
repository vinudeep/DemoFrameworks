package pageobjects;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PAYMSimOPage {

	
//	@FindBy(how=How.XPATH,using="//*[@id='pn1']/a/dl/dt") 
//	public static WebElement shomhome;
	
//	@FindBy(how=How.XPATH,using=("//*[@id='pn1']/ul/li[6]/a"))   
//	public static WebElement shopsims;
	
	@FindBy(how=How.XPATH,using=("//*[@id='no']/span"))  //no thank for customer help
	public static WebElement shopnothanks;
	
//	@FindBy(how=How.XPATH,using=("//*[@id='pn1']/ul/li[6]/ul/li[2]/a"))
//	public static WebElement shopsimspaymsims;
			
	@FindBy(how=How.XPATH,using=("//*[@id='tablet']"))
	public static  WebElement shoptablet;		
	
	@FindBy(how=How.XPATH,using=("//*[@id='id-12-months']/p/a"))
	public static WebElement twelevemonths;	
	
	@FindBy(how=How.XPATH,using=("//*[@id='id-30-days']/p/a"))
	public static WebElement thirtydays;
	
	@FindBy(how=How.XPATH,using=("//*[@id='67533f03-4e8b-4089-8d3a-fdaf4e1cd2a2']/div[5]"))
	public static WebElement month12firsttariff;
			
	@FindBy(how=How.XPATH,using=("//*[@id='11ca80ab-cee8-4b8a-afc5-d638ce897899']/div[6]"))
	public static WebElement day30firsttariff;
	
	@FindBy(how=How.XPATH,using=("//*[@id='contentWrapper']/div[3]/div"))
	public static WebElement tariffsorting;		
	
	// Modified on 10/03/2017- Nag			
	@FindBy(how=How.XPATH,using=("//*[@id='2906f2c0-ac58-4e64-b199-e8d0c21b36df']/div[4]"))
	public static WebElement promotionprimary;
	
	@FindBy(how=How.XPATH,using=("//*[@id='2906f2c0-ac58-4e64-b199-e8d0c21b36df']/div[5]"))
	public static WebElement promotionsecondary;
	
	@FindBy(how = How.XPATH, using = "//*[@id='shop-simplicity-header-xxl']/div/div/div/h1")
	public static WebElement paymheader;

	@FindBy(how = How.XPATH, using = ("//*[@id='phone']/a"))
	public static WebElement simphonetab;

	@FindBy(how = How.XPATH, using = ("//*[@id='tablet']/a"))
	public static WebElement simtablettab;

	@FindBy(how = How.XPATH, using = ("//*[@id='mbb']/a"))
	public static WebElement simmbbtab;

	@FindBy(how = How.XPATH, using = ("//*[@id='contentWrapper']/div[3]/div/div[2]/a"))
	public static WebElement whychoosesimolink;

	@FindBy(how = How.XPATH, using = ("//*[@id='contentWrapper']/div[3]/div/div[9]/div/div[1]/ul/li[1]/img"))
	public static WebElement wifi_img;

	@FindBy(how = How.XPATH, using = ("//*[@id='contentWrapper']/div[3]/div/div[9]/div/div[1]/ul/li[1]/span"))
	public static WebElement wifi_img_txt;

	@FindBy(how = How.XPATH, using = ("//*[@id='contentWrapper']/div[3]/div/div[9]/div/div[1]/ul/li[2]/img"))
	public static WebElement keepyournumb_img;

	@FindBy(how = How.XPATH, using = ("//*[@id='contentWrapper']/div[3]/div/div[9]/div/div[1]/ul/li[2]/span"))
	public static WebElement keepyournumb_img_txt;

	@FindBy(how = How.XPATH, using = ("//*[@id='contentWrapper']/div[3]/div/div[9]/div/div[1]/ul/li[3]/img"))
	public static WebElement rank_img;

	@FindBy(how = How.XPATH, using = ("//*[@id='contentWrapper']/div[3]/div/div[9]/div/div[1]/ul/li[3]/span"))
	public static WebElement rank_img_txt;

	@FindBy(how = How.XPATH, using = ("//*[@id='contentWrapper']/div[3]/div/div[9]/div/div[1]/ul/li[4]/img"))
	public static WebElement tugo_img;

	@FindBy(how = How.XPATH, using = ("//*[@id='contentWrapper']/div[3]/div/div[9]/div/div[1]/ul/li[4]/span"))
	public static WebElement tugo_img_txt;

	@FindBy(how = How.XPATH, using = ("//*[@id='contentWrapper']/div[3]/div/div[9]/div/div[1]/div[2]/h3"))
	public static WebElement whychoosesimowrap;

	@FindBy(how = How.XPATH, using = ("//*[@id='contentWrapper']/div[3]/div/div[9]/div/div[2]/div[2]/h3"))
	public static WebElement whyo2;

	@FindBy(how = How.XPATH, using = ("//*[@id='contentWrapper']/div[3]/div/div[9]/div/div[2]/ul/li[1]/img"))
	public static WebElement whyo2priority;

	@FindBy(how = How.XPATH, using = ("//*[@id='contentWrapper']/div[3]/div/div[9]/div/div[2]/ul/li[1]/div"))
	public static WebElement whyo2priority_txt;

	@FindBy(how = How.XPATH, using = ("//*[@id='contentWrapper']/div[3]/div/div[9]/div/div[2]/ul/li[2]/img"))
	public static WebElement whyo2guru;

	@FindBy(how = How.XPATH, using = ("//*[@id='contentWrapper']/div[3]/div/div[9]/div/div[2]/ul/li[2]/div"))
	public static WebElement whyo2guru_txt;

	@FindBy(how = How.XPATH, using = ("//*[@id='contentWrapper']/div[3]/div/div[9]/div/div[2]/ul/li[3]/img"))
	public static WebElement whyo2myo2;

	@FindBy(how = How.XPATH, using = ("//*[@id='contentWrapper']/div[3]/div/div[9]/div/div[2]/ul/li[3]/div"))
	public static WebElement whyo2myo2_txt;
/*
	@FindBy(how = How.XPATH, using = ("//*[@id='57f98c88-687a-4ba4-96ce-0f1e8bf1e1ea']/div[9]"))
	public static WebElement recomormostpop;
*/
/*
	@FindBy(how = How.XPATH, using = ("//*[@id='8d953bfa-90ae-44c1-bfd5-18814d6f4a00']/div[6]"))
	public static WebElement tariff1tile;
*/
	@FindBy(how = How.XPATH, using = ("//*[@id='contentWrapper']/div[3]/div/div[6]/div[7]/div[9]"))
	public static WebElement tariff1tile;
	
	@FindBy(how = How.XPATH, using = ("//*[@id='contentWrapper']/div[3]/div/div[6]/div[11]/div[6]"))
	public static WebElement tariff2tile;
	
	@FindBy(how = How.XPATH, using = ("//*[@id='contentWrapper']/div[3]/div/div[6]/div[12]/div[6]"))
	public static WebElement tariff3tile;
	
	@FindBy(how = How.XPATH, using = ("//*[@id='contentWrapper']/div[3]/div/div[6]/div[13]/div[6]"))
	public static WebElement tariff4tile;
	
	@FindBy(how = How.XPATH, using = ("//*[@id='contentWrapper']/div[3]/div/div[6]/div[14]/div[6]"))
	public static WebElement tariff5tile;
	
	@FindBy(how = How.XPATH, using = ("//*[@id='contentWrapper']/div[3]/div/div[6]/div[15]/div[6]"))
	public static WebElement tariff6tile;
	
	@FindBy(how = How.XPATH, using = ("//*[@id='contentWrapper']/div[3]/div/div[6]/div[16]/div[6]"))
	public static WebElement tariff7tile;
	
	@FindBy(how = How.XPATH, using = ("//*[@id='contentWrapper']/div[3]/div/div[6]/div[17]/div[6]"))
	public static WebElement tariff8tile;
	
	/*
	@FindBy(how = How.XPATH, using = ("//*[@id='2d98d27d-28b1-4cbb-93ca-812672aef8ab']/div[6]"))
	public static WebElement tariff2tile;

	@FindBy(how = How.XPATH, using = ("//*[@id='dd98ff71-32c5-4e6b-9623-4766d629bd29']/div[6]"))
	public static WebElement tariff3tile;

	@FindBy(how = How.XPATH, using = ("//*[@id='04b0ac2c-a1d5-4a3c-8964-e7df3c8c2020']/div[6]"))
	public static WebElement tariff4tile;
	
	*/
	
	
	@FindBy(how = How.XPATH, using = ("//button[contains(text(),'Buy now'"))
	public static WebElement BuyNowButton;
	
	@FindBy(how = How.XPATH, using = ("//*[@id='checkbox-57f98c88-687a-4ba4-96ce-0f1e8bf1e1ea-6']"))
	public static WebElement CheckboxPresence;
	
	@FindBy(how = How.XPATH, using = ("//*[@id='checkbox-57f98c88-687a-4ba4-96ce-0f1e8bf1e1ea-6']"))
	public static WebElement CheckboxName;
	
	//@FindBy(how = How.CLASS_NAME, using = ("col-xs-12 promotion-ribbon"))
	//WebElement PromotionDisplay;
	
	@FindBy(how = How.XPATH, using = ("//a[contains(@href, '#phone-tab')]"))
	public static WebElement PhoneTab;
	
	@FindBy(how=How.XPATH,using=("//a[contains(text(),'12 months')]"))
	public static WebElement months12tab;
	
	@FindBy(how=How.XPATH,using=("//a[contains(text(),'30 days')]"))
	public static WebElement days30tab;
	
	@FindBy(how=How.CSS,using=(".col-xs-12.promotion-ribbon"))
	public static WebElement PromotionTariff;
	
	

	
}

