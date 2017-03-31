package steps;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import GlobalActions.Autoredirection;
import GlobalActions.MouseHoverAction;
import actionsPerformed.GlobalAction;

import actionsPerformed.PAYMSimOPageActions;
import actionsPerformed.UpgradeCustomerPageActions;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageobjects.MouseHoverPage;
import pageobjects.PAYMSimOPage;

import pageobjects.UpgradeCustomerPage;

public class ECOM_10201_Step_Definition {
	public WebDriver driver;
	  


    public ECOM_10201_Step_Definition() {
        driver = Hooks.driver;
       
    }
    @Given("^that I am a acquisition customer$")
    public void that_I_am_a_acquisition_customer() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        GlobalAction b1=new GlobalAction();
        String Currenturl= b1.ExecutionURL("o2_home");
	      driver.get(Currenturl);
	      PageFactory.initElements(driver, MouseHoverPage.class);
		  MouseHoverAction.PayMSimoNavigation();
		  Thread.sleep(5000);
		  Autoredirection.redirect();
    }

    @And("^I want to select a phone pay monhtly sim tariff$")
    public void i_want_to_select_a_phone_pay_monhtly_sim_tariff() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        
    }

    @Then("^I should see the below contents inside the horizontal tariff tile$")
    public void i_should_see_the_below_contents_inside_the_horizontal_tariff_tile(List<String> Links) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
        // E,K,V must be a scalar (String, Integer, Date, enum etc)
    	//old code commented by shaman
    	/*PayMsimspage p1=PageFactory.initElements(driver, PayMsimspage.class);
		for (int i=0; i < Links.size(); i++)
		{
			System.out.println(Links.get(i));
		}
		p1.VerifyMinsDataDisplayed();
		p1.VerifyCostDisplayed();*/
		
		PageFactory.initElements(driver, PAYMSimOPage.class);
		for (int i=0; i < Links.size(); i++)
		{
			System.out.println(Links.get(i));
		}
		PAYMSimOPageActions.VerifyMinsDataDisplayed();
		PAYMSimOPageActions.VerifyCostDisplayed();
		
    }

    @And("^'Buy now' CTA links straight to the basket page\\.$")
    public void buy_now_CTA_links_straight_to_the_basket_page() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        
        PageFactory.initElements(driver, PAYMSimOPage.class);
		PAYMSimOPageActions.BuyNowButtonValidation();
    }

    @And("^'Check box' A check box to be displayed with the below details \"([^\"]*)\"$")
    public void check_box_A_check_box_to_be_displayed_with_the_below_details(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    	  PageFactory.initElements(driver, PAYMSimOPage.class);
		  PAYMSimOPageActions.CheckboxValidation();
    }

    @And("^If customer does not select this check box, then the selection is considered as Smartphone$")
    public void if_customer_does_not_select_this_check_box_then_the_selection_is_considered_as_Smartphone() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
       
    }

    @Given("^that I am a Upgrade customer$")
    public void that_I_am_a_Upgrade_customer() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    	/*GlobalAction b1=new GlobalAction();
        String Currenturl= b1.ExecutionURL("o2_home");
	    driver.get(Currenturl);
	    PageFactory.initElements(driver, MouseHoverPage.class);
		PageFactory.initElements(driver, UpgradeCustomerPage.class);
		MouseHoverAction.UpgradeandUpgradeNow();
		Thread.sleep(5000);
		UpgradeCustomerPageActions.Login();*/
        GlobalAction b1=new GlobalAction();
        String Currenturl= b1.ExecutionURL("o2_home");
	      driver.get(Currenturl);
	      PageFactory.initElements(driver, MouseHoverPage.class);
		  MouseHoverAction.PayMSimoNavigation();
		  Thread.sleep(5000);
		  Autoredirection.redirect();
		
 	      
 	     
    }
    @When("^I land on the Pay monthly sims page in upgrade$")
    public void i_land_on_the_Pay_monthly_sims_page_in_upgrade() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    	Assert.assertEquals(driver.getCurrentUrl(), "https://accounts.ref.o2.co.uk/manage/username/update?sendTo=https%3A%2F%2Fwww.ref.o2.co.uk%2Fupgrade%2F&failureUrl=https%3A%2F%2Faccounts.ref.o2.co.uk%2Fsignin%3FsendTo%3Dhttps%3A%2F%2Fwww.ref.o2.co.uk%2Fupgrade%2F");
    }
}
