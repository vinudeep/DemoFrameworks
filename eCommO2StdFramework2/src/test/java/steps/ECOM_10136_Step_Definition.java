package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import actionsPerformed.AccessoryPageActions;
import actionsPerformed.FitnessTrackerPageActions;
import actionsPerformed.SmartwatchesPageActions;
import actionsPerformed.TabletPageActions;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import pageobjects.AccessoryPage;
import pageobjects.FitnessTrackerPage;
import pageobjects.SmartwatchesPage;
import pageobjects.TabletPage;

public class ECOM_10136_Step_Definition {
	public WebDriver driver;
	  


    public ECOM_10136_Step_Definition() {
        driver = Hooks.driver;
       
    }
	
	@And("^I click on the SORT tab of tablet$")
	public void i_click_on_the_SORT_tab_of_tablet() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		PageFactory.initElements(driver, TabletPage.class);
         TabletPageActions.ElementClickAction("sort");
         Thread.sleep(5000);
	 }

	@Then("^the enhanced SORT Tablet should be displayed to me as per given UX$")
	public void the_enhanced_SORT_Tablet_should_be_displayed_to_me_as_per_given_UX() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		PageFactory.initElements(driver, TabletPage.class);
		TabletPageActions.validateElements("sort");
		
	}

	@And("^I land on the Smartwatchess Trackers listing page on O(\\d+) Shop$")
	public void i_land_on_the_Smartwatchess_Trackers_listing_page_on_O_Shop(int arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Assert.assertEquals(driver.getCurrentUrl(), "https://www.o2.co.uk/shop/smartwatches/#sort=content.sorting.featured&page=1" );
	}

	@And("^I click on the SORT tab of Smartwatches$")
	public void i_click_on_the_SORT_tab_of_Smartwatches() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		PageFactory.initElements(driver,SmartwatchesPage.class);
        SmartwatchesPageActions.ElementClickAction("sort");
        Thread.sleep(5000);
	}

	@Then("^the enhanced SORT Smartwatches should be displayed to me as per given UX in \\((\\d+) columns\\)$")
	public void the_enhanced_SORT_Smartwatches_should_be_displayed_to_me_as_per_given_UX_in_columns(int arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		PageFactory.initElements(driver, SmartwatchesPage.class);
		SmartwatchesPageActions.Elementdisplayvalidation("Sort");
	}

	@And("^I land on the FtinessTracker Trackers listing page on O(\\d+) Shop$")
	public void i_land_on_the_FtinessTracker_Trackers_listing_page_on_O_Shop(int arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Assert.assertEquals(driver.getCurrentUrl(), "https://www.o2.co.uk/shop/fitness-trackers/#sort=content.sorting.featured&page=1");
	}

	@And("^I click on the SORT tab of Fitness$")
	public void i_click_on_the_SORT_tab_of_Fitness() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		PageFactory.initElements(driver,FitnessTrackerPage.class);
        FitnessTrackerPageActions.ElementClickAction("sort");
        Thread.sleep(5000);
	}

	@Then("^the enhanced SORT Fitness should be displayed to me as per given UX in \\((\\d+) columns\\)$")
	public void the_enhanced_SORT_Fitness_should_be_displayed_to_me_as_per_given_UX_in_columns(int arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		PageFactory.initElements(driver, FitnessTrackerPage.class);
		FitnessTrackerPageActions.Elementdisplayvalidation("Sort");
	}

	@And("^I click on the SORT tab of accesory$")
	public void i_click_on_the_SORT_tab_of_accesory() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		PageFactory.initElements(driver, AccessoryPage.class);
        AccessoryPageActions.ElementClickAction("sort");
        Thread.sleep(5000);
	}

	@Then("^the enhanced SORT accessories should be displayed to me as per given UX\\.$")
	public void the_enhanced_SORT_accessories_should_be_displayed_to_me_as_per_given_UX() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		PageFactory.initElements(driver, AccessoryPage.class);
		AccessoryPageActions.Elementdisplayvalidation("Sort");
	}

}
