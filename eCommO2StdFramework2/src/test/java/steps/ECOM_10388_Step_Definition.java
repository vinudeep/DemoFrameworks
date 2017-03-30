package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import GlobalActions.MouseHoverAction;
import helpers.*;

import pageobjects.*;
import actionsPerformed.*;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ECOM_10388_Step_Definition {
	
	 public WebDriver driver;
	   


	    public ECOM_10388_Step_Definition() {
	        driver = Hooks.driver;
	       
	    }

	@Given("^I am an eComm user in o(\\d+)$")
	public void I_am_an_eComm_user_in_o(int arg1) throws Throwable {
	    // Express the Regexp above with the code you wish you had
		PageFactory.initElements(driver, ShopLandingPageAction.class);
    	ShopLandingPageAction.GetTitle();
	}
	
	@When("^I choose 'like new' sim free device\"([^\"]*)\"$")
	public void i_choose_like_new_sim_free_device(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		PageFactory.initElements(driver, MouseHoverPage.class);
		PageFactory.initElements(driver, LikeFreePage.class);
		PageFactory.initElements(driver, SimFreeDevicePage.class);
		MouseHoverAction.likeNewHomepageNavigation();;
		LikefreeHomepageAction.ElementClick("simfree");
		SimFreeDevicePageActions.validatetile();
		SimFreeDevicePageActions.ElementClick(arg1);
	}
	
	@And("^select \"([^\"]*)\" tariff\"([^\"]*)\" and \"([^\"]*)\"$")
	public void select_tariff_and(String arg1, String arg2, String arg3) throws Throwable {
	    // Express the Regexp above with the code you wish you had
		PageFactory.initElements(driver, TariffAndExtrasPage.class);
		TariffAndExtrasPageActions.Tab_Select(arg2);
		TariffAndExtrasPageActions.tariff_select(arg3);
	}

	
	@Then("^Package section Airtime Plan SHOULD also be updated accordingly to show the correct tariff associated data like contract length\"([^\"]*)\"$")
	public void Package_section_Airtime_Plan_SHOULD_also_be_updated_accordingly_to_show_the_correct_tariff_associated_data_like_contract_length(String arg1) throws Throwable {
	    // Express the Regexp above with the code you wish you had
		PageFactory.initElements(driver, TariffAndExtrasPage.class);
		TariffAndExtrasPageActions.tariffvalidation(arg1);
	}
	
	
	
	
}
