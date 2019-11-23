import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\WorkDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/");
		driver.findElement(By.xpath("//div[@id='content'] /ul/li[33]/a")).click();
		
		// CLick on link
		WebElement ch = driver.findElement(By.xpath("//div[@id='content']/div/a"));
		ch.click();
		
		Set<String> h = driver.getWindowHandles();
		Iterator<String> it = h.iterator();
		String child1 = it.next();
		String child2 = it.next();
		
		// Switch to 2nd child window
		driver.switchTo().window(child2);
		
		// Print message on 2nd window
		String t1=driver.findElement(By.xpath("//div[@class='example']/h3")).getText();
        System.out.println(t1);
        
        // Switch to 1nd child window
 		driver.switchTo().window(child1);
     		
 		// Print message on 2nd window
 		String t2=driver.findElement(By.xpath("//div[@class='example']/h3")).getText();
 		System.out.println(t2);
	}

}
