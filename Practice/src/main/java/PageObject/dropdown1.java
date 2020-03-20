package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Exdp.dropdown;

public class dropdown1 extends dropdown {
	
	public WebDriver driver;

	@FindBy(css="#exdp-entry-form_action")
    WebElement action;
	public dropdown1(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	
	public WebElement getDDL() {
		return driver.findElement(By.cssSelector("#exdp-entry-form_action"));
	}
}
