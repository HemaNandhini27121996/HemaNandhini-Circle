package samplerunner;

import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;

import cucumber.api.CucumberOptions;

/**
 * RunCucumber class
 */
@RunWith(Cucumber.class)
@CucumberOptions(features = { "src/test/java/features" }, glue = { "stepdefinitions" }, tags = { "@Circle" }, plugin = {
		"pretty", "html:target/cucumber", "json:target/cucumber.json" })

public class RunCucumberTest {

}
