package helpers;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;


public class SeleniumHelper {
	
	public static void Invoke_browser(String BrowserType)
	{	 
		if(BrowserType.equalsIgnoreCase("ie"))
		{
			
			String OSArchitecture = System.getProperty("os.arch");
			System.out.println(OSArchitecture);
			if (OSArchitecture.equalsIgnoreCase("x86"))
			{
				System.setProperty("webdriver.ie.driver", "src\\test\\java\\InternalLibraries\\BrowserDrivers\\Internet_Explorer\\IEDriverServer_Win32_3.1.0\\IEDriverServer.exe"); 
			}else
			{
				System.setProperty("webdriver.ie.driver", "src\\test\\java\\InternalLibraries\\BrowserDrivers\\Internet_Explorer\\IEDriverServer_x64_3.1.0\\IEDriverServer.exe") ;
			}

			; 
			DesiredCapabilities capability = DesiredCapabilities.internetExplorer();			
			capability.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,true);
			capability.setCapability("useLegacyInternalServer", true);
			Environment.driver = new InternetExplorerDriver(capability);
			Environment.driver.manage().deleteAllCookies();
            
			Environment.driver.navigate().refresh();      

			
		}
		else if (BrowserType.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","src\\test\\java\\InternalLibraries\\BrowserDrivers\\ChromeDriver\\chromedriver.exe");
			Environment.driver = new ChromeDriver();					
		}
		else
		{
			Environment.driver = new FirefoxDriver();	
		}
		Environment.driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Environment.driver.manage().window().maximize();
	}

}
