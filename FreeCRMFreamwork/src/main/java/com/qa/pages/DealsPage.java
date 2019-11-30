package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.qa.base.TestBase;

public class DealsPage extends TestBase {
	@FindBy(xpath = "//*[@id='dashboard-toolbar']/div")
	WebElement tabletitle;
	
	@FindBy(xpath="//*[@id='dashboard-toolbar']/div[2]/div/a[3]/button")
	WebElement newbtn;

	@FindBy(name = "title")
	WebElement title;

	@FindBy(name = "probability")
	WebElement prob;

	@FindBy(name = "commission")
	WebElement comm;

	@FindBy(name = "amount")
	WebElement amt;

	@FindBy(xpath = "//*[@id='dashboard-toolbar']/div[2]/div/button[2]")
	WebElement save;
	
	public DealsPage() {
		PageFactory.initElements(driver, this);
	}

	public boolean ValidateTitleOfDeals() {
		return tabletitle.isDisplayed();
	}
	
    public void ClickOnNewBtn() {
    	newbtn.click();
    }
    
    public void CreateNewDeals(String t1,String probability,String commission,String amount) {
    	title.sendKeys(t1);
    	prob.sendKeys(probability);
    	comm.sendKeys(commission);
    	amt.sendKeys(amount);
    	save.click();
    }
	
	

}
