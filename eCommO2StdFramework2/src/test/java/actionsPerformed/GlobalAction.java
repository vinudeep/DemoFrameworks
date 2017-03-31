package actionsPerformed;

import helpers.Environment;
import helpers.Filereadingutility;

public class GlobalAction  extends Environment{

	
	public String ExecutionURL(String urlfinder)
	{
		String relativePath = System.getProperty("user.dir");
		String EnvPropFilePath = relativePath + "\\src\\test\\java\\Properties\\AppConfig.properties";
		String Currenturl = Filereadingutility.getPropertyValue(EnvPropFilePath, urlfinder);
		System.out.println(Currenturl);
		
		return Currenturl;
		
	}
	
}
