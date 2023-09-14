package stepdefinitions;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import helper.HelperConstant;
import helper.Log;
import helper.ReadProperty;
import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * Background class to open and close driver
 */
public class BackgroundStepDefinition {

	public static WebDriver driver;

	/**
	 * Method to open Driver
	 * @param scenario
	 * @throws IOException
	 */
	@Before
	public static void OpenDriver(Scenario scenario) throws IOException {
		
		HelperConstant.setBrowser(System.getProperty("browser"));
		
		HelperConstant.setBrowser("Chrome");

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

	/**
	 * Method to setup Browser
	 * @param driver
	 * @return
	 */
	public static WebDriver openBroswer(WebDriver driver) {
		switch(HelperConstant.getBrowser()) {
		  case "Chrome":
			  WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
		    break;
		  case "FireFox":
			  WebDriverManager.firefoxdriver().setup();
				driver = new FirefoxDriver();
		    break;
		  default:
			  WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
		}
		// System.setProperty("webdriver.chrome.driver", FilePathConfig.chromeDriver);
		return driver;
	}

	/**
	 * Method to close driver
	 */
	@After
	public static void closeDriver() {
		driver.close();
		Log.info("The driver is closed");
	}

}
