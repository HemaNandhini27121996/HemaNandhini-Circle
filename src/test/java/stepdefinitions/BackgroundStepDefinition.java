package stepdefinitions;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import configuration.FilePathConfig;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import helper.HelperConstant;
import helper.Log;
import helper.ReadProperty;


public class BackgroundStepDefinition {
	public static WebDriver driver;

	@Before
	public static void OpenDriver(Scenario scenario) throws IOException  {
		
		String scenarioTag = scenario.getSourceTagNames().toString();
		
		Log.info("The scenario " + scenarioTag + " is running ");
		
		HelperConstant.setScenarioTag(scenarioTag);
		
				ReadProperty.getServiceProperties();
			

			driver = openBroswer(driver);
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.get(HelperConstant.getPropertyMap().get("CircleHealthGroup_Url"));
			HelperConstant.setDriver(driver);
			Log.info("The driver is started and the application is launched");
			
		}

		

	

	public static WebDriver openBroswer(WebDriver driver) {

		System.setProperty("webdriver.chrome.driver", FilePathConfig.chromeDriver);
		driver = new ChromeDriver();
		return driver;
	}
	
	@After
	public static void closeDriver() {
			//driver.close();
			Log.info("The driver is closed");
		}
		
	

}

