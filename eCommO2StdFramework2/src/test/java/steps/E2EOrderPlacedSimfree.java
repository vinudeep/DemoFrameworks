package steps;

import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import actionsPerformed.LikefreeHomepageAction;
import cucumber.api.java.en.When;
import helpers.DataHelper;
import pageobjects.*;
import actionsPerformed.*;

public class E2EOrderPlacedSimfree {
	
	
	public WebDriver driver;
	 


	    public E2EOrderPlacedSimfree() {
	        driver = Hooks.driver;
	       
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
	    	 DeliveryPageActions.AboutYou();
		     DeliveryPageActions.SetDeleivery();

	    }

	    @When("^I land on the payment page and input all the details and click 'Continue on next step'$")
	    public void i_land_on_the_payment_page_and_input_all_the_details_and_click_Continue_on_next_step() throws Throwable {
	        // Write code here that turns the phrase above into concrete actions
	    	 PageFactory.initElements(driver,PaymentPage.class);
	    	 PaymentPageActions.Set_Bank_details();
	    	 PaymentPageActions.Time_At_Address();
	    	 PaymentPageActions.Card_Details();
	    }

	    @When("^perform an End to End operation$")
	    public void perform_an_End_to_End_operation() throws Throwable {
	        // Write code here that turns the phrase above into concrete actions
	        

}
}
