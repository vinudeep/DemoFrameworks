package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageobjects.*;
import GlobalActions.*;
import actionsPerformed.*;

public class ECOM_10199_Step_Definition {
	public WebDriver driver;
	  
    public ECOM_10199_Step_Definition() 
    {
        driver = Hooks.driver;
    }
	
	
	@Given("^I am an eComm user(\\d+) in o(\\d+)$")
	public void i_am_an_eComm_user_in_o(int arg1, int arg2) throws Throwable {
		PageFactory.initElements(driver, MouseHoverPage.class);
		MouseHoverAction.PayMSimoNavigation();
	}

		
	@Then("^on landing of the Pay monthly sims page Pay monthly sims banner header as per today should be displayed$")
	public void on_landing_of_the_Pay_monthly_sims_page_Pay_monthly_sims_banner_header_as_per_today_should_be_displayed() throws Throwable {
		PageFactory.initElements(driver, PAYMSimOPage.class);
		PAYMSimOPageActions.ElementClick2(null);
		
	}

	/*
	@Then("^on_landing_of_the_Pay_monthly_sims_page_Pay_monthly_sims_banner_header_as_per_today_should_be_displayed$")
	public void on_landing_of_the_Pay_monthly_sims_page_Pay_monthly_sims_banner_header_as_per_today_should_be_displayed() throws Throwable {
		PayMsimspage p2=PageFactory.initElements(Environment.driver, PayMsimspage.class);
		p2.ElementClick2("paymheader");
	    throw new PendingException();
	}

*/
	


	@And("^tabbed structure for phone/tablet and mbb should be displayed$")
	public void tabbed_structure_for_phone_tablet_and_mbb_should_be_displayed() throws Throwable {
		PageFactory.initElements(driver, PAYMSimOPage.class);
		/*PAYMSimOPageActions.ElementClick2("simphonetab");
		PAYMSimOPageActions.ElementClick2("simtablettab");
		PAYMSimOPageActions.ElementClick2("simmbbtab");
		*/
		
	}

	@And("^Why choose an O(\\d+) Pay Monthly sim\\? link should be displayed$")
	public void why_choose_an_O_Pay_Monthly_sim_link_should_be_displayed(int arg1) throws Throwable {
		PageFactory.initElements(driver, PAYMSimOPage.class);
	/*	PAYMSimOPageActions.ElementClick2("whychoosesimolink");
		PAYMSimOPageActions.ElementClick2("whychoosesimowrap");
		PAYMSimOPageActions.ElementClick2("wifi_img");
		PAYMSimOPageActions.ElementClick2("wifi_img_txt");
		PAYMSimOPageActions.ElementClick2("keepyournumb_img");
		PAYMSimOPageActions.ElementClick2("keepyournumb_img_txt");
		PAYMSimOPageActions.ElementClick2("rank_img");
		PAYMSimOPageActions.ElementClick2("rank_img_txt");
		PAYMSimOPageActions.ElementClick2("tugo_img");
		PAYMSimOPageActions.ElementClick2("tugo_img_txt");
		
		*/
	}

	@And("^Horizontal tariff tiles \\(without any inner modules\\) should be displayed$")
	public void horizontal_tariff_tiles_without_any_inner_modules_should_be_displayed() throws Throwable {
		PageFactory.initElements(driver, PAYMSimOPage.class);
	/*
		PAYMSimOPageActions.ElementClick2("tariff1tile");
		PAYMSimOPageActions.ElementClick2("tariff2tile");
		PAYMSimOPageActions.ElementClick2("tariff3tile");
		PAYMSimOPageActions.ElementClick2("tariff4tile");
	*/
	}

	@And("^Why O(\\d+) Footer - as per today should be displayed$")
	public void why_O_Footer_as_per_today_should_be_displayed(int arg1) throws Throwable {
		PageFactory.initElements(driver, PAYMSimOPage.class);
	/*
		PAYMSimOPageActions.ElementClick2("whyo2");
		PAYMSimOPageActions.ElementClick2("whyo2priority");
		PAYMSimOPageActions.ElementClick2("whyo2priority_txt");
		PAYMSimOPageActions.ElementClick2("whyo2guru");
		PAYMSimOPageActions.ElementClick2("whyo2guru_txt");
		PAYMSimOPageActions.ElementClick2("whyo2myo2");
		PAYMSimOPageActions.ElementClick2("whyo2myo2_txt");
		
	*/			
	}

}