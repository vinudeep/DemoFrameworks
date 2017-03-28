package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import actionsPerformed.GlobalAction;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageobjects.PayMsimspage;

public class ECOM_10199_Step_Definition {

	
	public WebDriver driver;
	  


    public ECOM_10199_Step_Definition() {
        driver = Hooks.driver;
       
    }
    
    @Given("^I am an eComm user(\\d+) in o(\\d+)$")
    public void i_am_an_eComm_user_in_o(int arg1, int arg2) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    	 GlobalAction b1=new GlobalAction();
         String Currenturl= b1.ExecutionURL("o2o2o2");
	      driver.get(Currenturl);  
    }

    @When("^I am deciding the order of the pay-monthly sim tariffsss$")
    public void i_am_deciding_the_order_of_the_pay_monthly_sim_tariffsss() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        
    }

    @Then("^on landing of the Pay monthly sims page Pay monthly sims banner header as per today should be displayed$")
    public void on_landing_of_the_Pay_monthly_sims_page_Pay_monthly_sims_banner_header_as_per_today_should_be_displayed() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    	PayMsimspage p2=PageFactory.initElements(driver, PayMsimspage.class);
		p2.ElementClick2("paymheader");
	    
    }

    @And("^tabbed structure for phone/tablet and mbb should be displayed$")
    public void tabbed_structure_for_phone_tablet_and_mbb_should_be_displayed() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    	PayMsimspage p3=PageFactory.initElements(driver, PayMsimspage.class);
		p3.ElementClick2("simphonetab");
		p3.ElementClick2("simtablettab");
		p3.ElementClick2("simmbbtab");
    }

    @And("^Why choose an O(\\d+) Pay Monthly sim\\? link should be displayed$")
    public void why_choose_an_O_Pay_Monthly_sim_link_should_be_displayed(int arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        
    }

    @And("^Horizontal tariff tiles \\(without any inner modules\\) should be displayed$")
    public void horizontal_tariff_tiles_without_any_inner_modules_should_be_displayed() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        
    }
    
}
