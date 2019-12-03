package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ContactPage extends BasePage {

	public ContactPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

		
	By header1=By.xpath("//*[@id='dashboard-toolbar']/div");
	By newbtn=By.xpath("//*[@id='dashboard-toolbar']/div[2]/div/a/button");
	By fn=By.name("first_name");
	By ln=By.name("last_name");
	By save=By.xpath("//*[@id='dashboard-toolbar']/div[2]/div/button[2]");
	
	public String getContactHeader() {
		return getPageHeader(header1);
	}
	
	public WebElement getNewButton() {
		return getElement(newbtn);
	}
	
	public WebElement getFirstName() {
		return getElement(fn);
	}
	public WebElement getLastName() {
		return getElement(ln);
	}
	public WebElement getSaveButton() {
		return getElement(save);
	}
	
	public void getContactPageTitle() {
		getPageTitle();
	}
	
	public void getContactPageHeader() {
		getContactHeader();
	}
	
	public void clickOnNewButton() {
		getNewButton().click();
	}
	
	public void createContacts() {
		getFirstName().sendKeys("shamal");
		getLastName().sendKeys("Bhambere");
		getSaveButton().click();
	}
}

