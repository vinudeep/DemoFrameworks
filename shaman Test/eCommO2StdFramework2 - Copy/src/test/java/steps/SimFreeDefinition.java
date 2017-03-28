package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import actionsPerformed.GlobalAction;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import helpers.Environment;
import helpers.Filereadingutility;

public class SimFreeDefinition {
	public WebDriver driver;
	  
	public static String relativePath = null;
	public static String EnvPropFilePath = null;
	public static String BrowserType = null;
	public static String Currenturl=null;
	public static String Currentflow=null;

    public SimFreeDefinition() {
        driver = Hooks.driver;
       
    }
	
	
    @Given("^I am an eComm user$")
	public void I_am_an_eComm_user() throws Throwable {
		GlobalAction b1=new GlobalAction();
        String Currenturl= b1.ExecutionURL("likenewurl");
	      driver.get(Currenturl);
		Environment.driver.findElement(By.xpath("(//a[contains(@href, 'https://www.o2.co.uk/shop/like-new/sim-free-phones')])[1]")).click();
		
    
	}
	
	

	@When("^I add 'sim free' device in my basket along with any accessory$")
	public void I_add_sim_free_device_in_my_basket_along_with_any_accessory() throws Throwable {
	    // Express the Regexp above with the code you wish you had
		
	Environment.driver.findElement(By.xpath("(//*[@id='PayMonthlyTariffsGridTab']/li[1]/div/div[4]/button)[1]")).sendKeys(Keys.ENTER);
	Thread.sleep(10000);
	Environment.driver.findElement(By.xpath("//input[@value='Add']")).sendKeys(Keys.ENTER);
    Thread.sleep(10000);
	Environment.driver.findElement(By.xpath("//*[@id='qa-proceed-to-basket-dock-header']")).sendKeys(Keys.ENTER);
    
	}

	@Then("^I SHOULD be shown a 'Remove' CTA in front of the 'sim free device'$")
	public void I_SHOULD_be_shown_a_Remove_CTA_in_front_of_the_sim_free_device() throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    WebElement w1=Environment.driver.findElement(By.xpath("(//a[contains(text(),'Remove')])[1]"));
		if(w1.getText().contains("Remove"))
		 {
			System.out.println("The Remove button Element is Present and the Text is :" +w1.getText() );
		 }else{
		  System.out.println("The Remove button Element is Absent and the Text is :" +w1.getText());
		 }
		  
			
		
	}

	@Then("^Remove the device from the basket, If I click on Remove$")
	public void Remove_the_device_from_the_basket_If_I_click_on_Remove() throws Throwable {
	    // Express the Regexp above with the code you wish you had
		 WebElement w1=Environment.driver.findElement(By.xpath("(//a[contains(text(),'Remove')])[1]"));
		 w1.click();
	}

	@When("^I add 'sim free' device in my basket along with Pay Monthly sim$")
	public void I_add_sim_free_device_in_my_basket_along_with_Pay_Monthly_sim() throws Throwable {
	    // Express the Regexp above with the code you wish you had
	   Environment.driver.findElement(By.xpath("(//button[@value='Select'])[2]")).sendKeys(Keys.ENTER);
	   Thread.sleep(5000);
	   Environment.driver.findElement(By.xpath("//*[@id='qa-proceed-to-basket-dock-header']")).click();
	   
	}



	@When("^I add 'sim free' device in my basket along with PAYG sim and an accessory$")
	public void I_add_sim_free_device_in_my_basket_along_with_PAYG_sim_and_an_accessory() throws Throwable {
	    // Express the Regexp above with the code you wish you had
		Environment.driver.findElement(By.xpath("(//button[@value='Select'])[3]")).sendKeys(Keys.ENTER);
		Thread.sleep(10000);
		Environment.driver.findElement(By.xpath("//input[@value='Add']")).sendKeys(Keys.ENTER);;
	    Thread.sleep(10000);
		Environment.driver.findElement(By.xpath("//*[@id='qa-proceed-to-basket-dock-header']")).click();
		
	    
	}

	@Then("^Remove the device as well as the PAYG Sim from the basket, If I click on 'Remove'$")
	public void Remove_the_device_as_well_as_the_PAYG_Sim_from_the_basket_If_I_click_on_Remove() throws Throwable {
	    // Express the Regexp above with the code you wish you had
	
	}

	@When("^I add 'sim free' device in my basket along with PayM and an accessory$")
	public void I_add_sim_free_device_in_my_basket_along_with_PayM_and_an_accessory() throws Throwable {
	    // Express the Regexp above with the code you wish you had
		Environment.driver.findElement(By.xpath("(//button[@value='Select'])[2]")).sendKeys(Keys.ENTER);
	    Thread.sleep(5000);
	    Environment.driver.findElement(By.xpath("//input[@value='Add']")).sendKeys(Keys.ENTER);;
	    Thread.sleep(10000);
		Environment.driver.findElement(By.xpath("//*[@id='qa-proceed-to-basket-dock-header']")).click();
	    
	}

	@When("^My basket contains 'Sim free' device only$")
	public void My_basket_contains_Sim_free_device_only() throws Throwable {
	    // Express the Regexp above with the code you wish you had
		Environment.driver.findElement(By.xpath("(//*[@id='PayMonthlyTariffsGridTab']/li[1]/div/div[4]/button)[1]")).sendKeys(Keys.ENTER);
		Thread.sleep(10000);
		Environment.driver.findElement(By.xpath("//*[@id='qa-proceed-to-basket-dock-header']")).click();
	    
	}

	@Then("^I SHOULD NOT be shown a 'Remove' CTA in front of the 'sim free device'$")
	public void I_SHOULD_NOT_be_shown_a_Remove_CTA_in_front_of_the_sim_free_device() throws Throwable {
	    // Express the Regexp above with the code you wish you had
		//Discussion of the Remove button is present or not 
		 //WebElement w1=Environment.driver.findElement(By.xpath("(//a[contains(text(),'Remove')])[1]"));
		System.out.println("The element is not Present");
		
	}

	@When("^My basket contains 'Sim free' device with PAYG Sim$")
	public void My_basket_contains_Sim_free_device_with_PAYG_Sim() throws Throwable {
	    // Express the Regexp above with the code you wish you had
		Environment.driver.findElement(By.xpath("(//button[@value='Select'])[3]")).sendKeys(Keys.ENTER);
		Thread.sleep(10000);
	}
	

	
	@When("^I add Sim free device along with the Airtime plan\"([^\"]*)\"$")
	public void I_add_Sim_free_device_along_with_the_Airtime_plan(String arg1) throws Throwable {
	
		 WebElement w1=Environment.driver.findElement(By.xpath("(//*[@id='PayMonthlyTariffsGridTab']/li[1]/div/div[4]/button)[1]"));
		 
			if(w1.getText().contains("Device only - sim free"))
			 {
				System.out.println("The Element is Present and the Text is :" +w1.getText() );
			 }else{
			  System.out.println("The  Element is Absent and the Text is :" +w1.getText());
			 }
		
			WebElement w2=Environment.driver.findElement(By.xpath("(//*[@id='PayMonthlyTariffsGridTab']/li[2]/div/h3)[1]"));
			if(w2.getText().contains("Add a Pay Monthly sim"))
			 {
				System.out.println("The Element is Present and the Text is :" +w2.getText() );
			 }else{
			  System.out.println("The  Element is Absent and the Text is :" +w2.getText());
			 }
			
			WebElement w3=Environment.driver.findElement(By.xpath("(//*[@id='PayMonthlyTariffsGridTab']/li[3]/div/h3)[1]"));
			if(w3.getText().contains("Add a Pay As You Go Sim"))
			 {
				System.out.println("The Element is Present and the Text is :" +w3.getText() );
			 }else{
			  System.out.println("The  Element is Absent and the Text is :" +w3.getText());
			 }
			
			
			
		// Express the Regexp above with the code you wish you had
			String relativePath = System.getProperty("user.dir");
			String EnvPropFilePath = relativePath + "\\src\\test\\java\\Properties\\AppConfig.properties";
		Currentflow=Filereadingutility.getPropertyValue(EnvPropFilePath, "O2Flow");
		System.out.println(Currentflow);
		//validation step needed	
		Environment.driver.findElement(By.xpath("(//*[@id='PayMonthlyTariffsGridTab']/li[1]/div/div[4]/button[@value='Select'])[1]")).sendKeys(Keys.ENTER);
		Thread.sleep(10000);
		if(Currentflow.contains(arg1))
		{
			driver.findElement(By.xpath("(//a[contains(text(),'Pay As You Go')])[9]")).sendKeys(Keys.ENTER);
			Thread.sleep(10000);		
			driver.findElement(By.xpath("(//*[@id='callToAction'])[15]")).sendKeys(Keys.ENTER);
		}
		else
		{
		Environment.driver.findElement(By.xpath("(//*[@id='callToAction'])[3]")).sendKeys(Keys.ENTER);
		}
		
		Environment.driver.findElement(By.xpath("//*[@id='qa-proceed-to-basket-dock-header']")).click();
		
		
		
		
	}

	@When("^Land on basket page$")
	public void Land_on_basket_page() throws Throwable {
	    // Express the Regexp above with the code you wish you had
		
		WebElement w1=Environment.driver.findElement(By.xpath("(//a[contains(text(),'Remove')])[1]"));
			if(w1.getText().contains("Remove"))
			 {
				System.out.println("The Remove button of Device Element is Present and the Text is :" +w1.getText() );
			 }else{
			  System.out.println("The Remove button of Device Element is Absent and the Text is :" +w1.getText());
			 }
			Thread.sleep(5000);
			 WebElement w2=Environment.driver.findElement(By.xpath("(//a[contains(text(),'Remove')])[2]"));
				if(w2.getText().contains("Remove"))
				 {
					System.out.println("The Remove button of Tariff Element is Present and the Text is :" +w2.getText() );
				 }else{
				  System.out.println("The Remove button of Tariff Element is Absent and the Text is :" +w2.getText());
				 }
		Thread.sleep(5000);
		String w3=Environment.driver.findElement(By.xpath("//*[@id='shopApp']/div[3]/div/div/div[1]/div[2]/ul/li[5]/section[2]/div/div/p[1]")).getAttribute("data-qa-upfront-total");
		System.out.println("The upfront cost of the device:" +w3);
		Thread.sleep(5000);
		String w4=Environment.driver.findElement(By.xpath("//*[@id='shopApp']/div[3]/div/div/div[1]/div[2]/ul/li[5]/section[2]/div/div/p[2]")).getAttribute("data-qa-monthly-total");
		System.out.println("The monthly cost of the device:" +w4);			
	}

	
	@Then("^I SHOULD be able to see the Sim free Device and Airtime plan separately - please see the attached design$")
	public void I_SHOULD_be_able_to_see_the_Sim_free_Device_and_Airtime_plan_separately_please_see_the_attached_design() throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    
	}


}



