package com.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.pages.ContactsPage;
import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;
import com.qa.pages.MainPage;
import com.qa.util.TestUtil;

public class ContactsPageTest extends TestBase {
	MainPage mainpage;
	LoginPage loginpage;
	HomePage homepage;
	ContactsPage contactspage;
	String sheetname = "Contacts";

	public ContactsPageTest() {
		super();

	}

	@BeforeMethod
	public void setUp() {
		initialization();
		mainpage = new MainPage();
		loginpage = new LoginPage();
		loginpage = mainpage.ValidateLoginButton();
		homepage = new HomePage();
		homepage = loginpage.Login(prop.getProperty("username"), prop.getProperty("password"));

		contactspage = homepage.ClickOnContactsLink();
	}

	@Test
	public void VerifyContactsPageLableTest() {
		Assert.assertTrue(contactspage.ValidateContactsTitleLable(), "Contact Title is not showing");
	}

	@Test
	public void ClickOnContactNewBtnTest() {
		contactspage.ClickOnNewButton();
	}

	@DataProvider
	public Object[][] getCRMTestData() {
		Object data[][] = TestUtil.getTestData(sheetname);
		return data;
	}

	@Test(dataProvider = "getCRMTestData")
	public void ValidateNewContactTest(String ftname, String ltname,String compy) {
		contactspage.ClickOnNewButton();
		contactspage.CreateNewContact(ftname, ltname, compy);
	}

	@AfterMethod
	public void tearDown() {
		driver.close();
	}
}
