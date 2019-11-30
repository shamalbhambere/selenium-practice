package com.qa.pages;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.TestBase;

public class ContactsPage extends TestBase{
	
	
	@FindBy(xpath="//*[@id='dashboard-toolbar']/div")
	WebElement contactsLable;
	
	@FindBy(xpath="//*[@id='dashboard-toolbar']/div[2]/div/a/button")
    WebElement newBtn;
	
	@FindBy(name="first_name")
	WebElement firstname;
	
	@FindBy(name="last_name")
	WebElement lastname;
	
    @FindBy(xpath="//input[@class='search']")
	WebElement company;
	
	@FindBy(xpath="//*[@id='dashboard-toolbar']/div[2]/div/button")
	WebElement saveBtn;
	
	public ContactsPage() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean ValidateContactsTitleLable() {
		return contactsLable.isDisplayed();
	}
	
	public void ClickOnNewButton()
	{   
	    newBtn.click();
	
	}
	public void CreateNewContact(String fn,String ln,String cn) {
		firstname.sendKeys(fn);
		lastname.sendKeys(ln);
		company.sendKeys(cn);
		saveBtn.click();
		
	}
	
}