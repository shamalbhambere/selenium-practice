package com.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;
import com.qa.pages.MainPage;

public class HomePageTest extends TestBase {
	LoginPage loginpage;
	HomePage homepage;
	MainPage mainpage;

	public HomePageTest() {
		super();
	}

	@BeforeMethod
	public void setUp() {

		initialization();
		mainpage=new MainPage();
		loginpage = new LoginPage();
        loginpage=mainpage.ValidateLoginButton();
		homepage = new HomePage();
		homepage = loginpage.Login(prop.getProperty("username"), prop.getProperty("password"));

	}

	@Test
	public void CheckUsernameLableTest() {
		String lable = homepage.ValidateLable();
		Assert.assertEquals(lable, "Shamal Bhambere");
	}

	@Test
	public void CheckSearchFieldTest() {
		Assert.assertTrue(homepage.ValidateSearchField(), "Search field is disable");
	}
	
	@Test
	public void ClickOnContactsTest() {
		homepage.ClickOnContactsLink();
	}
	
	@Test
	public void ClickOnDeatsTest() {
		homepage.ClickOnDealsLink();
	}

	@AfterMethod
	public void teatDown() {
		driver.close();
	}
}
