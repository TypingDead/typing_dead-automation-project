package com.tiki.step_definitions;

import com.tiki.pages.HomePage;
import com.tiki.utilities.ConfigurationReader;
import com.tiki.utilities.Driver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Creating_Event_In_Calendar_Successful {
	
	HomePage homePage = new HomePage();
	
	

	@Given("^a user opens Calendar$")
	public void a_user_opens_Calendar() {
	   
	}

	@When("^a user selects the Add Event$")
	public void a_user_selects_the_Add_Event() {
	    
	}

	@When("^a user selects Admin Calendars, clicks the Create Calendar link$")
	public void a_user_selects_Admin_Calendars_clicks_the_Create_Calendar_link() {
	
	}

	@When("^in the name box a user enters \"([^\"]*)\"and in the Description a user enters \"([^\"]*)\"$")
	public void in_the_name_box_a_user_enters_and_in_the_Description_a_user_enters(String arg1, String arg2) {

	}

	@Then("^a user selects Start of day (\\d+) and End of Day (\\d+) and selects Standard color \"([^\"]*)\"$")
	public void a_user_selects_Start_of_day_and_End_of_Day_and_selects_Standard_color(int arg1, int arg2, String arg3) {
	  
	}

	@Then("^a user clicks Save$")
	public void a_user_clicks_Save() {
	
	}

	@Then("^a user verifies the name of the event \"([^\"]*)\"$")
	public void a_user_verifies_the_name_of_the_event(String arg1) {
	  
	}

	@When("^a user chooses in Calendar \"([^\"]*)\"and a user enters the Title \"([^\"]*)\"$")
	public void a_user_chooses_in_Calendar_and_a_user_enters_the_Title(String arg1, String arg2) {
	
	}

	@When("^a user selects Recurrence box and verifies On a weekly basis is selected, and sets Monday$")
	public void a_user_selects_Recurrence_box_and_verifies_On_a_weekly_basis_is_selected_and_sets_Monday() {
	   
	}

	@When("^a user chooses in Start period todays date and in End Before add (\\d+) days #think$")
	public void a_user_chooses_in_Start_period_todays_date_and_in_End_Before_add_days_think(int arg1) {
	
	}

	@Then("^a user enters in Description \"([^\"]*)\" and saves it$")
	public void a_user_enters_in_Description_and_saves_it(String arg1) {
	   
	}

	@Then("^a user verifies the event on calendar they created \"([^\"]*)\"$")
	public void a_user_verifies_the_event_on_calendar_they_created(String arg1) {
	   ;
	}

	@When("^a user selects Admin Calendars$")
	public void a_user_selects_Admin_Calendars() {
	  
	}

	@When("^a user hovers over Action for \"([^\"]*)\" and Deletes it$")
	public void a_user_hovers_over_Action_for_and_Deletes_it(String arg1) {

	}

	@When("^a user verifies that calendar \"([^\"]*)\" is not visible$")
	public void a_user_verifies_that_calendar_is_not_visible(String arg1) {
	    
	}


}
