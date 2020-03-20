package Exdp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class dropdown {
	
	public WebDriver driver;

	public dropdown(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	
	 public WebElement clickdrop(String id)
	 {
		 ////*[@id="exdp-entry-form_action"]
		// "//*[@id='exdp-entry-form_symbol']/div/div/ul/li/div/input"
		 return driver.findElement(By.xpath("//*[@id='"+id+"']"));   	
	 }

     public WebElement getdrop(String id, String itemNumber)
     {
    	 String selector = "//*[@id='"+id+"']/ul/li["+itemNumber+"]";
    	 System.out.println(selector);
    	 return driver.findElement(By.xpath(selector));
     }
}
