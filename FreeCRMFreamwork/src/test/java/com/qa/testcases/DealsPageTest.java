package com.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.pages.DealsPage;
import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;
import com.qa.pages.MainPage;
import com.qa.util.TestUtil;

public class DealsPageTest extends TestBase {

	DealsPage dealspage;
	MainPage mainpage;
	LoginPage loginpage;
	HomePage homepage;
	String sheetname = "Deals";

	public DealsPageTest() {
		super();
	}
    @BeforeMethod
	public void setUp() {
		initialization();
		mainpage = new MainPage();
		loginpage = new LoginPage();
		homepage = new HomePage();
		loginpage = mainpage.ValidateLoginButton();
		homepage = loginpage.Login(prop.getProperty("username"), prop.getProperty("password"));
		dealspage = homepage.ClickOnDealsLink();

	}

	@Test
	public void VerifyTitleOfDealsPageTest() {
		Assert.assertTrue(dealspage.ValidateTitleOfDeals(),"Deals Title is not showing");
	}
	
	@Test
	public void ClickOnNewButtonTest() {
		dealspage.ClickOnNewBtn();
	}
	
	@DataProvider
	public Object[][] getCRMTestData() {
		Object data[][] = TestUtil.getTestData(sheetname);
		return data;
	}
	
	@Test(dataProvider="getCRMTestData")
	public void ValidateNewDealsTest(String title,String probability,String commission,String amount) {
		dealspage.ClickOnNewBtn();
		dealspage.CreateNewDeals(title, probability, commission, amount);
	}
    
	@AfterMethod
	public void tearDown() {
		driver.close();
	}
}
