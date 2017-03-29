package steps;

import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import helpers.DataHelper;
import pageobjects.*;
import actionsPerformed.*;

public class ECOM_10392_E2EOrderPlacedSimfree_Step_Definition {
	
	
	public WebDriver driver;
	 


	    public ECOM_10392_E2EOrderPlacedSimfree_Step_Definition() {
	        driver = Hooks.driver;
	       
	    }
	    
	    @Given("^I am an eComm user(\\d+)$")
	    public void i_am_an_eComm_user(int arg1) throws Throwable {
	        // Write code here that turns the phrase above into concrete actions
	    	   GlobalAction b1=new GlobalAction();
	    	   //comment by shaman
	           String Currenturl= b1.ExecutionURL("reflikebewurl");
	          // String Currenturl= b1.ExecutionURL("Testurl");
	  	       driver.get(Currenturl);
	    }

	    @When("^I choose 'like new' sim free device$")
	    public void i_choose_like_new_sim_free_device() throws Throwable {
	        // Write code here that turns the phrase above into concrete actions
	    	Like_Free_POM f1=PageFactory.initElements(driver, Like_Free_POM.class);
	    	f1.ElementClick("simfree");
	    	Autoredirection Autoredirect=PageFactory.initElements(driver, Autoredirection.class);
	    	Autoredirect.redirect();
	    	Thread.sleep(2000);
	    	Sim_Free_Phone_POM f2=PageFactory.initElements(driver, Sim_Free_Phone_POM.class);
	    	f2.ElementClick("Device_only_sim_free_Select");
	    	Thread.sleep(5000);
	    
	    }

	    @And("^Land on the 'Tariffs and extra' page$")
	    public void land_on_the_Tariffs_and_extra_page() throws Throwable {
	        // Write code here that turns the phrase above into concrete actions
	    	Sim_Free_Tariff_Extras_page_POM p1=PageFactory.initElements(driver, Sim_Free_Tariff_Extras_page_POM.class);
	    	p1.tariff_select("tariff_12");
	    	Thread.sleep(5000);
	    	p1.basket_selectTest();
	    	Thread.sleep(2000);
	    }

	    @When("^I Land on the basket page and click on \"([^\"]*)\" button$")
	    public void i_Land_on_the_basket_page_and_click_on_button(String arg1) throws Throwable {
	        // Write code here that turns the phrase above into concrete actions
	    	 PageFactory.initElements(driver, BasketPage.class);
	    	 BasketPageActions.gotoCheckout();
	    	 
	    	     		
	    }

	    @When("^input all the fields on the Deleivery page and Click on the 'Continue button'$")
	    public void input_all_the_fields_on_the_Deleivery_page_and_Click_on_the_Continue_button() throws Throwable {
	        // Write code here that turns the phrase above into concrete actions
	    	 PageFactory.initElements(driver, DeliveryPage.class);
		     DeliveryPageActions.SetDeleivery();
		     Thread.sleep(5000);
		     DeliveryPageActions.AboutYou();
		     Thread.sleep(5000);
	    }

	    @When("^I land on the payment page and input all the details and click 'Continue on next step'$")
	    public void i_land_on_the_payment_page_and_input_all_the_details_and_click_Continue_on_next_step() throws Throwable {
	        // Write code here that turns the phrase above into concrete actions
	    	PageFactory.initElements(driver,PaymentPage.class);
	    	PaymentPageActions.Set_Bank_details();
	    	 Thread.sleep(10000);
	    	 PaymentPageActions.Time_At_Address();
	    	 Thread.sleep(4000);
	    	 PaymentPageActions.Card_Details();
	    	 Thread.sleep(10000);
	    	 driver.switchTo().defaultContent();
	    	 
	    }

	    @When("^perform an End to End operation$")
	    public void perform_an_End_to_End_operation() throws Throwable {
	        // Write code here that turns the phrase above into concrete actions
	    	
	  	      
	  	    	/*PageFactory.initElements(driver,AgreementPage.class);
	  	    	AgreementPageActions.gettitlepage();
	  	    	AgreementPageActions.Affordability();
	  	    	AgreementPageActions.KeyInformation();
	  	    	AgreementPageActions.secciSection();
	  	    	AgreementPageActions.PayMMobileAgreement(); 
	  	    	AgreementPageActions.TermsDeclarationCheckbox(); 
	  	    	Thread.sleep(5000);
	  	    	PageFactory.initElements(driver,ReviewPage.class);
	  	    	ReviewPageActions.gettitlepage();
	  	    	ReviewPageActions.TermsCheckBox();
	  	    	ReviewPageActions.PayNow();
	  	    	Thread.sleep(5000);
	  	    	PageFactory.initElements(driver,OrderConfirmationPage.class);
	  	    	OrderConfirmationPageActions.gettitlepage();
	  	    	OrderConfirmationPageActions.MessageDisplayed();*/
	  	    	

}
	    
	    
	    
}
