package pages;

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
	@FindBy(xpath = "//*[@id='treatment'")
	private static WebElement TREATMENTS;
	@FindBy(xpath = "//*[@id=\'location\']")
	private static WebElement LOCATION;
	@FindBy(xpath = "//*[text()='Search']")
	private static WebElement SEARCH_BUTTON;
	@FindBy(xpath = "//*[text()='Accept all cookies']")
	private static WebElement ACCEPT_ALL_COOKIES;
	@FindBy(xpath = "//a[text()='Book online']")
	private static WebElement BOOK_ONLINE;
	@FindBy(xpath = "//*[text()='Show more appointments']")
	private static WebElement SHOW_MORE_APPOINTMENTS;
	@FindBy(xpath = "//*[@id=\'datepicker\']/div[1]/div/div[2]/div[1]/div[2]/div[2]/div[15]/span")
	private static WebElement SELECT_DATE;
	@FindBy(xpath = "//*[@id=\'digital-doorway\']/div[3]/div/div/div/div[2]/div[2]/ul/li[1]/div/div[3]/div[2]/a[1]/span[2]")
	private static WebElement BOOK_NOW;
	@FindBy(xpath = "//*[@id=\'online-booking\']/div[3]/div[1]/div[2]/p[2]")
	private static WebElement ONLINE_BOOKING;

	public void navigateToTreatments()  {
		driver.navigate().to("https://www.circlehealthgroup.co.uk/treatments/knee-replacement-surgery");
		driver.manage().deleteAllCookies();

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
		HelperWebElement.type(driver, LOCATION, Postcode);
		WebDriverWait wait = new WebDriverWait(driver, 30);
		WebElement location = wait.until(ExpectedConditions.elementToBeClickable(LOCATION));
		location.sendKeys(Keys.ENTER);
		location.sendKeys(Keys.ENTER);
		HelperWebElement.click(driver, SEARCH_BUTTON);

	}

	public void clickShowMoreAppointments() {

		HelperWebElement.click(driver, SHOW_MORE_APPOINTMENTS);

	}

	public void selectDate() {
		HelperWebElement.click(driver, SELECT_DATE);
	}

	public void clickBookNow() {
		HelperWebElement.click(driver, BOOK_NOW);
	}

	public String getTextFromOnlineBooking() {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement onlineBooking = wait.until(ExpectedConditions.elementToBeClickable(ONLINE_BOOKING));
		String text = onlineBooking.getText();
		System.out.println(text);
		return text;
	}
}
