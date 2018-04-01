Feature: Create new Article

 Background: 
    Given a user logged into Tiki Application, HomePage is displayed
    Then We create New Article
    
    
	Scenario: Create new Article with content 
	Then Select the Content and fill the Title field "My new Article"
		And Fill the Heading and Body fields
		And Select Allow full HTML checkbox
		Then Save it
		And Verify what Title, Heading and Body text is visible
		
		Scenario: Create new Article with Publication
		Then Select the Content and fill the Title field "My second Article"
			Then Select the Publication and put authorName "Jimmy Johns" and userName "Mark Smith"
			Then Select in Publish Date "June 11 2017"
			And Select in Expiration Date "April 30 2018"
			Then Verify Published checkbox is selected
			 Then Save it
			 Then Verify what "My second Article" and "Jimmy Johns" and "2017-06-11" is displayed
			 
			Scenario: Delete Articles
				Then We open List Articles and Find "My new Article"
				And Hover over setting sign 
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
			 