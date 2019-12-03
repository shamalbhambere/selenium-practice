package com.qa.tests;


import org.testng.annotations.Test;

import com.qa.pages.ContactPage;
import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;

public class ContactsPageTest extends BaseTest {

	@Test
	public void ValidateContactPageHeaderTest() throws InterruptedException {
		HomePage homepage = page.getInstance(LoginPage.class).doLogin("shamal.bhambere@gmail.com", "Audvik@05");
		Thread.sleep(7000);
		ContactPage contactpage = homepage.getContactsPage();
		contactpage.getContactPageHeader();
	}

	@Test
	public void ClickOnNewButtonTest() throws InterruptedException {
		page.getInstance(LoginPage.class).doLogin("shamal.bhambere@gmail.com", "Audvik@05");
		Thread.sleep(7000);
		ContactPage contactpage = page.getInstance(HomePage.class).getContactsPage();
		contactpage.clickOnNewButton();
	}

	@Test
	public void EnterContactDetailsTest() throws InterruptedException {
		HomePage homepage = page.getInstance(LoginPage.class).doLogin("shamal.bhambere@gmail.com", "Audvik@05");
		Thread.sleep(6000);
		ContactPage contactpage = homepage.getContactsPage();
		contactpage.clickOnNewButton();
		contactpage.createContacts();

	}

}
