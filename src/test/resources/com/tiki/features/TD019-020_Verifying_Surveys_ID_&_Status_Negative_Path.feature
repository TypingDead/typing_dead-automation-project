Feature:

 Background: 
    Given a user logges into Tiki Application, HomePage is displayed
    And a user opens Surveys 

Scenario: Survey status is not closed
	And a user creates new survey, enters "TypingDead" in Name box and changes Status to closed
	And a user saves it
	And a user verifies the name and status is closed
	When a user Edits "TypingDead" survey and changes the status to open
	And a user saves it
	And a user verifies the name and status is not closed
	
	
	Scenario: Survey ID is not used twice
	And a user saves the ID of "TypingDead" survey and removes it
	And a user creates new survey, enters "TypingDead" in Name box and changes Status to closed
	And a user saves it
	And verifies that ID is not as it was before removing it
