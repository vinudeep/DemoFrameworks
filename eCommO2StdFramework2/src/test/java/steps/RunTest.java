package steps;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
	    features={ "src/test/java/features/" },
	    glue={"steps"},
		//features = "src/test/java/features/SimFreeDeviceRemoveValidation",
		plugin = {"pretty", "html:target/cucumber-html-report"},
		tags = {"@MostRecommendedCFU-10205_206_203_202"}
		)
public class RunTest
{
	
}