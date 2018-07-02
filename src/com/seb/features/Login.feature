Feature: Free CRM Login Feature

#Without examples keyword
Scenario Outline: Free CRM Login Test Scenario

Given User is already on Login Page
When Title of Login Page is Free CRM
Then User enters "<username>" and "<password>"
Then user clicks on login button
Then user is on Home Page
Then Close the browser

Examples:
	| username | password |
	| naveenk  | test@123 |
	| tom      | test456  |


#With examples keyword
#Scenario: Free CRM Login Test Scenario
#
#Given User is already on Login Page
#When Title of Login Page is Free CRM
#Then User enters "naveenk" and "test@123"
#Then user clicks on login button
#Then user is on Home Page