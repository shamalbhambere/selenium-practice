package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.TestBase;

public class LoginPage extends TestBase {
	

	@FindBy(name = "email")
	WebElement UsernameField;

	@FindBy(name = "password")
	WebElement PasswordField;

	@FindBy(xpath = "//*[@class='ui fluid large blue submit button']")
	WebElement Loginbtn;

	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	public String ValidateTitleOfLoginPage() {
		return driver.getTitle();
	}

	public HomePage Login(String username,String password) {
		UsernameField.sendKeys(username);
		PasswordField.sendKeys(password);
		Loginbtn.click();
		return new HomePage();
		
	}
}