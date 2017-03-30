package steps;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import GlobalActions.MouseHoverAction;
import actionsPerformed.*;


import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import pageobjects.MouseHoverPage;
import pageobjects.PAYMSimOPage;

public class ECOM_10201_Step_Definition {
	public WebDriver driver;
	  


    public ECOM_10201_Step_Definition() {
        driver = Hooks.driver;
       
    }
    @Given("^that I am a acquisition customer$")
    public void that_I_am_a_acquisition_customer() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    	PageFactory.initElements(driver, ShopLandingPageAction.class);
    	ShopLandingPageAction.GetTitle();
	    
    }

    @And("^I want to select a phone pay monhtly sim tariff$")
    public void i_want_to_select_a_phone_pay_monhtly_sim_tariff() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    	PageFactory.initElements(driver, MouseHoverPage.class);
		MouseHoverAction.PayMSimoNavigation();
    }

    @Then("^I should see the below contents inside the horizontal tariff tile$")
    public void i_should_see_the_below_contents_inside_the_horizontal_tariff_tile(List<String> Links) throws Throwable {
       		
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
        //old code commented by shaman
    	//PayMsimspage p2=PageFactory.initElements(driver, PayMsimspage.class);		
	    //p2.BuyNowButtonValidation();
        PageFactory.initElements(driver, PAYMSimOPage.class);
		PAYMSimOPageActions.BuyNowButtonValidation();
    }

    @And("^'Check box' A check box to be displayed with the below details \"([^\"]*)\"$")
    public void check_box_A_check_box_to_be_displayed_with_the_below_details(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    	/*PayMsimspage p3=PageFactory.initElements(driver, PayMsimspage.class);
		p3.CheckboxValidation();*/
    	//PageFactory.initElements(driver, PAYMSimOPage.class);
		//PAYMSimOPageActions.CheckboxValidation();
    }

    @And("^If customer does not select this check box, then the selection is considered as Smartphone$")
    public void if_customer_does_not_select_this_check_box_then_the_selection_is_considered_as_Smartphone() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
       
    }

    @Given("^that I am a Upgrade customer$")
    public void that_I_am_a_Upgrade_customer() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    	 GlobalAction b1=new GlobalAction();
         String Currenturl= b1.ExecutionURL("SimPayM");
 	      driver.get(Currenturl);
 	      
 	     // MouseHoverAction p1=PageFactory.initElements(driver, MouseHoverAction.class);
 			//p1.PayMSimoNavigation();
    }
}
