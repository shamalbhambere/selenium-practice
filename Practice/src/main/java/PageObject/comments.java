package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class comments {
	public WebDriver driver;
	By cmt=By.id("exdp-entry-form_comment");
	public comments(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	public WebElement commt()
	{
		return driver.findElement(cmt);
	}

}
