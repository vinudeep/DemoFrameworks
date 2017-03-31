package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import GlobalActions.MouseHoverAction;
import actionsPerformed.GlobalAction;
import actionsPerformed.PAYMSimOPageActions;
import pageobjects.*;
import helpers.*;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ECOM_10202_Promotional_Ribbons_Step_Definition {
	 public WebDriver driver;
	   


	    public ECOM_10202_Promotional_Ribbons_Step_Definition() {
	        driver = Hooks.driver;
	       
	    }
	
	@SuppressWarnings("unused")
	private static final WebElement WebElement = null;
	
	//Shop_home_page_Model p1=PageFactory.initElements(Environment.driver, Shop_home_page_Model.class);
	
	@Given("^that I am a merchandising manager of o(\\d+)$")
	public void that_I_am_a_merchandising_manager_of_o(int arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		 GlobalAction b1=new GlobalAction();
         String Currenturl= b1.ExecutionURL("o2_home");
	     driver.get(Currenturl);
	}

	@When("^I want to promote any offer for a particular sim-only on the paymonthly sims page$")
	public void i_want_to_promote_any_offer_for_a_particular_sim_only_on_the_paymonthly_sims_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(5000);
		
		PageFactory.initElements(driver, MouseHoverPage.class);
		 MouseHoverAction.PayMSimoNavigation();
		

	}

	@Then("^I should be able to do so using the green and blue ribbon as per the given designs$")
	public void i_should_be_able_to_do_so_using_the_green_and_blue_ribbon_as_per_the_given_designs() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		PageFactory.initElements(driver, PAYMSimOPage.class);
		PAYMSimOPageActions.Elementverify("promotionprimary");
		PAYMSimOPageActions.ElementColour("promotionprimary","blue");
		PAYMSimOPageActions.Elementverify("promotionsecondary");
		PAYMSimOPageActions.ElementColour("promotionsecondary","green");
	}

	@Then("^I should be able to see only (\\d+) characters on the Ribbon$")
	public void i_should_be_able_to_see_only_characters_on_the_Ribbon(int arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		PageFactory.initElements(driver, PAYMSimOPage.class);
		PAYMSimOPageActions.charlengthcheck("promotionprimary",arg1);
		PAYMSimOPageActions.charlengthcheck("promotionsecondary",arg1);

	}	
	
	
}
	




