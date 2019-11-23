import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkScope {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\WorkDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.qaclickacademy.com/practice.php");
		//1.Give me the count of link in this page
		System.out.println(driver.findElements(By.tagName("a")).size());
		//2.Give the count of link of footer section
		WebElement footerDriver=driver.findElement(By.id("gf-BIG"));//limiting WebDriver
		System.out.println(footerDriver.findElements(By.tagName("a")).size());
		//3.Give the count of link from 1st column of footer section
		WebElement columnDriver=footerDriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
	System.out.println(columnDriver.findElements(By.tagName("a")).size());
	//4. Click on each link in the column and check if the pages are opening-
	int count=columnDriver.findElements(By.tagName("a")).size();
	
         for(int i=1;i<count;i++)
         {
        	 String clickonlinktab=Keys.chord(Keys.CONTROL,Keys.ENTER);
        	 columnDriver.findElements(By.tagName("a")).get(i).sendKeys(clickonlinktab);
               Thread.sleep(3000L);
         }//open all the tab
               Set<String> ab=driver.getWindowHandles();
               Iterator<String> it=ab.iterator();
               while(it.hasNext())
               {
            	   driver.switchTo().window(it.next());        	   
            	   System.out.println(driver.getTitle());
              	                
               }
        	
         
	
	
	}

}
