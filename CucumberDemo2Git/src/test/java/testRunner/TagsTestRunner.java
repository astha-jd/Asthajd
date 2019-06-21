package testRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="features\\DemoTags.feature",
		glue = {"stepDefinition"},
		tags = {"@SmokeTest"}
		)

public class TagsTestRunner {
	
	

}
