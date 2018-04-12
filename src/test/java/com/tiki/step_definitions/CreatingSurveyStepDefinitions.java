package com.tiki.step_definitions;

import com.tiki.pages.HomePage;
import com.tiki.pages.SurveyPage;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class CreatingSurveyStepDefinitions {
	HomePage homepage = new HomePage();
	SurveyPage surpage = new SurveyPage();
	
//=====================Backgroud=========================\\	
	
	@Given("^a user opens Surveys$")
	public void a_user_opens_Surveys() {
	  
	}
//=====================Scenario: Survey status is not closed=========================\\	
		

	@Given("^a user creates new survey, enters \"([^\"]*)\" in Name box and changes Status to closed$")
	public void a_user_creates_new_survey_enters_in_Name_box_and_changes_Status_to_closed(String arg1) {
	  
	}

	@Given("^a user saves it survey$")
	public void a_user_saves_it_survey() {
	 
	}

	@Given("^a user verifies the name and status is closed$")
	public void a_user_verifies_the_name_and_status_is_closed() {
	    
	}

	@When("^a user Edits \"([^\"]*)\" survey and changes the status to open$")
	public void a_user_Edits_survey_and_changes_the_status_to_open(String arg1) {
	 
	}



	@When("^a user verifies the name and status is open$")
	public void a_user_verifies_the_name_and_status_is_open() {
	  
	}
	
//============================Scenario: Survey ID is not used twice===========\\


	@Given("^a user saves the ID of \"([^\"]*)\" survey and removes it$")
	public void a_user_saves_the_ID_of_survey_and_removes_it(String arg1) {
	   
	}

	@Given("^verifies that ID is not as it was before removing it$")
	public void verifies_that_ID_is_not_as_it_was_before_removing_it() {
	  
	}


	
}
