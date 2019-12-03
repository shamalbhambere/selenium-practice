package com.qa.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.pages.LoginPage;

public class LoginPageTest extends BaseTest{
	
	@Test(priority=1)
	public void verifyLoginPageTitleTest() {
		String title=page.getInstance(LoginPage.class).getLoginPageTitle();
		System.out.println("Login page title is "+title);
		Assert.assertEquals(title, "Cogmento CRM");
	}
	
	@Test(priority=2)
	public void validateLoginPageTest() {
		page.getInstance(LoginPage.class).doLogin("shamal.bhambere@gmail.com", "Audvik@05");	
	}

}
