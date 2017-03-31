package actionsPerformed;

import helpers.Environment;

public class AccessoryPageActions extends Environment{
	
	public static void Elementdisplayvalidation(String Tabname)
	{
		System.out.println(" ");
		
		System.out.println("Accessory_Page_Validation");
		
		
		
		if(Tabname!=null)
		{
			switch (Tabname.toLowerCase())
			{
			case "filter":
				if(pageobjects.AccessoryPage.AccessoryFilterTab.isDisplayed())
				{
			
					System.out.println("The Filter Tab is Present on the AccesoryPage and the Text is :" + pageobjects.AccessoryPage.AccessoryFilterTab.getText() );
				 }else{
				   System.out.println("The  Filter Tab is not Present on the AccessoryPage and the Text is :" + pageobjects.AccessoryPage.AccessoryFilterTab.getText());
				 }
				break;
			case "sort":
				if(pageobjects.AccessoryPage.AccessorySortTab.isDisplayed())
				 {
					System.out.println("The Sort Tab is Present on the AccessoryPage and the Text is :" + pageobjects.AccessoryPage.AccessorySortTab.getText() );
				 }else{
				  System.out.println("The  Sort Tab is not Present on the AccessoryPage and the Text is :" + pageobjects.AccessoryPage.AccessorySortTab.getText());
				 }
				break;
			
			
			}
	
	
	}
	
 }
//this  method used to perform click action on the Accessory Page	
	
	public static void ElementClickAction(String elementname) {
		// TODO Auto-generated method stub
         System.out.println(" ");
		
		System.out.println("Accessory_Page_Action");
		
		if(elementname!=null)
		{
			switch (elementname.toLowerCase())
			{
			case "filter":
				pageobjects.AccessoryPage.AccessoryFilterTab.click();
				break;
			case "sort":
				pageobjects.AccessoryPage.AccessorySortTab.click();		
				break;	
			
			}
	
	}
}
}
