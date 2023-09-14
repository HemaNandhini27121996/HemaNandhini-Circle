package stepdefinitions;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import helper.HelperConstant;
import pages.CircleHealthGroup;

public class CircleStepDefinition {
	
	public static WebDriver driver = HelperConstant.getDriver();
	CircleHealthGroup circle = new CircleHealthGroup(driver);
	
	
	@Given("I am a patient wanting a knee replacement")
	public void i_am_a_patient_wanting_a_knee_replacement() throws InterruptedException {
	    circle.navigateToTreatments();
	    circle.clickAcceptAllCookies();
	    circle.bookOnline();
	}

	@When("I put in my {string} and date of leave {int}th May")
	public void i_put_in_my_and_date_of_leave_th_May(String Postcode, Integer int1) throws InterruptedException {
	    circle.enterPostCode(Postcode);
	}

	@Then("I can get a consultants* availability and location provided to make my decision")
	public void i_can_get_a_consultants_availability_and_location_provided_to_make_my_decision() throws Exception {
	    circle.clickShowMoreAppointments();
	    circle.getTextFromOnlineBooking();
	}


}
