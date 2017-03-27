package steps;


import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageobjects.*;
import GlobalActions.*;
import actionsPerformed.*;

public class ECom10201_Steps 
{

public WebDriver driver;

public ECom10201_Steps() 
{
    driver = Hooks.driver;
}

	@Given("^that I am a acquisition customer$")
	public void that_I_am_a_acquisition_customer() throws Throwable 
	{
	
	}
	

	@Given("^that I am a Upgrade customer$")
	public void that_I_am_a_Upgrade_customer() throws Throwable 
	{
	
	}


	@When("^I land on the Pay monthly sims page$")
	public void i_land_on_the_Pay_monthly_sims_page() throws Throwable {
		PageFactory.initElements(driver, MouseHoverPage.class);
		MouseHoverAction.PayMSimoNavigation();
		PageFactory.initElements(driver, Autoredirection.class);
		Autoredirection.redirect();

	}

	@When("^I want to select a phone pay monhtly sim tariff$")
	public void i_want_to_select_a_phone_pay_monhtly_sim_tariff() throws Throwable {
			
	}

	@Then("^I should see the below contents inside the horizontal tariff tile$")
	public void i_should_see_the_below_contents_inside_the_horizontal_tariff_tile(List<String> Links) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
	    // E,K,V must be a scalar (String, Integer, Date, enum etc)
		PageFactory.initElements(driver, PAYMSimOPage.class);
		for (int i=0; i < Links.size(); i++)
		{
			System.out.println(Links.get(i));
		}
		PAYMSimOPageActions.VerifyMinsDataDisplayed();
		PAYMSimOPageActions.VerifyCostDisplayed();
		
		
	}

	@Then("^'Buy now' CTA links straight to the basket page\\.$")
	public void buy_now_CTA_links_straight_to_the_basket_page() throws Throwable {
		PageFactory.initElements(driver, PAYMSimOPage.class);
		
		PAYMSimOPageActions.BuyNowButtonValidation();
	}

	@Then("^'Check box' A check box to be displayed with the below details \"([^\"]*)\"$")
	public void check_box_A_check_box_to_be_displayed_with_the_below_details(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		PageFactory.initElements(driver, PAYMSimOPage.class);
		PAYMSimOPageActions.CheckboxValidation();
	}

	@Then("^If customer does not select this check box, then the selection is considered as Smartphone$")
	public void if_customer_does_not_select_this_check_box_then_the_selection_is_considered_as_Smartphone() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}


}
