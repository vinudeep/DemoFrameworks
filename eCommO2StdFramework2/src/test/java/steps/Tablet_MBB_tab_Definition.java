package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import GlobalActions.MouseHoverAction;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import actionsPerformed.*;
import pageobjects.*;
import helpers.*;


public class Tablet_MBB_tab_Definition {
	
		 public WebDriver driver;
		   
	    public Tablet_MBB_tab_Definition() 
		    {
		        driver = Hooks.driver;
		       
		    }
    @SuppressWarnings("unused")
	private static final WebElement WebElement = null;
	
	//Shop_home_page_Model p1=PageFactory.initElements(Environment.driver, Shop_home_page_Model.class);
	
	@Given("^I am an eComm test user(\\d+) in o(\\d+)$")
	public void i_am_an_eComm_test_user_in_o(int arg1, int arg2) throws Throwable {
		PageFactory.initElements(driver, MouseHoverPage.class);
		MouseHoverAction.PayMSimoNavigation();
		
	}


	@When("^I choose Sims and Pay Monthly sims$")
	public void I_choose_Sims_and_Pay_Monthly_Sims() throws Throwable {
	    // Express the Regexp above with the code you wish you had
		PageFactory.initElements(driver, PAYMSimOPage.class);
		PAYMSimOPageActions.ElementClick1("shoptablet");
		
	}
	
	@And("^select Tablet$")
	public void Select_Tablet() throws Throwable{
		PageFactory.initElements(driver, PAYMSimOPage.class);
		PAYMSimOPageActions.ElementClick1("shoptablet");
			}
	    
	@When("^I am able to see the contract length as (\\d+) months and (\\d+) days$")
	public void i_am_able_to_see_the_contract_length_as_months_and_days(int arg1, int arg2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		PageFactory.initElements(driver, PAYMSimOPage.class);
		PAYMSimOPageActions.Elementverify("twelevemonths");
		PAYMSimOPageActions.Elementverify("thirtydays");
		
	}
	@When("^I click on (\\d+) months contact length to see all tariffs that are relevant$")
	public void i_click_on_months_contact_length_to_see_all_tariffs_that_are_relevant(int arg1) throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
		PageFactory.initElements(driver, PAYMSimOPage.class);
		PAYMSimOPageActions.Elementverify("month12firsttariff");
		
	}
	
	@When("^I click on (\\d+) dayscontact length to see all tariffs that are relevant$")
	public void i_click_on_dayscontact_length_to_see_all_tariffs_that_are_relevant(int arg1) throws Throwable {
		        // Write code here that turns the phrase above into concrete actions
		PageFactory.initElements(driver, PAYMSimOPage.class);
		PAYMSimOPageActions.ElementClick1("thirtydays");
		PAYMSimOPageActions.Elementverify("day30firsttariff");
		Thread.sleep(5000);	
	
	}
	
	
	
}
	





