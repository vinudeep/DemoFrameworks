package pageobjects;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;



public class LikeFreePage extends BaseClass{
	
	public LikeFreePage(WebDriver driver)
	{
		super(driver);
	}
	

	@FindBy(how=How.XPATH,using="(//a[contains(@href, 'https://www.o2.co.uk/shop/like-new/sim-free-phones')])[1]") 
	public static WebElement simfree1;
	
	@FindBy(how=How.XPATH,using=("(//a[contains(text(),'Pay Monthly')])[6]"))
	public static WebElement Paym;
	
	
	@FindBy(how=How.XPATH,using=("(//a[contains(text(),'Pay As You Go')])[10]"))
	public static WebElement PayG;
	

	}
	
	
	

