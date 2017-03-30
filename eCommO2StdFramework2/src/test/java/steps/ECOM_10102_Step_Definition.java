package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import GlobalActions.MouseHoverAction;
import actionsPerformed.AccessoryPageActions;
import actionsPerformed.BasketPageActions;
import actionsPerformed.FitnessTrackerPageActions;
import actionsPerformed.GlobalAction;
import actionsPerformed.ShopLandingPageAction;
import actionsPerformed.SmartwatchesPageActions;
import actionsPerformed.TabletPageActions;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import helpers.Environment;
import helpers.Filereadingutility;
import pageobjects.AccessoryPage;
import pageobjects.BasketPage;
import pageobjects.FitnessTrackerPage;
import pageobjects.MouseHoverPage;
import pageobjects.ShopLandingPage;
import pageobjects.SmartwatchesPage;
import pageobjects.TabletPage;


public class ECOM_10102_Step_Definition {

	public WebDriver driver;
	  


    public ECOM_10102_Step_Definition() {
        driver = Hooks.driver;
       
    }
	

@Given("^that I am an upgrading/acqusition customer Tablet journey$")
public void that_I_am_an_upgrading_acqusition_customer_Tablet_journey() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	
         /*GlobalAction b1=new GlobalAction();
         String Currenturl= b1.ExecutionURL("TabletUrl");
	      driver.get(Currenturl);*/
	PageFactory.initElements(driver, MouseHoverPage.class);
	MouseHoverAction.PayMTabletsLandingPage();
    		
	
}

@And("^I land on the tablet listing page on O(\\d+) Shop$")
public void i_land_on_the_tablet_listing_page_on_O_Shop(int arg1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	//Assert.assertEquals(driver.getCurrentUrl(), "https://www.o2.co.uk/shop/tablets/#sort=content.sorting.featured&page=1" );
	PageFactory.initElements(driver, ShopLandingPage.class);
	ShopLandingPageAction.GetTitle();
}

@Then("^the enhanced filter tab should be displayed to on Tablet as per given Ux$")
public void the_enhanced_filter_tab_should_be_displayed_to_on_Tablet_as_per_given_Ux() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	PageFactory.initElements(driver, TabletPage.class);
	TabletPageActions.validateElements("filter");
}

@Given("^that I am an upgrading/acquisition customer Accessory Journey$")
public void that_I_am_an_upgrading_acquisition_customer_Accessory_Journey() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	 GlobalAction b1=new GlobalAction();
     String Currenturl= b1.ExecutionURL("AccessoryUrl");
      driver.get(Currenturl);
}

@And("^I land on the accessory listing page on O(\\d+) Shop$")
public void i_land_on_the_accessory_listing_page_on_O_Shop(int arg1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	Assert.assertEquals(driver.getCurrentUrl(), "https://www.o2.co.uk/shop/accessories/all/#sort=content.sorting.featured&page=1" );
}


@Then("^the enhanced filter tab should be displayed to on Accessory as per given UX$")
public void the_enhanced_filter_tab_should_be_displayed_to_on_Accessory_as_per_given_UX() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	PageFactory.initElements(driver, AccessoryPage.class);
	AccessoryPageActions.Elementdisplayvalidation("filter");
}

@Given("^that I am an upgrading/acquisition customer Fitness Journey$")
public void that_I_am_an_upgrading_acquisition_customer_Fitness_Journey() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	 GlobalAction b1=new GlobalAction();
     String Currenturl= b1.ExecutionURL("Fitnessurl");
      driver.get(Currenturl);
}



@And("^I land on the Ftiness Trackers listing page on O(\\d+) Shop$")
public void i_land_on_the_Ftiness_Trackers_listing_page_on_O_Shop(int arg1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	Assert.assertEquals(driver.getCurrentUrl(), "https://www.o2.co.uk/shop/fitness-trackers/#sort=content.sorting.featured&page=1");
}


@Then("^the enhanced filter tab should be displayed to on Fitness as per given Ux$")
public void the_enhanced_filter_tab_should_be_displayed_to_on_Fitness_as_per_given_Ux() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	PageFactory.initElements(driver, FitnessTrackerPage.class);
	FitnessTrackerPageActions.Elementdisplayvalidation("filter");
}





@Given("^that I am an upgrading/acquisition customer Smartwatches$")
public void that_I_am_an_upgrading_acquisition_customer_Smartwatches() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	 GlobalAction b1=new GlobalAction();
     String Currenturl= b1.ExecutionURL("SmartwatchesUrl");
      driver.get(Currenturl);
}

@And("^I land on the Smartwatches Trackers listing page on O(\\d+) Shop$")
public void i_land_on_the_Smartwatches_Trackers_listing_page_on_O_Shop(int arg1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	Assert.assertEquals(driver.getCurrentUrl(), "https://www.o2.co.uk/shop/smartwatches/#sort=content.sorting.featured&page=1" );
}



@Then("^the enhanced filter tab should be displayed to Smartwatches as per given Ux$")
public void the_enhanced_filter_tab_should_be_displayed_to_Smartwatches_as_per_given_Ux() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	PageFactory.initElements(driver, SmartwatchesPage.class);
	SmartwatchesPageActions.Elementdisplayvalidation("filter");
}

	
}
