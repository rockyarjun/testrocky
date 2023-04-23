Feature: Customer registration


Scenario Outline: Customer logging in into Protocommerce

Given User is on Protocommerce page
When User fills in details such as <username> and <email> and <password>
And User submits the application
Then A success message pops up

Examples:
|username|email|password|
|Mallu|malli@gmail.com|mallumalli|
|Madan|madan@gmail.com|madanmallu|
