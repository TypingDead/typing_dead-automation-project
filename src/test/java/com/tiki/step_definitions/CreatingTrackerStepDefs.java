package com.tiki.step_definitions;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import com.tiki.pages.HomePage;
import com.tiki.pages.LoginPage;
import com.tiki.pages.TrackerPage;
import com.tiki.utilities.BrowserUtils;
import com.tiki.utilities.ConfigurationReader;
import com.tiki.utilities.Driver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class CreatingTrackerStepDefs {

	LoginPage loginPage = new LoginPage();
	HomePage homePage = new HomePage();
	TrackerPage trackerPage = new TrackerPage();

	@Given("^a user logs into Tiki Application, HomePage is displayed$")
	public void a_user_logges_into_Tiki_Application_HomePage_is_displayed() throws InterruptedException {
		Driver.getInstance().get(ConfigurationReader.getProperty("url"));
		loginPage.login(ConfigurationReader.getProperty("username"), ConfigurationReader.getProperty("password"));
		loginPage.openMenuPage();
		assertEquals(Driver.getInstance().getTitle(), homePage.homePageTitle);
	}

	@Given("^a user creates tracker$")
	public void a_user_creates_tracker() {
		homePage.openTrackerList();
		trackerPage.createTracker.click();

	}

	@Given("^under General a user fills up the Name \"([^\"]*)\"$")
	public void under_General_a_user_fills_up_the_Name(String name) throws Exception {
		trackerPage.name.sendKeys(name);
	}

	@Given("^a user fills up Description \"([^\"]*)\"$")
	public void a_user_fills_up_Description(String description) {
		trackerPage.description.sendKeys(description);
	}

	@Given("^a user clicks Features$")
	public void a_user_clicks_Features() {
		trackerPage.features.click();
	}

	@Given("^a user selects Allow Ratings & changes Rating options \"([^\"]*)\"$")
	public void a_user_selects_Allow_Ratings_changes_Rating_options(String ratings) {
		trackerPage.selectAllowRatings();
		trackerPage.ratingOptions.sendKeys(ratings);
	}

	@Given("^a user selects Allow Attachments and verifies Creation date, Views, File size are selected$")
	public void a_user_selects_Allow_Attachments_and_verifies_Creation_date_Views_File_size_are_selected() {
		trackerPage.selectAllowAttachments();
		assertTrue(trackerPage.creationDateCheckBox.isSelected());
		assertTrue(trackerPage.viewsCheckBox.isSelected());
		assertTrue(trackerPage.fileSizeCheckBox.isSelected());
	}

	@Then("^a user saves it and verifies the Name is \"([^\"]*)\"$")
	public void a_user_saves_it_and_verifies_the_Name_is(String name) {
		trackerPage.save();
		assertEquals(trackerPage.trackerName.getText(), name);
	}

	@Then("^a user verifies the Description is \"([^\"]*)\"$")
	public void a_user_verifies_the_Description_is(String description) {
		assertEquals(trackerPage.trackerDescription.getText(), description);
	}

	@Given("^a user clicks Display$")
	public void a_user_clicks_Display() {
		trackerPage.display.click();
	}

	@Given("^a user enters in Logo \"([^\"]*)\"$")
	public void a_user_enters_in_Logo(String logo) {
		trackerPage.logo.sendKeys(logo);
	}

	@Given("^a user selects Show Status and verifies \"([^\"]*)\" is diplayed$")
	public void a_user_selects_Show_Status_and_verifies_is_diplayed(String showStatusAdminOnly) {
		trackerPage.selectShowStatus();
		assertEquals(trackerPage.showStatusAdminOnly.getText(), showStatusAdminOnly);
	}

	@Given("^in Default sort order a user selects \"([^\"]*)\"$")
	public void in_Default_sort_order_a_user_selects(String creationDate) {
		trackerPage.selectDefaultOrderKey(creationDate);
	}

	@Given("^a user clicks Permissions and under Creation date constraint selects the date$")
	public void a_user_clicks_Permissions_and_under_Creation_date_constraint_selects_the_date() {
		trackerPage.permissions.click();
		// sending the today`s date to Date box
		LocalDate date = LocalDate.now();
		DateTimeFormatter formatters = DateTimeFormatter.ofPattern("MM/dd/yyyy");
		String todaysDate = date.format(formatters);
		trackerPage.startDate.sendKeys(todaysDate);

	}

	@Given("^a user enters \"([^\"]*)\", \"([^\"]*)\" in Time box$")
	public void a_user_enters_in_Time_box(String hours, String am) {
		trackerPage.startTime.sendKeys(hours +" "+ am);
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
