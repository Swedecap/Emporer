#Author:Ben Bolaji
#Keywords Summary :

Feature: As a user i want to be able to logoff successfully upon selecting the logoff button

Scenario: Log out of the IFA portal
Given that the external customer is logged into the IFA portal
And Passed the security questions				
And selects Yes to the are you sure you want to logoff pop up box
When the user selects the logout button at the top of the page
Then the pop up box successfully closes off
	


