package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import actionsPerformed.GlobalAction;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageobjects.Like_Free_POM;
import pageobjects.Sim_Free_Phone_POM;
import pageobjects.Sim_Free_Tariff_Extras_page_POM;

public class ECOM_10241_Step_Definition {
	
	 public WebDriver driver;
	   


	    public ECOM_10241_Step_Definition() {
	        driver = Hooks.driver;
	       
	    }
	
	
	@Given("^I am an eComm user(\\d+) in Acquisition$")
	public void i_am_an_eComm_user_in_Acquisition(int arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		GlobalAction b1=new GlobalAction();
         String Currenturl= b1.ExecutionURL("likenewurl");
	      driver.get(Currenturl);
		Thread.sleep(5000);
		
		
	}

	@And("^Both (\\d+) months and (\\d+) days tariffs are available in mobile$")
	public void both_months_and_days_tariffs_are_available_in_mobile(int arg1, int arg2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   
	}


	@And("^Land on the 'Tariffs and extra' pages in flow(\\d+)$")
	public void land_on_the_Tariffs_and_extra_pages_in_flow(int arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Sim_Free_Tariff_Extras_page_POM p1=PageFactory.initElements(driver, Sim_Free_Tariff_Extras_page_POM.class);
		p1.validateElements();
		p1.tariff_select("tariff_12");
	}
	
	@Then("^I SHOULD be able to see both (\\d+) month and (\\d+) days tab just above the tariffs tile on the right hand side, to select the associated Pay monthly tariffs with a text 'Contract length' at the right hand side$")
	public void i_SHOULD_be_able_to_see_both_month_and_days_tab_just_above_the_tariffs_tile_on_the_right_hand_side_to_select_the_associated_Pay_monthly_tariffs_with_a_text_Contract_length_at_the_right_hand_side(int arg1, int arg2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   
	}

	@And("^Remove copy 'Contract length is (\\d+) months\\.\\.$")
	public void remove_copy_Contract_length_is_months(int arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Sim_Free_Tariff_Extras_page_POM p1=PageFactory.initElements(driver, Sim_Free_Tariff_Extras_page_POM.class);
		p1.elementvisibility();
	}

	@And("^I select the (\\d+) month tariff$")
	public void i_select_the_month_tariff(int arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   
	}

	@And("^Land on the 'Tariffs and extra' pagess in flow(\\d+)$")
	public void land_on_the_Tariffs_and_extra_pagess_in_flow(int arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Sim_Free_Tariff_Extras_page_POM p1=PageFactory.initElements(driver, Sim_Free_Tariff_Extras_page_POM.class);
		p1.validateElements();
	}

	@And("^I see both (\\d+) month and (\\d+) days tab to select the associated Pay monthly tariffs$")
	public void i_see_both_month_and_days_tab_to_select_the_associated_Pay_monthly_tariffs(int arg1, int arg2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   
	}

	@And("^By default I see (\\d+) months tariffs$")
	public void by_default_I_see_months_tariffs(int arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@And("^If I click on (\\d+) days tab$")
	public void if_I_click_on_days_tab(int arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Sim_Free_Tariff_Extras_page_POM p1=PageFactory.initElements(driver, Sim_Free_Tariff_Extras_page_POM.class);
		p1.Tab_Select("30days");
	}

	@Then("^I SHOULD be presented with all (\\d+) days Pay monthly tariffs$")
	public void i_SHOULD_be_presented_with_all_days_Pay_monthly_tariffs(int arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Sim_Free_Tariff_Extras_page_POM p1=PageFactory.initElements(driver, Sim_Free_Tariff_Extras_page_POM.class);
		p1.tariff_select("tariff_30");
	}

	@And("^I click on 'select' button of Device only - sim free$")
	public void i_click_on_select_button_of_Device_only_sim_free() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}
	
	@When("^Land on the 'Tariffs and extra' pagesss in flow(\\d+)$")
	public void land_on_the_Tariffs_and_extra_pagesss_in_flow(int arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Sim_Free_Tariff_Extras_page_POM p1=PageFactory.initElements(driver, Sim_Free_Tariff_Extras_page_POM.class);
		p1.validateElements();
	}


	@And("^I see all (\\d+) days Pay monthly tariffs$")
	public void i_see_all_days_Pay_monthly_tariffs(int arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@And("^If I click on (\\d+) months tab$")
	public void if_I_click_on_months_tab(int arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Sim_Free_Tariff_Extras_page_POM p1=PageFactory.initElements(driver, Sim_Free_Tariff_Extras_page_POM.class);
		p1.Tab_Select("12months");
	}

	@Then("^I SHOULD be presented with all (\\d+) months Pay monthly tariffsss$")
	public void i_SHOULD_be_presented_with_all_months_Pay_monthly_tariffsss(int arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Sim_Free_Tariff_Extras_page_POM p1=PageFactory.initElements(driver, Sim_Free_Tariff_Extras_page_POM.class);
		p1.tariff_select("tariff_12");
	}


	
	@And("^Land on the 'Tariffs and extra' page in flow(\\d+)$")
	public void land_on_the_Tariffs_and_extra_page_in_flow(int arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Sim_Free_Tariff_Extras_page_POM p1=PageFactory.initElements(driver, Sim_Free_Tariff_Extras_page_POM.class);
		p1.validateElements();
	}

	@And("^If I click on (\\d+) days tab\"([^\"]*)\"$")
	public void if_I_click_on_days_tab(int arg1, String arg2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Sim_Free_Tariff_Extras_page_POM p1=PageFactory.initElements(driver, Sim_Free_Tariff_Extras_page_POM.class);
		p1.Tab_Select(arg2);
	}

	@And("^If I click on (\\d+) months tab\"([^\"]*)\"$")
	public void if_I_click_on_months_tab(int arg1, String arg2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Sim_Free_Tariff_Extras_page_POM p1=PageFactory.initElements(driver, Sim_Free_Tariff_Extras_page_POM.class);
		p1.Tab_Select(arg2);
	}

	@Then("^I SHOULD be presented with all (\\d+) months Pays monthly tariffs$")
	public void i_SHOULD_be_presented_with_all_months_Pays_monthly_tariffs(int arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}
	

	

	

	
	
}
