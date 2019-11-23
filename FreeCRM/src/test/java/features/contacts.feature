#Scenario outline is data driven testing with Examples keyword

Feature: Free CRM create contacts

Scenario Outline: user is able to create new contact

Given user is logged in and verify title 
When user is click on contacts
And click on new button
Then user enter "<firstname>" and "<lastname>" and "<position>"
Then click on save button

 
 Examples:
    | firstname | lastname | position |
    | amit      | metkar   | Manager  |
    | Komal     | Bhambere | PO       |
