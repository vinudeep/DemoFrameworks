package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import actionsPerformed.GlobalAction;
import actionsPerformed.MouseHoverAction;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import pageobjects.PayMsimspage;

public class ECOM_10099_Step_Definition {
	

		public WebDriver driver;
		  
	    public ECOM_10099_Step_Definition() {
	        driver = Hooks.driver;
	       
	        
	    }
	    @Given("^that I am a CFA Pay Monthly SIMO Customer$")
	    public void that_I_am_a_CFA_Pay_Monthly_SIMO_Customer() throws Throwable {
	        // Write code here that turns the phrase above into concrete actions
	    	GlobalAction b1=new GlobalAction();
	    	//change
	        // String Currenturl= b1.ExecutionURL("o2_home");
	    	String Currenturl= b1.ExecutionURL("SimPayM");
		      driver.get(Currenturl);
		     // MouseHoverAction p1=PageFactory.initElements(driver, MouseHoverAction.class);
				//p1.PayMSimoNavigation();
	    }

	    @Then("^I should be able to see the \"([^\"]*)\" tariff on the PAYM sims page$")
	    public void i_should_be_able_to_see_the_tariff_on_the_PAYM_sims_page(String arg1) throws Throwable {
	        // Write code here that turns the phrase above into concrete actions
	    	PayMsimspage p1=PageFactory.initElements(driver, PayMsimspage.class);
			p1.DisplayPromotionTariff("Promotion");
	    }

	    @And("^there should be a blue badge with Character limit (\\d+) incuding space character$")
	    public void there_should_be_a_blue_badge_with_Character_limit_incuding_space_character(int arg1) throws Throwable {
	        // Write code here that turns the phrase above into concrete actions
	    	PayMsimspage p1=PageFactory.initElements(driver, PayMsimspage.class);
			p1.LengthPromotionTariff(arg1);
			p1.TabSelect(arg1);
	    }

	    @And("^the \"([^\"]*)\" tariff should be displayed to me on TOP of the tariff tiles in WHITE background$")
	    public void the_tariff_should_be_displayed_to_me_on_TOP_of_the_tariff_tiles_in_WHITE_background(String arg1) throws Throwable {
	        // Write code here that turns the phrase above into concrete actions
	        
	    }

	    @And("^display the \"([^\"]*)\" for (\\d+) and (\\d+) days as per the excel sheet$")
	    public void display_the_for_and_days_as_per_the_excel_sheet(String arg1, int arg2, int arg3) throws Throwable {
	        // Write code here that turns the phrase above into concrete actions
	        
	    }
	    
}
