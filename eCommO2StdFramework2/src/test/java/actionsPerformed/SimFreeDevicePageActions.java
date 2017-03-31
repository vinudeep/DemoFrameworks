package actionsPerformed;


import org.openqa.selenium.Keys;


import helpers.Environment;

//import Environment.Environment;



public class SimFreeDevicePageActions  extends Environment{
	
	public static void validatetile()
		{   
		System.out.println(" ");
		System.out.println("SIM_FREE_PHONE_PAGE_VALIDATION");
			
		if(pageobjects.SimFreeDevicePage.Device_only_sim_free_Tile.getText().contains("Device only - sim free"))
		 {
		System.out.println("The Element Tile is Present and the Text is :" + pageobjects.SimFreeDevicePage.Device_only_sim_free_Tile.getText() );
		 }else{
			  System.out.println("The  Element Tile is Absent and the Text is :" +pageobjects.SimFreeDevicePage.Device_only_sim_free_Tile.getText());
			 }
		
			if(pageobjects.SimFreeDevicePage.PayM_sim_free_Tile.getText().contains("Add a Pay Monthly sim"))
			 {
				System.out.println("The Element Tile is Present and the Text is :" +pageobjects.SimFreeDevicePage.PayM_sim_free_Tile.getText() );
			 }else{
			  System.out.println("The  Element Tile is Absent and the Text is :" +pageobjects.SimFreeDevicePage.PayM_sim_free_Tile.getText());
			 }
			if(pageobjects.SimFreeDevicePage.PayG_sim_free_Tile.getText().contains("Add a Pay As You Go Sim"))
			 {
				System.out.println("The Element Tile is Present and the Text is :" +pageobjects.SimFreeDevicePage.PayG_sim_free_Tile.getText());
			 }else{
			  System.out.println("The  Element Tile is Absent and the Text is :" +pageobjects.SimFreeDevicePage.PayG_sim_free_Tile.getText());
			 }
				
			
		}
		public static void ElementClick(String elementName) {
			
			if(elementName.contains("Device_only_sim_free_Select"))
			{
				pageobjects.SimFreeDevicePage.Device_only_sim_free_Select.sendKeys(Keys.ENTER);;
			}
			if(elementName.contains("PayM_sim_free_Select"))
			{
				pageobjects.SimFreeDevicePage.PayM_sim_free_Select.sendKeys(Keys.ENTER);;
			}
			if(elementName.contains("PayM_sim_free_Select"))
			{
				pageobjects.SimFreeDevicePage.PayM_sim_free_Select.sendKeys(Keys.ENTER);;
			}
			
			}

	
}
