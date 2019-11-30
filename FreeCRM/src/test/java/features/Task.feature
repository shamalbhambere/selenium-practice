#data table with map for parameterization

Feature: Free CRM create new task functionality

Scenario: Free CRM task test scenario

Given user logged in to the application
| username | password |
|shamal.bhambere@gmail.com | Audvik@05 |
When verify the title of home page is Cogmento CRM
And user click on task menu
Then user click on new button of task
Then user enter all the details 
| title | completion | 
| abc   | pqr        | 
| mno   | stu        | 




