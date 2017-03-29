package GlobalActions;

import org.openqa.selenium.WebDriver;

import helpers.Environment;


//Below is for redirecting the Url back to reference shop from live shop

public class Autoredirection extends Environment {
	
	
public static void redirect() throws InterruptedException{
		
	String url=driver.getCurrentUrl();
	System.out.println("The current url is "+url);
	int length = url.length();//length of url
	System.out.println("the length of url is "+length);
	int numofChars=1;
	int preo2inurl = url.indexOf("o");	//this will get index of the o2 -1 , so it will be till www
	
//System.out.println("the index of o is "+preo2inurl);

String refurl = ".ref."; // put newurl name here
String newUrl = url.substring(0, preo2inurl-numofChars)+refurl+url.substring(12,length);
System.out.println("The new url is "+newUrl);

driver.get(newUrl);
Thread.sleep(4000);
		
		}

public static void redirectUpgrades() throws InterruptedException{
	
	String url=driver.getCurrentUrl();
	System.out.println("The current url is "+url);
	int length = url.length();//length of url
	System.out.println("the length of url is "+length);
	int numofChars=2;
	int preo2inurl = url.indexOf("2");	//this will get index of the o2 -1 , so it will be till www
	
//System.out.println("the index of o is "+preo2inurl);

String refurl = ".ref."; // put newurl name here
String newUrl = url.substring(0, preo2inurl-numofChars)+refurl+url.substring(17,length);
System.out.println("The new url is "+newUrl);

driver.get(newUrl);
Thread.sleep(4000);

}

	}


