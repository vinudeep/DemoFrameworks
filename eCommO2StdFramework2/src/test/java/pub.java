import java.awt.AWTException;
import java.awt.Robot;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import helpers.Environment;

public class pub {

	
	public static String MenuName="Tablets";
	public static String SubmenuName="Browse Tablets";
	
	public static String Menuxpath="(//a[contains(text(),'@@@')])[1]";
	public static String SubMenuxpath="//a[contains(text(),'BBB')]";
	public static void main(String[] args) throws AWTException, InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", 
	               "C:/Automation/Selenium/chromedriver.exe");
       	WebDriver driver=new ChromeDriver();
       	
       	
       	driver.get("https://www.ref.o2.co.uk");
       	
       	try
       	{
       	
		
		Menuxpath = Menuxpath.replace("@@@",MenuName);
		SubmenuName = SubmenuName.replace("BBB",SubmenuName);
		
		WebElement ShopMenuName=driver.findElement(By.xpath(Menuxpath));
		
		WebElement ShopSubMenuName=driver.findElement(By.xpath(SubmenuName));
		
		 System.out.println("Performing mouseoverAction");
		  Point coordinates = pageobjects.MouseHoverPage.MoveMouseOnShopTab.getLocation();
		  Robot robot = new Robot();
		  robot.mouseMove(coordinates.getX(),coordinates.getY()+120);
		 		  
		  Actions action = new Actions(driver);
		  action.moveToElement(ShopMenuName).build().perform();
		  Thread.sleep(2000);
		  action.moveToElement(ShopSubMenuName).build().perform();
		  Thread.sleep(2000);
		  ShopSubMenuName.click();

		  //Move mouse pointer away from location
		  Point coordinates2 = driver.findElement(By.xpath("//*[@id='header-consumer']/div")).getLocation();
		  Robot robot2 = new Robot();
		  robot2.mouseMove(coordinates2.getX(),coordinates.getY()+120);
	}
	catch(NoSuchElementException e)
	{
	//check if popup is present, if yes, handle it.
		Environment.driver.switchTo().frame("edr_l_first"); 
		System.out.println("********We are switch to the iframe*******");
		//Saying no to survey
		driver.findElement(By.xpath("//a[@id='no']/span")).click();
		System.out.println("*******Saying no to survey*******");
		System.out.println("*********Exiting the popups present in iframe***************");
		Environment.driver.switchTo().defaultContent();
		    		
		
	}

	}

}
