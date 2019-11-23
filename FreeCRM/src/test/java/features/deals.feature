# Cucumber Data driven testing with Data Table

Feature: Free CRM deals functionality

Scenario: Free CRM deals test scenario

Given User click on log in
And user entered username and password
|  shamal.bhambere@gmail.com  |  Audvik@05  |
And user click on login button
When verify title of home is cogmento CRM
And user click on deals
Then user click on new button
Then user enter title, amount, probability and commission 
|  Test  |  2000  |  100  |  10  |
Then user click on save button 
