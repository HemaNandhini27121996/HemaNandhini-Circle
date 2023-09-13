package samplerunner;

import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;

import cucumber.api.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/test/java/features"},
				glue = {"stepDefinitions" },
		tags= {"@Regression"},
		plugin = {"pretty","html:target/cucumber", "json:target/cucumber.json"}
		)

public class RunCucumberTest {

}
