Feature: Create the tracker

  Background: 
    Given I logged into Tiki and HomePage is displayed
    When we create tracker
    And under General fill up the Name "<name>"

  Scenario: Create the tracker with General & Features information
    And fill up Description "<description>"
    And click Features
    And select Allow Ratings & change Rating options "3,5,10"
    And select Allow Attachments and verify Creation date, Views, File size are selected
    Then save it and verify the Name
    And verify the Description

  Scenario: Create the tracker with General & Display information
    And click Display
    And enter in Logo "Typing Dead"
    And select Show Status and verify "Show status to tracker administrator only" is diplayed
    And in Default sort order select "Creation Date"
    Then save it and verify the Name

  Scenario: Create the tracker with General & Permissions information
    And click Permissions and under Creation date constraint selct the date using calendar
    And enter "09:15", "AM" in Time box
    Then save it and verify the Name
