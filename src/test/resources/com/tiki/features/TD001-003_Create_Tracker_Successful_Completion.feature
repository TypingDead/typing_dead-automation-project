Feature: Create the tracker

  Background: 
    Given a user logges into Tiki Application, HomePage is displayed
    And a user creates tracker
    And under General a user fills up the Name "<name>"

  Scenario: Create the tracker with General & Features information
    And a user fills up Description "<description>"
    And a user clicks Features
    And a user selects Allow Ratings & changes Rating options "3,5,10"
    And a user selects Allow Attachments and verifies Creation date, Views, File size are selected
    Then a user saves it and verifies the Name
    And a user verifies the Description

  Scenario: Create the tracker with General & Display information
    And a user clicks Display
    And a user enters in Logo "Typing Dead"
    And a user selects Show Status and verifies "Show status to tracker administrator only" is diplayed
    And in Default sort order a user selects "Creation Date"
    Then a user saves it and verifies the Name

  Scenario: Create the tracker with General & Permissions information
    And a user clicks Permissions and under Creation date constraint selects the date using calendar
    And a user enters "09:15", "AM" in Time box
    Then a user saves it and verifies the Name
