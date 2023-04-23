Feature: Customer1 registration


Scenario Outline: Customer1 logging in into Protocommerce

Given User is on Protocommerce page
When User fills in details such as <username> and <email> and <password>
And User submits the application
Then A success message pops up

Examples:
|username|email|password|
|guru|malli@gmail.com|mallumalli|
|pankaj|madan@gmail.com|madanmallu|
