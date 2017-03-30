package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


@SuppressWarnings("unused")
public class ShopLandingPage {
	
	

	@FindBy(how=How.XPATH,using="(//a[contains(text(),'Remove')])[1]") 
	public static WebElement Homepagelink;
	
}
