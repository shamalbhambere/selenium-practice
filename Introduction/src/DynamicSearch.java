import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicSearch {

	public static void main(String[] args) throws InterruptedException {
		  System.setProperty("webdriver.chrome.driver", "C:\\WorkDriver\\chromedriver_win32\\chromedriver.exe"); 
		  WebDriver driver=new ChromeDriver();
		  driver.get("http://www.google.com");
		  Thread.sleep(3000);
		  
		  driver.findElement(By.id("fakebox")).sendKeys("testing");
		  
		  List<WebElement> list = driver.findElements(By.xpath("//*[@role='listbox']//li/descendant::div[@class='sbl1']"));
	
		  System.out.println("Number of options are:=="+ list);
		  
	      for(int i=0;i<list.size();i++) {
	    	System.out.println(list.get(i).getText());
	    	if(list.get(i).getText().contains("testing effect")) {
	    		list.get(i).click();
	    		break;
	    	}
	    	
	    	
	    	  
	      }
	}

}
