package com.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.pages.LoginPage;
import com.qa.pages.MainPage;


public class LoginPageTest extends TestBase {

	LoginPage loginpage;
	MainPage mainpage;


	public LoginPageTest() {
		super();
	}

	@BeforeMethod
	public void setUp() {

		initialization();
		mainpage = new MainPage();
		loginpage=new LoginPage();
		loginpage=mainpage.ValidateLoginButton();
    }
	
	@Test
	public void CheckTitleOfLoginPageTest() {
		String loginTitle=loginpage.ValidateTitleOfLoginPage();
		Assert.assertEquals("Cogmento CRM", loginTitle);
		
	}
	
	@Test
	public void ClickOnLoginBtnTest() {
		loginpage.Login(prop.getProperty("username"),prop.getProperty("password"));	
		
	}
	
	
	

	
	
	@AfterMethod
	public void tearDown()
	{
		driver.close();
	}
}
