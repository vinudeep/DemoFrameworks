package pageobjects;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;



public class Like_Free_POM {
	
  WebDriver driver;
  
  public Like_Free_POM(WebDriver Idriver)
  {
	  
	  this.driver=Idriver;
	  
  }

	@FindBy(how=How.XPATH,using=("(//a[contains(@href, 'https://www.o2.co.uk/shop/like-new/sim-free-phones')])[1]")) 
	WebElement simfree1;
	
	@FindBy(how=How.XPATH,using=("(//a[contains(text(),'Pay Monthly')])[6]"))
	WebElement Paym;
	
	
	@FindBy(how=How.XPATH,using=("(//a[contains(text(),'Pay As You Go')])[10]"))
	WebElement PayG;
	


	public void ElementClick(String elementName) {
		
		if(elementName.contains("simfree"))
		{
		    
			simfree1.click();
		}
		if(elementName.contains("Paym"))
		{
			Paym.click();
		}
		if(elementName.contains("PayG"))
		{
			PayG.click();
		}
		
		}
	}
	
	
	

