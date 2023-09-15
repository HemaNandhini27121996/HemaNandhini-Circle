package stepdefinitions;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import helper.HelperConstant;
import pages.CircleHealthGroup;

public class CircleStepDefinition {

	public static WebDriver driver = HelperConstant.getDriver();
	CircleHealthGroup circle = new CircleHealthGroup(driver);

	@Given("I navigate to the Circle Health Group Website")
	public void i_navigate_to_the_circle_health_group_website() throws InterruptedException {
		circle.navigateToTreatments();
		circle.clickAcceptAllCookies();
		circle.bookOnline();
	}

	@When("I select my {string} and preferred date of leave")
	public void i_select_my_and_preferred_date_of_leave(String postcode) throws Exception {
		circle.enterPostCode(postcode);
		circle.clickShowMoreAppointments();
		circle.selectDate();
	}

	@Then("I am able to book consultants based on locations")
	public void i_am_able_to_book_consultants_based_on_locations() {
		circle.clickBookNow();
	}

	@And("I should see the consultant availability at the selected time")
	public void i_should_see_the_consultant_availability_at_the_selected_time() {
		String actual = circle.getTextFromOnlineBooking();
		assertEquals("Monday 2nd October 2023 at 08:50",actual );
	}

}
