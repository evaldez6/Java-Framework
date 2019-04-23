Feature: Gmail Automation Practice
	Practice different scenarios while using Gmail
	
Scenario: Send an email and tag a created label
	User logs in to gmail
	User sends an email with one image attachment
	User verifies email body is the same that was sent
	User creates a label and tags sent message
	User nagigates to all existing lables

	Given User navigates to gmail website
	And User inputs username and password
	Then User should be taken to gmail successful login page
	
	Given User creates a new message
	Then User should see a new pop-up window
	When User fills in message
	And User adds image
	And User clicks send
	Then The message should be sent
	
	Given User sent message
	And User reads message
	Then body message is the same that was sent
	
	Given User read message
	When User creates a label
	And User tags label to message
	Then The message should be tagged by created label
	
	Given User created a label
	Then User checks all existing labels