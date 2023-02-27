Feature: login to ACTITIME

Scenario: login to ACTITIME as admin
Given user is login to ACTITIME
When user verify title of ACTITIME
Then user enters "<username>" and "<password>"
And user clicks on login button
Then user is on Homepage
And close the ACTITIME

Examples:
 |username| |password|
 |admin| |manager|
