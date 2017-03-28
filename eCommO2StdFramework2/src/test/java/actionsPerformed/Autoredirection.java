package actionsPerformed;

import org.openqa.selenium.WebDriver;


//Below is for redirecting the Url back to reference shop from live shop

public class Autoredirection {
	
  WebDriver driver;
  
  public Autoredirection(WebDriver Idriver)
  {
	  
	  this.driver=Idriver;
	  
  }
    
	
public void redirect(){
		
	String url=driver.getCurrentUrl();
	int length = url.length();//length of url
	System.out.println("the length of url is "+length);
	int numofChars=1;
	int preo2inurl = url.indexOf("o");	//this will get index of the o2 -1 , so it will be till www
	
System.out.println("the index of o is "+preo2inurl);

String refurl = ".ref."; // put newurl name here
String newUrl = url.substring(0, preo2inurl-numofChars)+refurl+url.substring(12,length);
System.out.println("The new url is "+newUrl);

driver.get(newUrl);
		
		}

	}


