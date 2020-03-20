package com.qa.page;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.testbase.BaseTest;

public class HomePage extends BaseTest {
	
	@FindBy(linkText = "Skip setup for now")
	WebElement SkipPage;
	
	//@FindBy(xpath = "//a[@href ='#invite_friends']")
	@FindBy(xpath = "//input[@id='group_memberships_attributes_2_user_attributes_name']")
	WebElement AddFriendsEmail;
	
	@FindBy(xpath ="//a[@class ='btn btn-large btn-orange']")
	WebElement AddExpense;
	
	@FindBy(xpath ="//a[@href='/groups/new']")
	WebElement AddGroup;
	
	@FindBy(linkText = "Settle up")
	WebElement SettleUp;
	
	@FindBy(id = "group_name")
	WebElement GroupName;
	
	@FindBy(name = "commit")
	WebElement GroupSaveBtn;
	
	@FindBy(xpath ="//div[@id='select-group-group_group_type']")
	WebElement SelectDrop;
	
	@FindBy(xpath ="//div[@id='select-group-group_group_type']//ul//li[3]")
	WebElement SelectDropdownOption;
	
	@FindBy(xpath = "//button[@class='btn btn-cancel send_invite']")
	WebElement SendInviteButton;
	
	@FindBy(xpath = "//input[@class='description']")
	WebElement expenseDescription;
	
	@FindBy(xpath = "//input[@class='cost']")
	WebElement expenseCost;
	
	@FindBy(xpath = "//a[@class='date slim-button']")
	WebElement calendar;
	
	@FindBy(xpath = "//div[@id='datepicker']//div//div//table//tbody//tr[5]//td[4]")
	WebElement datePicker;
	
	@FindBy(xpath = "//button[@class='btn btn-large btn-mint submit']")
	WebElement expenseSaveButton;
	
	@FindBy(xpath ="//input[@id='group_memberships_attributes_2_user_attributes_name']")
	WebElement groupMemberName;
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	public String getHomePageTitle() {
		return driver.getTitle();
	}
	
	public void createGroup() {
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", AddGroup);
		GroupName.sendKeys("Water Park");
		executor.executeScript("arguments[0].click();", groupMemberName);
		groupMemberName.sendKeys("Amit Metkar");
//		groupMemberName.sendKeys(Keys.DOWN);
//		groupMemberName.click();
		executor.executeScript("arguments[0].click();", AddFriendsEmail);
		AddFriendsEmail.sendKeys("amit.metkar@gmail.com");
		executor.executeScript("arguments[0].click();", SelectDrop);
		executor.executeScript("arguments[0].click();", SelectDropdownOption);
		executor.executeScript("arguments[0].click();", GroupSaveBtn);
		
	}
//	public void addFriends() {
//		groupMemberName.sendKeys("Amit");
//		AddFriendsEmail.sendKeys("amit.metkar@gmail.com");
//	}
	
	public void addExpense() {
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", AddExpense);
		expenseDescription.sendKeys("Water park tickets");
		expenseDescription.sendKeys("600");
		executor.executeScript("arguments[0].click();", calendar);
		executor.executeScript("arguments[0].click();", datePicker);
		executor.executeScript("arguments[0].click();", expenseSaveButton);
		
		
	}
	
}
