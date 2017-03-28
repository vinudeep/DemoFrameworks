package steps;



import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
	     
		plugin ={"html:TestExecutionResult/report"},
	       features={ "src/test/java/Features/Sim_Free_Acquisition.feature" },
	       glue={"StepDefinition"},
		   tags={"@Test456"}
	      
		             
	       
	)

public class Sim_Free_Runner {

}
