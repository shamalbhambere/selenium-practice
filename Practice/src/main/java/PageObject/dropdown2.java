package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Exdp.dropdown;

public class dropdown2 extends dropdown {
	
	public WebDriver driver;

	@FindBy(css="#exdp-entry-form_type")
    WebElement action;
	public dropdown2(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
}
