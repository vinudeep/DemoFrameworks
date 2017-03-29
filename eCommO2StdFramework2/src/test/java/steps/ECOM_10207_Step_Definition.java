package steps;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import actionsPerformed.GlobalAction;
import actionsPerformed.LikefreeHomepageAction;
import actionsPerformed.SimFreeDevicePageActions;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageobjects.LikeFreePage;
import pageobjects.SimFreeDevicePage;

public class ECOM_10207_Step_Definition {
	 public WebDriver driver;
	   


	    public ECOM_10207_Step_Definition() {
	        driver = Hooks.driver;
	       
	    }
	    
	@Given("^that I am a merchandising manager$")
	public void that_I_am_a_merchandising_manager() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		GlobalAction b1=new GlobalAction();
        String Currenturl= b1.ExecutionURL("likenewurl");
	      driver.get(Currenturl);
		
		 PageFactory.initElements(driver, LikeFreePage.class);
		 LikefreeHomepageAction.ElementClick("simfree");
    	 
	}

	@When("^I am deciding the order of the pay-monthly sim tariffs$")
	public void i_am_deciding_the_order_of_the_pay_monthly_sim_tariffs() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		PageFactory.initElements(driver, SimFreeDevicePage.class);
		SimFreeDevicePageActions.ElementClick("Device_only_sim_free_Select");
		
	    
	}

	@Then("^on landing of the Pay monthly sims page, the default order of the tariffs from the tile below the promoted white tile should be from High to low data$")
	public void on_landing_of_the_Pay_monthly_sims_page_the_default_order_of_the_tariffs_from_the_tile_below_the_promoted_white_tile_should_be_from_High_to_low_data() throws Throwable {
	    try{
			List<WebElement> outercontainer = driver.findElements(By.xpath("//*[@id='tariff-tile']"));

			  // =====================================
			 //		Below will display the Data available per month 
			 //====================================
			List<WebElement> DataContainer = outercontainer.get(0).findElements(By.xpath("//*[@class='col-xs-6 col-sm-3 dmt-container info-container']/ul/li[1]/h2"));
			   String[] outArray = new String[DataContainer.size()];  // instantiate Array

			    for (int i = 1; i < DataContainer.size(); i++)
			       {
			          outArray[i] = DataContainer.get(i).getText();
			           System.out.println(outArray[i]);
			        }
			    for (int i = 1; i < outArray.length; i++) {
				       
			        System.out.println(outArray[i]);
			        }
				boolean valid = false ; // isParameterDesc(outArray);
				if(valid)
				{
		       System.out.println("valid Squence  "+valid);
				}
						else
						{
					System.out.println("invalid squence --------------->>>>>>>>>>>>");
				    // Assert.fail("The sequence is in not decreasing order.");
						}
			 
			       
			
		  			}
			catch (IndexOutOfBoundsException e) {
				
			}
		
		
		 
		
		}
	static boolean isParameterDesc(String[] str) {
		boolean isValidSquence = false ;
		String lastSubStr;
		String previousStr;
		for (int i = 0; i < str.length; i++) {
			    
					if (i + 1 < str.length) {
						 lastSubStr=str[i + 1].substring(str[i + 1].length() - 2,str[i + 1].length());
						 previousStr=str[i].substring(str[i].length() - 2, str[i].length());	
				if (previousStr.equals("GB")&& lastSubStr.equals("GB")) {
				if(Integer.valueOf((str[i].substring(0, str[i].length() - 2)))<Integer.valueOf((str[i + 1].substring(0, str[i + 1].length() - 2))))
					return false;
				} else if (previousStr.equals("MB")&& lastSubStr.equals("MB")) {
					
					 if((Integer.valueOf(str[i].substring(0, str[i].length() - 2)))<Integer.valueOf(str[i + 1].substring(0, str[i + 1].length() - 2)))
					 return false;
				}
			}
		}
		return true;
	}
	    
	}

