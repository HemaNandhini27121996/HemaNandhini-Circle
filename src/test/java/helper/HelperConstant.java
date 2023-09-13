package helper;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebDriver;

public class HelperConstant {
	
	public static WebDriver driver;
	public static Map<String, String> propertyMap;
	public static List<String> logList = new ArrayList<String>();
	public static String scenarioTag;
	
	// Wait time
	public static final int WAIT_30 = 30;
	
	
	
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
