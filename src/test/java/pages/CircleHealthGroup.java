package pages;

import java.awt.Robot;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import helperwebelements.HelperWebElement;

public class CircleHealthGroup {

	WebDriver driver;

	public CircleHealthGroup(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	// WebElements
		@FindBy(name = "login")
		private static WebElement LOGIN_USERNAME;
		@FindBy(name = "loginPwd")
		private static WebElement LOGIN_PASSWORD;
		@FindBy(id = "next")
		private static WebElement LOGIN_NEXT;
		@FindBy(xpath ="//*[@id='save']")
		private static WebElement LOGIN_SAVE;
		@FindBy(xpath="//*[@id='treatment'")
		private static WebElement TREATMENTS;
		@FindBy(xpath="//*[@id=\'location\']")
		private static WebElement LOCATION;
		@FindBy(xpath="//*[@id='//*[@id=\'digital-doorway\']/div[2]/div/form/div/button")
		private static WebElement KNEE_REPLACEMENT_SURGERY;
		@FindBy(xpath="//a[text()='Search']")
		private static WebElement SEARCH_BUTTON;
		@FindBy(xpath="//*[text()='Accept all cookies']")
		private static WebElement ACCEPT_ALL_COOKIES;
		@FindBy(xpath="//a[text()='Book online']")
		private static WebElement BOOK_ONLINE;
		

		public void typeUserName(String userName) {

			HelperWebElement.type(driver, LOGIN_USERNAME, userName);
		}

		
		public void navigateToTreatments() throws InterruptedException {

			driver.navigate().to("https://www.circlehealthgroup.co.uk/treatments/knee-replacement-surgery");

		}
		public void clickAcceptAllCookies() throws InterruptedException {

			WebDriverWait wait = new WebDriverWait(driver, 10);
			WebElement element = wait.until(ExpectedConditions.elementToBeClickable(ACCEPT_ALL_COOKIES));
			HelperWebElement.click(driver, element);

		}
		
		public void bookOnline() throws InterruptedException {

			WebDriverWait wait = new WebDriverWait(driver, 10);
			WebElement element = wait.until(ExpectedConditions.elementToBeClickable(BOOK_ONLINE));
			HelperWebElement.click(driver, element);

		}

		public void enterPostCode(String Postcode) throws InterruptedException {
			WebDriverWait wait = new WebDriverWait(driver, 10);
			WebElement postCode = wait.until(ExpectedConditions.elementToBeClickable(LOCATION));
			HelperWebElement.type(driver, LOCATION, Postcode);
			Thread.sleep(1000);
			LOCATION.sendKeys(Keys.ENTER);
			WebElement search = wait.until(ExpectedConditions.elementToBeClickable(SEARCH_BUTTON));
			HelperWebElement.click(driver, search);
			
		}
		

		public void clickSave() throws Exception {
			
			HelperWebElement.click(driver, LOGIN_SAVE);
		}
}
