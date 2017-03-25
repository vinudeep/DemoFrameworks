package actionsPerformed;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import helpers.Environment;

public class AgreementPageActions extends Environment {
		  
	  
	  public static void gettitlepage()
	  {
		  
		  System.out.println("Now Entering Agreement Page..."); 
		  System.out.println(driver.getTitle());
	  
	   }
	  
	  
	  public static void Affordability()
	  {
		  
		  System.out.println("Selecting 'I agree that with my current financial commitments...'checkbox");
		  pageobjects.AgreementPage.affordabilityCheck1.click();
		  System.out.println("Selecting ' I agree there are no future changes to my ...'checkbox");
		  pageobjects.AgreementPage.affordabilityCheck2.click();
		  System.out.println("Clicking on the affordabilityButton ");
		  pageobjects.AgreementPage.affordabilityButton.click();
	  }
	  
	  public static void KeyInformation() 
	  {
		  System.out.println("Verifying Key Information");
		  pageobjects.AgreementPage.keyInfoSection.click();
	  }
	  
	  public static void secciSection() 
	  {
		  System.out.println("Verifying Key Information");
		  pageobjects.AgreementPage.secciSection.click();
	  }
	  
	  public static void PayMMobileAgreement() 
	  {
		  System.out.println("Verifying Mobile Agreement section");
		  pageobjects.AgreementPage.secciSection.click();
	  }
	  
	  
	  
	  public static void TermsDeclarationCheckbox() 
	  {
		  System.out.println("Verifying Consumner Credit Agreement");
		  pageobjects.AgreementPage.TermsDeclarationCheckbox.click();
		  pageobjects.AgreementPage.ccaSection.click();
	  }
}
