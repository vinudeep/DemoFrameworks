package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;


import GlobalActions.*;
import actionsPerformed.GlobalAction;
import actionsPerformed.PAYMSimOPageActions;
import actionsPerformed.UpgradeCustomerPageActions;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageobjects.MouseHoverPage;
import pageobjects.PAYMSimOPage;
import pageobjects.UpgradeCustomerPage;

public class Ecomm10205_206_203_202_Steps {
	
	@SuppressWarnings("unused")
	private static final WebElement WebElement = null;
	
	public WebDriver driver;
	  
    public Ecomm10205_206_203_202_Steps() 
    {
        driver = Hooks.driver;
    }
	
	@Given("^that I am a CFA Pay Monthly SIMO Customer$")
	public void that_I_am_a_CFA_Pay_Monthly_SIMO_Customer() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		 GlobalAction b1=new GlobalAction();
         String Currenturl= b1.ExecutionURL("o2_home");
	      driver.get(Currenturl);
	      Thread.sleep(5000);
		PageFactory.initElements(driver, MouseHoverPage.class);
		MouseHoverAction.PayMSimoNavigation();
		}

	@Then("^I should be able to see the \"([^\"]*)\" tariff on the PAYM sims page$")
	public void i_should_be_able_to_see_the_tariff_on_the_PAYM_sims_page(String Promotion) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		PageFactory.initElements(driver, PAYMSimOPage.class);
		PAYMSimOPageActions.DisplayPromotionTariff(Promotion);
	}

	@Then("^there should be a blue badge with Character limit (\\d+) incuding space character$")
	public void there_should_be_a_blue_badge_with_Character_limit_incuding_space_character(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		PageFactory.initElements(driver, PAYMSimOPage.class);
		PAYMSimOPageActions.LengthPromotionTariff(arg1);
		
	}

	@Then("^the \"([^\"]*)\" tariff should be displayed to me on TOP of the tariff tiles in WHITE background$")
	public void the_tariff_should_be_displayed_to_me_on_TOP_of_the_tariff_tiles_in_WHITE_background(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		PageFactory.initElements(driver, PAYMSimOPage.class);
		PAYMSimOPageActions.TariffTilePosition();
	}

	@Then("^display the \"([^\"]*)\" for (\\d+) and (\\d+) days as per the excel sheet$")
	public void display_the_for_and_days_as_per_the_excel_sheet(String arg1, int arg2, int arg3) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
//This needs to be manually done hence we are not adding any methods over here..
	}
	
	@Then("^in the horizontal tariff tile I should be able to see the \"([^\"]*)\" price & \"([^\"]*)\" price$")
	public void in_the_horizontal_tariff_tile_I_should_be_able_to_see_the_price_price(String arg1, String arg2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		PageFactory.initElements(driver, PAYMSimOPage.class);
		PAYMSimOPageActions.VerifyCostDisplayed();
	}

	@Given("^that I am a CFU Pay Monthly SIMO Customer$")
	public void that_I_am_a_CFU_Pay_Monthly_SIMO_Customer() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		GlobalAction b1=new GlobalAction();
        String Currenturl= b1.ExecutionURL("o2_home");
	      driver.get(Currenturl);
		
	     
	     PageFactory.initElements(driver, MouseHoverPage.class);
		PageFactory.initElements(driver, UpgradeCustomerPage.class);
		MouseHoverAction.UpgradeandUpgradeNow();
		Autoredirection.redirectUpgrades();
		UpgradeCustomerPageActions.Login();
		MouseHoverAction.UpgradeandUpgradeNow();
	//  Commented by shaman
		/*PageFactory.initElements(driver, UpgradeCustomerPage.class);
	     Thread.sleep(5000);
			pageobjects.UpgradeCustomerPage.username.sendKeys("ink_jun9198");
			pageobjects.UpgradeCustomerPage.password.sendKeys("test123");
			pageobjects.UpgradeCustomerPage.signInButton.click();
		UpgradeCustomerPageActions.PickSimOTariff();*/
		
	}

	@Given("^that I am a Upgrading customer$")
	public void that_I_am_a_Upgrading_customer() throws Throwable {
		PageFactory.initElements(driver, MouseHoverPage.class);
		PageFactory.initElements(driver, UpgradeCustomerPage.class);
		MouseHoverAction.UpgradeandUpgradeNow();
		Autoredirection.redirectUpgrades();
		UpgradeCustomerPageActions.Login();
		MouseHoverAction.UpgradeandUpgradeNow();
		UpgradeCustomerPageActions.PickSimOTariff();
	}
	
}
	




