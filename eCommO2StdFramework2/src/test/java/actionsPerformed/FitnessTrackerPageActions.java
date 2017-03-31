package actionsPerformed;

import helpers.Environment;

public class FitnessTrackerPageActions extends Environment {
	
	public static void Elementdisplayvalidation(String Tabname)
	{
		System.out.println(" ");
		
		System.out.println("FitnessTracker_Page_Validation");
		
		
		
		if(Tabname!=null)
		{
			switch (Tabname.toLowerCase())
			{
			case "filter":
				if(pageobjects.FitnessTrackerPage.FitnessFilterTab.isDisplayed())
				 {
					System.out.println("The Filter Tab is Present on the FitnessPage and the Text is :" + pageobjects.FitnessTrackerPage.FitnessFilterTab.getText() );
				 }else{
				   System.out.println("The  Filter Tab is not Present on the FitnessPage and the Text is :" + pageobjects.FitnessTrackerPage.FitnessFilterTab.getText());
				 }
				break;
			case "sort":
				if(pageobjects.FitnessTrackerPage.FitnessSortTab.isDisplayed())
				 {
					System.out.println("The Sort Tab is Present on the FitnessPage and the Text is :" + pageobjects.FitnessTrackerPage.FitnessSortTab.getText() );
				 }else{
				  System.out.println("The  Sort  Tab is not Present on the FitnessPage and the Text is :" + pageobjects.FitnessTrackerPage.FitnessSortTab.getText());
				 }
				break;
			
			
			}
	
		
	}
	
 }
	
	
	public static void ElementClickAction(String elementname) {
		// TODO Auto-generated method stub
         System.out.println(" ");
		
		System.out.println("Fitness_Tracker_Page_Action");
		
		if(elementname!=null)
		{
			switch (elementname.toLowerCase())
			{
			case "filter":
				pageobjects.FitnessTrackerPage.FitnessFilterTab.click();
				break;
			case "sort":
				pageobjects.FitnessTrackerPage.FitnessSortTab.click();		
				break;	
			
			}
	
	}
}

}
