package actionsPerformed;

import org.openqa.selenium.WebElement;

import helpers.Environment;

public class TabletPageActions extends Environment {

	
	public static void validateElements(String Tabname)
	{
		System.out.println(" ");
		
		System.out.println("Tablet_Page_Validation");
		
		
		
		if(Tabname!=null)
		{
			switch (Tabname.toLowerCase())
			{
			case "filter":
				if(pageobjects.TabletPage.TabletFilterTab.isDisplayed())
				 {
					System.out.println("The Filter Tab is Present on the TabletPage and the Text is :" + pageobjects.TabletPage.TabletFilterTab.getText() );
				 }else{
				   System.out.println("The  Filter Tab is not Present on the TabletPage and the Text is :" + pageobjects.TabletPage.TabletFilterTab.getText());
				 }
				break;
			case "sort":
				if(pageobjects.TabletPage.TabletSortTab.isDisplayed())
				 {
					System.out.println("The  Sort Tab is Present on the TabletPage and the Text is :" + pageobjects.TabletPage.TabletSortTab.getText() );
				 }else{
				  System.out.println("The   Sort Tab is not Present on the TabletPage and the Text is :" + pageobjects.TabletPage.TabletSortTab.getText());
				 }
				break;
			
			
			}
	
		
	}

		
	
 }
	


	public static void ElementClickAction(String elementname) {
		// TODO Auto-generated method stub
		WebElement w1=null;
         System.out.println(" ");
		
		System.out.println("Tablet_Page_Action");
		
		if(elementname!=null)
		{
			switch (elementname.toLowerCase())
			{
			case "filter":
				w1=pageobjects.TabletPage.TabletFilterTab;
				break;
			case "sort":
				w1=pageobjects.TabletPage.TabletSortTab;		
				break;	
			
			}
	
	}
}
}
