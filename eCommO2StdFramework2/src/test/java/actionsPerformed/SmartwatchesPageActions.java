package actionsPerformed;

public class SmartwatchesPageActions {
	public static void Elementdisplayvalidation(String Tabname)
	{
		System.out.println(" ");
		
		System.out.println("Smartwatches_Page_Validation");
		
		
		
		if(Tabname!=null)
		{
			switch (Tabname.toLowerCase())
			{
			case "filter":
				if(pageobjects.SmartwatchesPage.SmartwatchesFilterTab.isDisplayed())
				 {
					System.out.println("The Filter Tab is Present on the FitnessPage and the Text is :" + pageobjects.SmartwatchesPage.SmartwatchesFilterTab.getText() );
				 }else{
				   System.out.println("The  Filter Tab is not Present on the FitnessPage and the Text is :" + pageobjects.SmartwatchesPage.SmartwatchesFilterTab.getText());
				 }
				break;
			case "sort":
				if(pageobjects.SmartwatchesPage.SmartwatchesSortTab.isDisplayed())
				 {
					System.out.println("The Sort Tab is Present on the FitnessPage and the Text is :" + pageobjects.SmartwatchesPage.SmartwatchesSortTab.getText() );
				 }else{
				  System.out.println("The  Sort  Tab is not Present on the FitnessPage and the Text is :" + pageobjects.SmartwatchesPage.SmartwatchesSortTab.getText());
				 }
				break;
			
			
			}
	
		
	}
	
 }
	public static void ElementClickAction(String elementname) {
		// TODO Auto-generated method stub
         System.out.println(" ");
		
		System.out.println("Smartwatches_Page_Action");
		
		if(elementname!=null)
		{
			switch (elementname.toLowerCase())
			{
			case "filter":
				pageobjects.SmartwatchesPage.SmartwatchesFilterTab.click();
				break;
			case "sort":
				pageobjects.SmartwatchesPage.SmartwatchesSortTab.click();		
				break;	
			
			}
	
	}
}

}
