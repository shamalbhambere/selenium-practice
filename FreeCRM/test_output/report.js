$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Login.feature");
formatter.feature({
  "line": 1,
  "name": "Free CRM Login Functionality",
  "description": "",
  "id": "free-crm-login-functionality",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Free CRM login test scenario",
  "description": "",
  "id": "free-crm-login-functionality;free-crm-login-test-scenario",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "user is already on login page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "verify title of login page is Free CRM",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "click on login button",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user enter username \u0026 password",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "user click on login button",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "user is on home page",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginstepDefination.user_is_already_on_login_page()"
});
formatter.result({
  "duration": 11589037600,
  "status": "passed"
});
formatter.match({
  "location": "LoginstepDefination.title_of_login_page_is_Free_CRM()"
});
formatter.result({
  "duration": 7814900,
  "status": "passed"
});
formatter.match({
  "location": "LoginstepDefination.click_on_login_button()"
});
formatter.result({
  "duration": 7494536000,
  "status": "passed"
});
formatter.match({
  "location": "LoginstepDefination.user_enter_username_password()"
});
formatter.result({
  "duration": 1400999500,
  "status": "passed"
});
formatter.match({
  "location": "LoginstepDefination.user_click_on_login_button()"
});
formatter.result({
  "duration": 105270700,
  "status": "passed"
});
formatter.match({
  "location": "LoginstepDefination.user_is_on_home_page()"
});
formatter.result({
  "duration": 885501700,
  "status": "passed"
});
formatter.uri("contacts.feature");
formatter.feature({
  "line": 1,
  "name": "Free CRM create contacts",
  "description": "",
  "id": "free-crm-create-contacts",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "user is able to create new contact",
  "description": "",
  "id": "free-crm-create-contacts;user-is-able-to-create-new-contact",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "user is login and verify title",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user is click on contacts",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "click on new button",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user enter first name \u0026 last name",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "click on save button",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "verify new contact is created",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({
  "location": "createContacts.user_is_click_on_contacts()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "createContacts.click_on_new_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "createContacts.user_enter_first_name_last_name()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "createContacts.click_on_save_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "createContacts.verify_new_contact_is_created()"
});
formatter.result({
  "status": "skipped"
});
});