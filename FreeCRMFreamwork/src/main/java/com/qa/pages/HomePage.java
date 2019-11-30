package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.base.TestBase;

public class HomePage extends TestBase {
	
	@FindBy(xpath="//*[@id='top-header-menu']/div[3]/span[1]")
	WebElement userLable;
	
	@FindBy(xpath="//input[@placeholder='Search']")
	WebElement searchField;
	
	@FindBy(xpath="//*[@id='main-nav']/a[3]")
	WebElement contacts;
	
	@FindBy(xpath="//*[@id='main-nav']/a[5]")
	WebElement deals;
	
	public HomePage()
	{
		PageFactory.initElements(driver, this);
		
	}
	
	
	public String ValidateLable() {
		return userLable.getText();
	}
	
	public boolean ValidateSearchField() {
		return searchField.isEnabled();
		
	}
	
	public ContactsPage ClickOnContactsLink() {
		WebDriverWait wait=new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='main-nav']/a[3]")));		

		contacts.click();
		return new ContactsPage();
		
	}
	
	public DealsPage ClickOnDealsLink() {
		deals.click();
		return new DealsPage();
		
	}
}
