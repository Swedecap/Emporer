#Author: yinkab@hotmail.com
#Keywords Summary :
Feature: As a user I want to be able to search for my vehicle details on the DVLA website

@DriverVerification
Scenario Outline: Vehicle Search On The DVLA Website
Given that i have successfully navigated to the following url "https://www.gov.uk/get/vehicle-information-from-dvla and selected the start button
When i enter the <Registration number> in the registration number field.
And i submit the form
Then i am presented with a results page.
And the correct <Make> and <Colour> is displayed on the result page.

Examples:
|Registartion Number|Make           |Colour  |
|"FT64 CDK"         |"Mercedes Benz"|"White" |