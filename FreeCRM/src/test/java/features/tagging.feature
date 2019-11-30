# using Tagging, we can sort the scenario

Feature: Free CRM using tagging

@Smoke
Scenario: Free CRM Login function
Given User click on login
When User Enter valid "shamal.bhambere@gmail.com" & "Audvik@05"
Then Verify title of home page
Then close browser

@Regression
Scenario Outline: Free CRM Search Function
Given User click on login
When User enter "<username>" and "<Password>"
Then Verify title of home page
Then User enter data in search text
Then verify data is showing
Then close browser

Examples:
| username | Password | 
|shamal.bhambere@gmail.com | Audvik@05  |

@Smoke @Regression
Scenario Outline: Free CRM Calendar Function
Given User click on login
When User enter "<username>" and "<Password>"
Then Verify title of home page
Then User click on calendar menu
Then User click new button
Then User enter "<Title>","<Location>" and "<Description>"
 Then User click on save button
 Then close browser
Examples:
| username |Password | Title | Location | Description |
|shamal.bhambere@gmail.com |  Audvik@05 | djfhw | hfvhfbsd | ffvhqgqfee  |
|shamal.bhambere@gmail.com |  Audvik@05 | hhsfhb| vghfvhwj | hfvhfvjbfwfew|

@Smoke
Scenario: Free CRM Contacts Function
 Given User click on login
When User enter username and Password
Then Verify title of home page
Then User click on contacts menu
Then User click new button
Then User enter firstname and lastname
| Shamal | Bhambere |
Then User click on save button
Then close browser

@Regression
Scenario: Free CRM Companies Function
 Given User click on login
When User enter username and Password
Then Verify title of home page
Then user click on companies menu
Then User click new button
Then User enter companies details
| Name | Description | Annual Revenue |
| ABC  | audvik   | 347545         |
Then User click on save button
Then close browser

@Smoke @Regression
Scenario: Free CRM Deals Function
 Given User click on login
When User enter username and Password
Then Verify title of home page
Then user click on deals menu
Then User enter data in deals fields
Then User click on save button
Then close browser

@End2End
Scenario: Free CRM Tasks Function
 Given User click on login
When User enter username and Password
Then Verify title of home page
Then user click on tasks menu
Then User click new button
Then User enter data in tasks fields
Then User click on save button
Then close browser

@Regression
Scenario: Free CRM Cases Function
 Given User click on login
When User enter username and Password
Then Verify title of home page
Then user click on cases menu
Then User click new button
Then User enter data in cases fields
Then User click on save button
Then close browser