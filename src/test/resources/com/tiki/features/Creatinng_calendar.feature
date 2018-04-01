
Feature: Creating a new new calendar

  Background: 
    Given a user logged into Tiki Application, HomePage is displayed
    And   a user choosed Calendar 

 
  Scenario: create a new calendar 
    When user select the Add Even  
    And  user select Admin Calendars and Create Calendar
   	And  in the name box user enters "Tying Dead Event"
   	And  in the Description enter "This event start now"
   	Then User Select Start of day 7 and End of Day 23
   	And  a user select standard color purple
   	And  user clicks Save 
   	Then user Verify the name "Typing Dead Event"

   Scenario: create a new event
   When user select the Add Even 
   And  user choose Calendar they created earler "Typing Dead Even"
   And  user enter the Title "Our Scrum meeting Starts now"
   And  user select Recurrence box
   And  verify defualt selection is On a weekly basis and Select Monday
   And  user choose Start period as today date and End Before add five days
   Then user enter on Description "Finally this event is happening."
   And  user clicks Save
   And  user verify the event on calendar they created "Our Scrum meeting Starts now" 
   
   Scenario: delete the even usr created
   When user select the Add Even 
   And  user select Admin Calendars
   When user hover over the Action tool on the calendar user created before which is "Tying Dead Event"
   Then Actions will be displayed 
   And  user select the Delete and select Confirm action
   And  Verify that calandar you created earler is not visible
   
   
   
   
    
