package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.TestBase;

public class MainPage extends TestBase {
    
    @FindBy(xpath="/html/body/div[1]/header/div/nav/div[2]/div/div[2]/ul/a")
    WebElement Login;

    @FindBy(xpath="//a[contains(text(),'Sign Up')]")
    WebElement Signup;

    @FindBy(xpath="//a[@href='https://freecrm.com']")
    WebElement Logo;
    
    public MainPage() {
    	PageFactory.initElements(driver, this);
    }

    public LoginPage ValidateLoginButton(){
        Login.click();
        return new LoginPage();
    }
 
    public String ValidateTitleOfMainPage() {
    	return driver.getTitle();
    }
}