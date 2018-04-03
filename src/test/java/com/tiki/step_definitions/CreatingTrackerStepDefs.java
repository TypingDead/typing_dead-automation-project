package com.tiki.step_definitions;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.JavascriptExecutor;

import com.tiki.pages.HomePage;
import com.tiki.utilities.BrowserUtils;
import com.tiki.utilities.ConfigurationReader;
import com.tiki.utilities.Driver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class CreatingTrackerStepDefs {

	HomePage homePage = new HomePage();

	@Given("^a user logges into Tiki Application, HomePage is displayed$")
	public void a_user_logges_into_Tiki_Application_HomePage_is_displayed() throws InterruptedException {
		Driver.getInstance().get(ConfigurationReader.getProperty("url"));
		homePage.login(ConfigurationReader.getProperty("username"), ConfigurationReader.getProperty("password"));	
	}

	@Given("^a user creates tracker$")
	public void a_user_creates_tracker() {

	}

	@Given("^under General a user fills up the Name \"([^\"]*)\"$")
	public void under_General_a_user_fills_up_the_Name(String arg1) {

	}

	@Given("^a user fills up Description \"([^\"]*)\"$")
	public void a_user_fills_up_Description(String arg1) {

	}

	@Given("^a user clicks Features$")
	public void a_user_clicks_Features() {

	}

	@Given("^a user selects Allow Ratings & changes Rating options \"([^\"]*)\"$")
	public void a_user_selects_Allow_Ratings_changes_Rating_options(String arg1) {

	}

	@Given("^a user selects Allow Attachments and verifies Creation date, Views, File size are selected$")
	public void a_user_selects_Allow_Attachments_and_verifies_Creation_date_Views_File_size_are_selected() {

	}

	@Then("^a user saves it and verifies the Name$")
	public void a_user_saves_it_and_verifies_the_Name() {

	}

	@Then("^a user verifies the Description$")
	public void a_user_verifies_the_Description() {

	}

	@Given("^a user clicks Display$")
	public void a_user_clicks_Display() {

	}

	@Given("^a user enters in Logo \"([^\"]*)\"$")
	public void a_user_enters_in_Logo(String arg1) {

	}

	@Given("^a user selects Show Status and verifies \"([^\"]*)\" is diplayed$")
	public void a_user_selects_Show_Status_and_verifies_is_diplayed(String arg1) {

	}

	@Given("^in Default sort order a user selects \"([^\"]*)\"$")
	public void in_Default_sort_order_a_user_selects(String arg1) {

	}

	@Given("^a user clicks Permissions and under Creation date constraint selects the date using calendar$")
	public void a_user_clicks_Permissions_and_under_Creation_date_constraint_selects_the_date_using_calendar() {

	}

	@Given("^a user enters \"([^\"]*)\", \"([^\"]*)\" in Time box$")
	public void a_user_enters_in_Time_box(String arg1, String arg2) {

	}

	@Given("^a user clicks on the Display and selects Show creation date when listing items$")
	public void a_user_clicks_on_the_Display_and_selects_Show_creation_date_when_listing_items() {

	}

	@Given("^a user clicks Date and Time Format Help and verifies the title is \"([^\"]*)\"$")
	public void a_user_clicks_Date_and_Time_Format_Help_and_verifies_the_title_is(String arg1) {

	}

	@Then("^a user scrolls down and clicks add a note and verifies the title is \"([^\"]*)\"$")
	public void a_user_scrolls_down_and_clicks_add_a_note_and_verifies_the_title_is(String arg1) {

	}
}
