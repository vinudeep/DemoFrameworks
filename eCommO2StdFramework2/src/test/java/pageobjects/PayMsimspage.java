package pageobjects;

import java.io.IOException;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PayMsimspage {

	WebDriver driver;

	public PayMsimspage(WebDriver Idriver) {

		this.driver = Idriver;

	}

	@FindBy(how = How.XPATH, using = "//*[@id='shop-simplicity-header-xxl']/div/div/div/h1")
	WebElement paymheader;

	@FindBy(how = How.XPATH, using = ("//*[@id='phone']/a"))
	WebElement simphonetab;

	@FindBy(how = How.XPATH, using = ("//*[@id='tablet']/a"))
	WebElement simtablettab;

	@FindBy(how = How.XPATH, using = ("//*[@id='mbb']/a"))
	WebElement simmbbtab;

	@FindBy(how = How.XPATH, using = ("//*[@id='contentWrapper']/div[3]/div/div[2]/a"))
	WebElement whychoosesimolink;

	@FindBy(how = How.XPATH, using = ("//*[@id='contentWrapper']/div[3]/div/div[9]/div/div[1]/ul/li[1]/img"))
	WebElement wifi_img;

	@FindBy(how = How.XPATH, using = ("//*[@id='contentWrapper']/div[3]/div/div[9]/div/div[1]/ul/li[1]/span"))
	WebElement wifi_img_txt;

	@FindBy(how = How.XPATH, using = ("//*[@id='contentWrapper']/div[3]/div/div[9]/div/div[1]/ul/li[2]/img"))
	WebElement keepyournumb_img;

	@FindBy(how = How.XPATH, using = ("//*[@id='contentWrapper']/div[3]/div/div[9]/div/div[1]/ul/li[2]/span"))
	WebElement keepyournumb_img_txt;

	@FindBy(how = How.XPATH, using = ("//*[@id='contentWrapper']/div[3]/div/div[9]/div/div[1]/ul/li[3]/img"))
	WebElement rank_img;

	@FindBy(how = How.XPATH, using = ("//*[@id='contentWrapper']/div[3]/div/div[9]/div/div[1]/ul/li[3]/span"))
	WebElement rank_img_txt;

	@FindBy(how = How.XPATH, using = ("//*[@id='contentWrapper']/div[3]/div/div[9]/div/div[1]/ul/li[4]/img"))
	WebElement tugo_img;

	@FindBy(how = How.XPATH, using = ("//*[@id='contentWrapper']/div[3]/div/div[9]/div/div[1]/ul/li[4]/span"))
	WebElement tugo_img_txt;

	@FindBy(how = How.XPATH, using = ("//*[@id='contentWrapper']/div[3]/div/div[9]/div/div[1]/div[2]/h3"))
	WebElement whychoosesimowrap;

	@FindBy(how = How.XPATH, using = ("//*[@id='contentWrapper']/div[3]/div/div[9]/div/div[2]/div[2]/h3"))
	WebElement whyo2;

	@FindBy(how = How.XPATH, using = ("//*[@id='contentWrapper']/div[3]/div/div[9]/div/div[2]/ul/li[1]/img"))
	WebElement whyo2priority;

	@FindBy(how = How.XPATH, using = ("//*[@id='contentWrapper']/div[3]/div/div[9]/div/div[2]/ul/li[1]/div"))
	WebElement whyo2priority_txt;

	@FindBy(how = How.XPATH, using = ("//*[@id='contentWrapper']/div[3]/div/div[9]/div/div[2]/ul/li[2]/img"))
	WebElement whyo2guru;

	@FindBy(how = How.XPATH, using = ("//*[@id='contentWrapper']/div[3]/div/div[9]/div/div[2]/ul/li[2]/div"))
	WebElement whyo2guru_txt;

	@FindBy(how = How.XPATH, using = ("//*[@id='contentWrapper']/div[3]/div/div[9]/div/div[2]/ul/li[3]/img"))
	WebElement whyo2myo2;

	@FindBy(how = How.XPATH, using = ("//*[@id='contentWrapper']/div[3]/div/div[9]/div/div[2]/ul/li[3]/div"))
	WebElement whyo2myo2_txt;

	@FindBy(how = How.XPATH, using = ("//*[@id='57f98c88-687a-4ba4-96ce-0f1e8bf1e1ea']/div[9]"))
	WebElement recomormostpop;

	@FindBy(how = How.XPATH, using = ("//*[@id='8d953bfa-90ae-44c1-bfd5-18814d6f4a00']/div[6]"))
	WebElement tariff1tile;

	@FindBy(how = How.XPATH, using = ("//*[@id='2d98d27d-28b1-4cbb-93ca-812672aef8ab']/div[6]"))
	WebElement tariff2tile;

	@FindBy(how = How.XPATH, using = ("//*[@id='dd98ff71-32c5-4e6b-9623-4766d629bd29']/div[6]"))
	WebElement tariff3tile;

	@FindBy(how = How.XPATH, using = ("//*[@id='04b0ac2c-a1d5-4a3c-8964-e7df3c8c2020']/div[6]"))
	WebElement tariff4tile;
	
	@FindBy(how = How.XPATH, using = ("//button[contains(text(),'Buy now'"))
	WebElement BuyNowButton;
	
	@FindBy(how = How.XPATH, using = ("//*[@id='checkbox-57f98c88-687a-4ba4-96ce-0f1e8bf1e1ea-6']"))
	WebElement CheckboxPresence;
	
	@FindBy(how = How.XPATH, using = ("//*[@id='checkbox-57f98c88-687a-4ba4-96ce-0f1e8bf1e1ea-6']"))
	WebElement CheckboxName;
	
	//@FindBy(how = How.CLASS_NAME, using = ("col-xs-12 promotion-ribbon"))
	//WebElement PromotionDisplay;
	
	@FindBy(how = How.XPATH, using = ("//a[contains(@href, '#phone-tab')]"))
	WebElement PhoneTab;
	
	@FindBy(how=How.XPATH,using=("//a[contains(text(),'12 months')]"))
	public static WebElement months12tab;
	
	@FindBy(how=How.XPATH,using=("//a[contains(text(),'30 days')]"))
	public static WebElement days30tab;
	
	
	public boolean ElementEnable()
	{
		if(PhoneTab.isEnabled()){
			System.out.println("The <<--Phone Tab-->> is enabled by default");
		return true;
		}
		else
		{
			System.out.println("The <<--Phone Tab-->> is enabled by default");
		return false;
	   }
		
		}
	public void ElementClick(String elementName) throws InterruptedException 
	{
		if (elementName.equalsIgnoreCase("PhoneTab"))
			PhoneTab.sendKeys(Keys.ENTER);
		
	
	}
	

	
	public void ElementClick2(String elementName) throws InterruptedException 
	{

		if(months12tab.getText().equalsIgnoreCase("12 months"))
		 {
			System.out.println("The 12 months_Tab is Present and the Text is :" +months12tab.getText());
		 }else{
		  System.out.println("The  12 months_Tab is Absent and the Text is :" +months12tab.getText());
		  
		 }
		
		if(days30tab.getText().equalsIgnoreCase("30 days"))
		 {
			System.out.println("The 30 days_Tab is Present and the Text is :" +days30tab.getText());
		 }else{
		  System.out.println("The  30 days_Tab is Absent and the Text is :" +days30tab.getText());
		  
		 }
		if (paymheader.getText().equalsIgnoreCase("Pay Monthly sims"))
			System.out.println("Pay monthly sims banner header - as per today is displayed");
		else

			System.out.println("Pay monthly sims banner header not displayed");

		if (simphonetab.getText().equalsIgnoreCase("Phone"))
			System.out.println("Phones tab is displayed");
		else
			System.out.println("Phones tab is not displayed");

		if (simtablettab.getText().equalsIgnoreCase("Tablet"))
			System.out.println("Tablet tab is displayed");
		else
			System.out.println("Tablet tab is not displayed");

		if (simmbbtab.getText().equalsIgnoreCase("Mobile broadband"))
			System.out.println("Mobile broadband tab is displayed");
		else
			System.out.println("Mobile broadband is not displayed");

		if (whychoosesimolink.getText().equalsIgnoreCase("Why choose an O2 Pay Monthly sim?")) 
		{
			System.out.println("Why choose an O2 Pay Monthly sim? - link is displayed");
			//whychoosesimolink.click();

			boolean variable1 = whychoosesimowrap.isDisplayed();

			System.out.println("The Why choose simo wrap is displayed");
			//System.out.println(variable1);
			//Thread.sleep(1000);

			whychoosesimolink.click();
		}

		else
			System.out.println("Why choose an O2 Pay Monthly sim?-link is not displayed");

		if (whychoosesimowrap.getText().equalsIgnoreCase("Why choose an O2 Pay Monthly sim?")) {
			System.out.println("Why choose an O2 Pay Monthly sim? - section is displayed");

			boolean wrap1 = wifi_img.isDisplayed();
			if (wrap1 = true) {
				System.out.println("Wifi image is displayed");
			}

			boolean wrap1_txt = wifi_img_txt.isDisplayed();
			if (wrap1_txt = true) {
				System.out
						.println("Save your data when you're out and about. With free O2 Wifi.- copytext is displayed");
			}

			boolean wrap2 = keepyournumb_img.isDisplayed();
			if (wrap2 = true) {
				System.out.println("Keep your number image is displayed");
			}

			boolean wrap2_txt = keepyournumb_img_txt.isDisplayed();
			if (wrap2_txt = true) {
				System.out
						.println("Save your data when you're out and about. With free O2 Wifi.- copytext is displayed");
			}

			boolean wrap3 = rank_img.isDisplayed();
			if (wrap3 = true) {
				System.out.println("Rank image is displayed");
			}

			boolean wrap3_txt = rank_img_txt.isDisplayed();
			if (wrap3_txt = true) {
				System.out.println(
						"We've been ranked No.1 for customer service by Ofcom, 7th time in a row.- copytext is displayed");
			}

			boolean wrap4 = tugo_img.isDisplayed();
			if (wrap4 = true) {
				System.out.println("Rank image is displayed");
			}

			boolean wrap4_txt = tugo_img_txt.isDisplayed();
			if (wrap4_txt = true) {
				System.out.println(
						"We've been ranked No.1 for customer service by Ofcom, 7th time in a row.- copytext is displayed");
			}

		} else
			System.out.println("Why choose an O2 Pay Monthly sim? - section is not displayed ");

		/*boolean tile = recomormostpop.isDisplayed();

		if (tile = true) {
			System.out.println("Most popular/Recommended tariff tile is displayed");
		}

		boolean tile1 = tariff1tile.isDisplayed();

		if (tile1 = true) {
			System.out.println("First tariff tile is displayed");
		} else
			System.out.println("First tariff tile not displayed");

		boolean tile2 = tariff2tile.isDisplayed();

		if (tile2 = true) {
			System.out.println("Second tariff tile is displayed");
		} else
			System.out.println("Second tariff tile not displayed");

		boolean tile3 = tariff2tile.isDisplayed();

		if (tile3 = true) {
			System.out.println("Third tariff tile is displayed");
		} else
			System.out.println("Third tariff tile not displayed");

		boolean tile4 = tariff2tile.isDisplayed();

		if (tile4 = true) {
			System.out.println("Fourth tariff tile is displayed");
		} else
			System.out.println("Fourth tariff tile not displayed");

		if (whyo2.getText().contains("Why O2?")) {
			System.out.println("Why O2 section is displayed");

			boolean whyo2_1 = whyo2priority.isDisplayed();

			if (whyo2_1 = true) {
				System.out.println("Priority image is displayed");
			} else
				System.out.println("Priority image is not displayed");

			boolean whyo2_2 = whyo2priority_txt.isDisplayed();

			if (whyo2_2 = true) {
				System.out.println("Priority copytext is displayed");
			} else
				System.out.println("Priority copytext is not displayed");
			
			boolean whyo2_3 = whyo2guru.isDisplayed();

			if (whyo2_3 = true) {
				System.out.println("Guru image is displayed");
			} else
				System.out.println("Guru image is not displayed");

			
			boolean whyo2_4 = whyo2guru_txt.isDisplayed();

			if (whyo2_4 = true) {
				System.out.println("Guru copytext is displayed");
			} else
				System.out.println("Guru copytext is not displayed");
			
			boolean whyo2_5 = whyo2myo2.isDisplayed();

			if (whyo2_5 = true) {
				System.out.println("My O2 image is displayed");
			} else
				System.out.println("My O2 image is not displayed");

			
			boolean whyo2_6 = whyo2myo2_txt.isDisplayed();

			if (whyo2_6 = true) {
				System.out.println("My O2 copytext is displayed");
			} else
				System.out.println("My O2 copytext is not displayed");

		}*/

		
	}
	
	//Below is for displaying which mins text and data are present
	
	public void VerifyMinsDataDisplayed() throws IOException, InterruptedException
	{
		try{
			List<WebElement> outercontainer = driver.findElements(By.xpath("//*[@class='tariffs-container voice-tariffs']"));

			 List<WebElement> DataContainer = outercontainer.get(0).findElements(By.xpath("//*[@class='col-xs-6 col-sm-3 dmt-container info-container']"));
			        
			      
			        for (int i=0; i<=DataContainer.size();i++)
			        {
			        			            
			        	System.out.println("The Mins text and data are as shown below...");
			        	System.out.println(DataContainer.get(i).getText());			        
			        	}
		}
		catch (IndexOutOfBoundsException e) {
			
		}
			
		  			
		}

			
		public void VerifyCostDisplayed() throws IOException, InterruptedException, IndexOutOfBoundsException
		{
			try{
			List<WebElement> outercontainer = driver.findElements(By.xpath("//*[@class='tariffs-container voice-tariffs']"));

			List<WebElement> DataContainer = outercontainer.get(0).findElements(By.xpath("//*[@class='col-xs-6 col-sm-3 info-container price-block-container']"));
				        
				      
				        for (int i=0; i<=DataContainer.size();i++)
				        {
				        			            
				        	System.out.println("The Price per month are as shown below...");
				        	System.out.println(DataContainer.get(i).getText());			        
				        }
			}
			catch (IndexOutOfBoundsException e) {
				
			}
			
						}
/*========================================================
		Added for Validating the Buynow CTA - 13/03/2017
========================================================*/
		
		public void BuyNowButtonDisplay() throws IOException, InterruptedException 
		{
		/*String Actualtext = driver.findElement(By.linkText("http://localhost:8080/imdb/homepage")).getText();
		Assert.assertEquals(Actualtext, "http://localhost:8080/imdb/homepage" );
		System.out.println("URL matching --> Part executed");*/
	
//Here we are just validating the number of links with "Buy Now" available and if they are displayed or not			
			
			
			List<WebElement> all_links_webpage = driver.findElements(By.xpath("//*[@id='callToAction']")); 
			System.out.println("Total no of links Available: " + all_links_webpage.size());
			int k = all_links_webpage.size();
			System.out.println("List of links Available: ");
			for(int i=0;i<k;i++)
			{
			if(all_links_webpage.get(i).getAttribute("button").contains("Buy now"))
			{
			String link = all_links_webpage.get(i).getAttribute("button");
			System.out.println(link);
			}   
			}
			
		}
		
		public void BuyNowButtonValidation() throws IOException, InterruptedException 
		{
		/*String Actualtext = driver.findElement(By.linkText("http://localhost:8080/imdb/homepage")).getText();
		Assert.assertEquals(Actualtext, "http://localhost:8080/imdb/homepage" );
		System.out.println("URL matching --> Part executed");*/
	
			//Here we are just validating the number of links with "Buy Now" available and if they are displayed or not			
			

			
			//List<WebElement> links = driver.findElements(By.xpath("//button[contains(text(),'Buy now')]"));
			
			List<WebElement> links = driver.findElements(By.cssSelector("input[onclick*='simo.buyNowSubmitHandler']"));
	        System.out.println("no of links:" +links.size());
	        

	        for(int i=0;i<links.size();i++)
	        {
	            if(!(links.get(i).getText().isEmpty()))
	            {
	            
	            links.get(i).click();
	            driver.navigate().back();
	            links=driver.findElements(By.cssSelector("input[onclick*='simo.buyNowSubmitHandler']"));
	            }       
	        }
	        
		}
		
		public void CheckboxValidation() throws IOException, InterruptedException 
		{
			System.out.println("Clicking on one of the checkbox");
			CheckboxPresence.click();
			  System.out.println("Clicking on one of the checkbox");
			  CheckboxPresence.click();
			  
			  
	        
		}
		
		////added 14/03/2017 - for cfd1222 - ecomm10206/206/202/203
		public void VerifyPreferredTariffDisplay(String elementName1) throws InterruptedException 
		{

			

			if (simmbbtab.getText().contains("Mobile broadband"))
				System.out.println("Mobile broadband tab is displayed");
			else
				System.out.println("Mobile broadband is not displayed");

			if (whychoosesimolink.getText().contains("Why choose an O2 Pay Monthly sim?")) 
			{
				System.out.println("Why choose an O2 Pay Monthly sim? - link is displayed");
				

				boolean variable1 = whychoosesimowrap.isDisplayed();

				System.out.println("The Why choose simo wrap is displayed");
				
				whychoosesimolink.click();
			}

			else
				System.out.println("Why choose an O2 Pay Monthly sim?-link is not displayed");

			
}
		public void DisplayPromotionTariff(String elementName) throws InterruptedException 
		{
		
		System.out.println("Displaying the Promotion tarriff as per page");
		
		String var1="Recommended";
		String var2="Most-Popular";
		String PromotionDisplayed=driver.findElement(By.cssSelector(".col-xs-12.promotion-ribbon")).getText();

		//Below is for the Display of recommended or not
		if (PromotionDisplayed.equals(var1))
		{
		System.out.println("The Promotion of the tariff displayed is Recommended");
		}
		else if (PromotionDisplayed.equals(var2))
		{
		System.out.println("The Promotion of the tariff displayed is Most-Popular");
		}
		else
		{
		System.out.println("The Promotion of the tariff displayed is unknown");
		}
		
		}
		
		
		public void LengthPromotionTariff(int arg1) throws InterruptedException 
		{
		
		System.out.println("Trying to find the Lenght the Promotion tarriff as per page");
		
		String PromotionDisplayed=driver.findElement(By.cssSelector(".col-xs-12.promotion-ribbon")).getText();
		int LengthofPromotion=PromotionDisplayed.length();
		System.out.println("The current length of the displayed Recommended/Mostpopular section is "+LengthofPromotion);
		//Below is for the Display of recommended or not
					
		
		//Below is to determine the number of characters in the section
		}
		

		public void TabSelect(int arg1) throws InterruptedException, IOException
		{
		
		System.out.println("Differnt Tabs present in page");
		//String TabName=driver.findElement(By.cssSelector(".col-xs-12.promotion-ribbon")).getText();

	/*	try{
			List<WebElement> outercontainer = driver.findElements(By.xpath("//*[@class='tab-container']"));

			@SuppressWarnings("unchecked")
			List<WebElement> DataContainer = (List<WebElement>) outercontainer.get(0).findElement(By.cssSelector(".active"));
				        
				      
				        for (int i=0; i<=DataContainer.size();i++)
				        {
				        			            
				        	System.out.println("The Details are as below...");
				        	System.out.println(DataContainer.get(i).getText());			        
				        }
			}
			catch (IndexOutOfBoundsException e) {
				
			}*/
			
			        
		//Below is for the Display of recommended or not
					
		
		//Below is to determine the number of characters in the section
		}
		
		
		
		
}

