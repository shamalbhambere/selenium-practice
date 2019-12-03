package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends BasePage {

	// locator

	By contacts = By.xpath("//*[@id='main-nav']/a[3]/span");

	public HomePage(WebDriver driver) {
		super(driver);
	}

	// action

	public WebElement getContacts() {
		return getElement(contacts);
	}

	public String getHomePageTitle() {
		return getPageTitle();
	}

	public ContactPage getContactsPage(){
		waitForElementPresent(contacts);
		driver.findElement(contacts).click();
 
		return getInstance(ContactPage.class);
	}

}
