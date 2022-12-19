Feature: Login

Scenario Outline:
: login with valid credientials
When user enters "<email>", "<password>"
And click on log button
Then user should be able to see home page

Examples:

|email|password|
|kp@g   |abcde|