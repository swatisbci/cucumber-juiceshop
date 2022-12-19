Feature: Register

Scenario Outline: Register by providing details
Given open browser and enter the URL.
When user click on account link and click on login
And click on not yet a customer
And enters "<email>", "<password>", "<repeatPassword>", "<securityQuestion>", "<Answer>"
And click on Register
Then user should be able to see login screen

Examples:

| email | password | repeatPassword | securityQuestion | Answer|
| kp@gmail.com |abcde    | abcde    |  Maternal grandmother's first name?  | kavita |

