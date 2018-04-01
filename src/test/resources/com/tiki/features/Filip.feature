Feature: Blog and Tracker

  Background: 
    Given I logged into Tiki and Homepage is displayed

  Scenario: 
    When Cilck on the List Trackers under Trackers on the menu
    And  Create a Trackers
    And  Fill up the Name with"TypingDead"
    And  click on the Display
    And select Show creation date when listing items
    And click Date and Time Format Help
    Then "php" webpage should be displayed
   
   Scenario:
   When I click on Create Blog under Blog on the menu
   And I Fill up name with "TypingDead"
   And I select Filip Ratkovic under Creator
   And I click save button
   Then new blog Typing Dead should be displayed
   
   Scenario:
   When I click on Blog List under Blog on the menu
   And on TypingDead Blog on the rigt side i hoverover Wrench icon
   And i click on remove option
   And i click on Confirm Action button
   Then TypingDead Blog should be removed