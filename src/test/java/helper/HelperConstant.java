package helper;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebDriver;

public class HelperConstant {

	/**
	 * field WebDriver
	 */
	public static WebDriver driver;
	/**
	 * field browser
	 */
	public static String browser;
	/**
	 * field propertyMap
	 */
	public static Map<String, String> propertyMap;
	/**
	 * field LogList
	 */
	public static List<String> logList = new ArrayList<String>();
	/**
	 * field scenarioTag
	 */
	public static String scenarioTag;

	// Wait time
	public static final int WAIT_30 = 30;

	public static String getBrowser() {
		return browser;
	}

	public static void setBrowser(String browser) {
		HelperConstant.browser = browser;
	}

	public static String getScenarioTag() {
		return scenarioTag;
	}

	public static void setScenarioTag(String scenarioTag) {
		HelperConstant.scenarioTag = scenarioTag;
	}

	public static WebDriver getDriver() {
		return driver;
	}

	public static void setDriver(WebDriver driver) {
		HelperConstant.driver = driver;
	}

	public static Map<String, String> getPropertyMap() {
		return propertyMap;
	}

	public static void setPropertyMap(Map<String, String> propertyMap) {
		HelperConstant.propertyMap = propertyMap;
	}

	public static List<String> getLogList() {
		return logList;
	}

	public static void setLogList(List<String> logList) {
		HelperConstant.logList = logList;
	}

}
