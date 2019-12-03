package com.qa.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;

public class HomePageTest extends BaseTest{

	
	@Test(priority=1)
	public void verifyHomePageTitleTest() {
		page.getInstance(LoginPage.class).doLogin("shamal.bhambere@gmail.com", "Audvik@05");
		String title=page.getInstance(HomePage.class).getHomePageTitle();
		Assert.assertEquals(title, "Cogmento CRM");
		}
	
	@Test(priority=2)
	public void clickOnContactButtonTest(){
	   HomePage homepage= page.getInstance(LoginPage.class).doLogin("shamal.bhambere@gmail.com", "Audvik@05");
       homepage.getContactsPage();   
	}
	
}
