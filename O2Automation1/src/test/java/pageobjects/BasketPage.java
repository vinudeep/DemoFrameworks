package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


@SuppressWarnings("unused")
public class BasketPage extends BaseClass{
	
	public BasketPage(WebDriver driver)
	{
		super(driver);
	}
	

	@FindBy(how=How.XPATH,using="(//a[contains(text(),'Remove')])[1]") 
	public static WebElement DeviceRemovebtn ;
	
	@FindBy(how=How.XPATH,using="(//a[contains(text(),'Remove')])[2]") 
	public static WebElement tariffRemovebtn ;
	
	@FindBy(how=How.XPATH,using="//*[@id='shopApp']/div[3]/div/div/div[1]/div[1]/div/form/input[@value='Go to checkout']") 
	public static WebElement checkoutbtn ;
	
	@FindBy(how=How.XPATH,using="//*[@id='shopApp']/div[3]/div/div/div[1]/div[2]/ul/li[5]/section[2]/div/div/p[1]") 
	public static WebElement upfrontcost ;
	
	@FindBy(how=How.XPATH,using="//*[@id='shopApp']/div[3]/div/div/div[1]/div[2]/ul/li[5]/section[2]/div/div/p[2]") 
	public static WebElement monthlycost ;
	
	@FindBy(how=How.XPATH,using=("//*[@id='header']/div[2]/div[1]/div/button"))
	WebElement GotoBasket;
	
}
