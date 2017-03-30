package GlobalActions;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import helpers.Environment;

public class CreateScreenshots  extends Environment{
	
	
	    
		public void screennewPics() throws IOException, InterruptedException
		{
		    File scr=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		    File dest= new File("C:\\Selenium\\BDDAutomation\\Screenshots\\screenshot_"+timestamp()+".jpeg");
		    FileUtils.copyFile(scr, dest);
		}

		public String timestamp() {
		    return new SimpleDateFormat("yyyy-MM-dd HH-mm-ss").format(new Date());
		}
		
		
	}
