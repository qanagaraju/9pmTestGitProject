Feature: Amazon Login page

@Search
Scenario Outline: verify user login page

Given user start amazon page
When user click sign in link
When user insert "<userID>"
Then user click on continue


Examples:
|userID|
|tester1|
|tester2|
|tester3|
|tester4|
|tester5|


