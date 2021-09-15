package com.qa.test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.page.HomePage;
import com.qa.testbase.BaseTest;

import junit.framework.Assert;

public class HomePageTest extends BaseTest  {
	

HomePage homepage;
	
	public HomePageTest() {
		super();

	}

	@BeforeMethod
	public void setUp() throws InterruptedException {

		initialization();
		homepage = new HomePage();
	}
	
	@Test
	public void validateHomePageTitleTest() {
		String title = homepage.getHomePageTitle();
	    System.out.println(title);
	    Assert.assertEquals("Splitwise", title);
	}
	
	@Test 
	public void createGroupTest() {
		homepage.createGroup();
	}
	
	@Test
	public void splitExpense() {
//		homepage.createGroup();
		//homepage.addFriends();
		homepage.addExpense();
	}
	
	@AfterMethod
	public void TearDown() {
		//driver.close();
	}
}
