package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends BasePage {

	public LoginPage(WebDriver driver) {
		super(driver);
	}
	
	By username=By.name("email");
	By password=By.name("password");
	By loginbutton=By.xpath("//*[@id='ui']/div/div/form/div/div[3]");
	
	
	public WebElement getUsername() {
        return getElement(username);
	}
	public WebElement getPassword() {
		 return getElement(password);
	}
	
	public WebElement getLoginButton() {
		 return getElement(loginbutton);
	}

	public String getLoginPageTitle() {
		return getPageTitle();
	}
	
	public HomePage doLogin(String un,String pwd) {
		getUsername().sendKeys(un);
        getPassword().sendKeys(pwd);
        getLoginButton().click();
        
        return getInstance(HomePage.class);
	}
	

}
