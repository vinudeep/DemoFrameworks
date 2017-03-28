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
		tags = {"@Test7"}
		)
public class RunTest
{
	
}