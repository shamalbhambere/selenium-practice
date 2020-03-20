package com.qa.test;

import java.util.Properties;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.page.LoginPage;

import com.qa.testbase.BaseTest;

import junit.framework.Assert;

public class LoginPageTest extends BaseTest {

	LoginPage loginpage;
	
	public LoginPageTest() {
		super();

	}

	@BeforeMethod
	public void setUp() {
		initialization();
		loginpage = new LoginPage();
	}

	@Test
	public void validateLoginPageTitleTest() {
		String title = loginpage.getLoginPageTitle();
		System.out.println(title);
		Assert.assertEquals("Log in :: Splitwise", title);
	}
	
	@Test
	public void verifyLoginButtonTest() throws InterruptedException {
		Thread.sleep(3000);
		loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
			
	}
	
	@AfterMethod
	public void TearDown() {
		driver.close();
	}
}
