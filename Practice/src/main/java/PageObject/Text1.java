package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Text1 {

	public WebDriver driver;
	@FindBy(xpath="//*[@id='exdp-entry-form_symbol']/div/div/ul/li/div/input")
    WebElement tx;
	
	public Text1(WebDriver driver) {
	// TODO Auto-generated constructor stub
		this.driver=driver;
	}

	public WebElement getText()
	{
		return driver.findElement(By.xpath("//*[@id='exdp-entry-form_symbol']/div/div/ul/li/div/input"));
	}
	
}
