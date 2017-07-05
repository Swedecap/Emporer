#Author: your.email@your.domain.com

@tag
Feature: As A user i want to be able to search for my vehicle details on the DVSA website

Scenario: Vehicle Search On the DVSA Website
Given that i have successfully navigated to the www.gov.uk/get-driver-dvla-car-details website.
And I input the vehicle registration details in the required field
And i input the make and model of the vehicle detail in the other required field
When i select the next button
Then the vehicle results screen successfully appears.