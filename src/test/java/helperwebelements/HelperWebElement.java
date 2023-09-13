package helperwebelements;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import helper.HelperConstant;
import helper.Log;

public class HelperWebElement {

	public static void type(WebDriver driver, WebElement selected, String ToBeTyped) {
		String fieldName = getSelectorOfWebElement(driver, selected);
		try {
			HelperWebElement.waitUntilElementClickable(driver, selected);
			selected.clear();
			selected.sendKeys(ToBeTyped);
			System.out.println("Typed " + ToBeTyped + " in " + fieldName);
		} catch (StaleElementReferenceException stale) {
			HelperWebElement.waitUntilElementClickable(driver, selected);
			selected.clear();
			selected.sendKeys(ToBeTyped);
			System.out.println("Typed " + ToBeTyped + " in " + fieldName);
		} catch (NoSuchElementException nosuch) {
			HelperWebElement.waitUntilElementClickable(driver, selected);
			selected.clear();
			selected.sendKeys(ToBeTyped);
			System.out.println("Typed " + ToBeTyped + " in " + fieldName);
		} catch (Exception exp) {
			Log.error("Was not able to type " + ToBeTyped + " in " + fieldName);
		}

	}
	
	public static String getSelectorOfWebElement(WebDriver driver, WebElement element) {
		String attribute = "";
		try {
			attribute = element.getAttribute("id");
			if (attribute.isEmpty()) {
				attribute = element.getAttribute("name");
			}
			if (attribute.isEmpty()) {
				attribute = element.getAttribute("xpath");
			}
			if (attribute.isEmpty()) {
				attribute = element.getAttribute("css");
			}

		} catch (Exception exception) {

		}
		return attribute;

	}
	
	
	public static void click(WebDriver driver, WebElement toclick) {
		String clickable = "";
		try {
			clickable = toclick.getAttribute("value");
			if (clickable == null || clickable.isEmpty()) {
				clickable = toclick.getAttribute("type");
			}
			if (clickable == null || clickable.isEmpty()) {
				clickable = toclick.getAttribute("id");
			}
			if (clickable == null || clickable.isEmpty()) {
				clickable = toclick.getAttribute("xpath");
			}
			HelperWebElement.waitUntilElementClickable(driver, toclick);
			toclick.click();
			System.out.println("Clicked on " + clickable);
		} catch (StaleElementReferenceException stale) {
			HelperWebElement.waitUntilElementClickable(driver, toclick);
			toclick.click();
			System.out.println("Clicked on " + clickable);
		} catch (NoSuchElementException nosuch) {
			HelperWebElement.waitUntilElementClickable(driver, toclick);
			toclick.click();
			System.out.println("Clicked on " + clickable);
		} catch (Exception exp) {
			Log.error("Was not able to click on " + clickable);
		}
	}
	
	public static void waitUntilElementClickable(WebDriver driver, WebElement selected) {

		WebDriverWait wait = new WebDriverWait(HelperConstant.getDriver(), HelperConstant.WAIT_30);
		try {
			wait.until(ExpectedConditions.visibilityOf(selected));
			wait.until(ExpectedConditions.elementToBeClickable(selected));
		} catch (Exception e) {
			try {
				wait.until(ExpectedConditions.visibilityOf(selected));
				wait.until(ExpectedConditions.elementToBeClickable(selected));
			} catch (Exception exp) {
				wait.until(ExpectedConditions.visibilityOf(selected));
				wait.until(ExpectedConditions.elementToBeClickable(selected));
			}
		}

	}
	
}
