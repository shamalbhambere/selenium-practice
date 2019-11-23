Feature: Free CRM Login Functionality

Scenario: Free CRM login test scenario

Given user is already on logged in
When  verify title of login page is Free CRM
And  click on login button
Then user enter username & password
Then user click on login button
Then user is on home page

