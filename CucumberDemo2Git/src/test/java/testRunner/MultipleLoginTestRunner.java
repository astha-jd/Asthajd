package testRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features = "features\\MultipleLogin.feature",
		glue = {"stepDefinition"}
		)

public class MultipleLoginTestRunner {
	
}
