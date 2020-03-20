package com.qa.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.testbase.BaseTest;

public class LoginPage extends BaseTest {
	
	@FindBy(linkText ="Log in")
	WebElement LoginBtn;

	@FindBy(xpath = "//*[@id='user_session_email']")
	WebElement Email;
	
	@FindBy(xpath = "//*[@id='user_session_password']")
	WebElement Password;
	
	@FindBy(xpath = "//*[@type='submit']")
	WebElement Submit;
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	public String getLoginPageTitle() {
		return driver.getTitle();
	}
	
	public HomePage login(String username, String password) throws InterruptedException {
		Thread.sleep(3000);
		LoginBtn.click();
		Email.sendKeys(username);
		Password.sendKeys(password);
		Submit.click();
		return new HomePage();

	}
}
