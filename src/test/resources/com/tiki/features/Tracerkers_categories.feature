Feature: Create Categories

  Background: 
    Given I logged into Tiki and Homepage is displayed

  Scenario: 
    When Cilck on the List Trackers under Trackers on the menu
    And  Create a Trackers
    And  Fill up the Name with"TypingDead"
    And  click on the Categories
    Then click on the Categories with gear mark

  Scenario: 
    When Find the Add new category select parrent with week1
    And Fill up the Name with"Features"
    And Full up the Description with "Features are created by TypingDead"
    And click on the save

  Scenario: 
    When click on the Categories on the menu
    And  click on the Features under Week1
    And  The topic TYPING DEAD should be displayedd
    And  The Name"Category:Features" should be displayed
    Then The Description "Features are created by TypingDead." should be displayed
