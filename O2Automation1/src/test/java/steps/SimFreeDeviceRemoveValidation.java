package steps;


import cucumber.api.Scenario;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import helpers.DataHelper;
import pageobjects.BasketPage;
import pageobjects.LikeFreePage;
import pageobjects.SimFreeDevicePage;
import pageobjects.TariffAndExtrasPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import actionsPerformed.*;

import java.util.HashMap;
import java.util.List;


public class SimFreeDeviceRemoveValidation {


    public static WebDriver driver;
    public List<HashMap<String, String>> datamap;


    public SimFreeDeviceRemoveValidation() 
    {
        driver = Hooks.driver;
       // datamap = DataHelper.data();
    }



@Given("^I am an eComm user(\\d+)$")
public void I_am_an_eComm_user(int arg1) throws Throwable 
{
	GlobalAction b1=new GlobalAction();
    String Currenturl= b1.ExecutionURL("likenewurl");
     driver.get(Currenturl);
	
  System.out.println("Testmethodcalled");
	PageFactory.initElements(driver, LikeFreePage.class);
	LikefreeHomepageAction.ElementClick("simfree1");
	
}

@When("^I choose 'like new' sim free device$")
public void I_choose_like_new_sim_free_device() throws Throwable {
  PageFactory.initElements(driver, SimFreeDevicePage.class);
  SimFreeDevicePageActions.ElementClick("Device_only_sim_free_Select");
}


@And("^Land on the 'Tariffs and extra' page$")
public void Land_on_the_Tariffs_and_extra_page() throws Throwable {
    // Express the Regexp above with the code you wish you had
	PageFactory.initElements(driver, TariffAndExtrasPage.class);
	TariffAndExtrasPageActions.validateElements();
}

@Then("^I SHOULD be able to see both (\\d+) month and (\\d+) days tab just above the tariffs tile on the right hand side, to select the associated Pay monthly tariffs with a text 'Contract length' at the right hand side$")
public void I_SHOULD_be_able_to_see_both_month_and_days_tab_just_above_the_tariffs_tile_on_the_right_hand_side_to_select_the_associated_Pay_monthly_tariffs_with_a_text_Contract_length_at_the_right_hand_side(int arg1, int arg2) throws Throwable {
    // Express the Regexp above with the code you wish you had
	PageFactory.initElements(driver, TariffAndExtrasPage.class);
	TariffAndExtrasPageActions.tariff_select("tariff");
	TariffAndExtrasPageActions.basket_select();
}

@And("^Remove copy 'Contract length is (\\d+) months.'$")
public void Remove_copy_Contract_length_is_months_(int arg1) throws Throwable 
{
	PageFactory.initElements(driver, BasketPage.class);
	BasketPageActions.validatelabel();
	BasketPageActions.labelvaluedisplay();

}
	
}
