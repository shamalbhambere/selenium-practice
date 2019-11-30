package com.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.pages.MainPage;


public class MainPageTest extends TestBase {
	MainPage mainpage;
	public MainPageTest() {
		super();
		
	}
	
	
	@BeforeMethod
	public void setUp() {
		initialization();
		mainpage=new MainPage();		
	}
	
	@Test
	public void CheckTitleOfMainPageTest() {
		String title=mainpage.ValidateTitleOfMainPage();
		Assert.assertEquals("Free CRM #1 cloud software for any business large or small", title);
	}

	@Test
	public void VerifyLoginButtonTest() {
		mainpage.ValidateLoginButton();
	}
	
	
	
	@AfterMethod
	public void TearDown() {
		driver.close();
	}
}
