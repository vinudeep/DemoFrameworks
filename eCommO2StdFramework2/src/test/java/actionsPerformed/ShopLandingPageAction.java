package actionsPerformed;

import java.awt.AWTException;
import java.awt.Robot;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import helpers.Environment;
import pageobjects.PAYMSimOPage.*;

public class ShopLandingPageAction extends Environment {
	
	
public static void GetTitle()
{
	System.out.println("Currently in Shop Home page");
	String Ele1= driver.getTitle();
	System.out.println("The Page title is "+Ele1);
	
}

		
			

}

	

