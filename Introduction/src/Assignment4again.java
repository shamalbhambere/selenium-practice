import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment4again {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\WorkDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/");
         //Click on multiple windows link
		driver.findElement(By.xpath("//div[@id='content']/ul/li[33]/a")).click();
		//Click on parent link
		driver.findElement(By.xpath("//div[@class='example']/a")).click();
        
		Set<String> h=driver.getWindowHandles();
		Iterator<String> it=h.iterator();
		String parent=it.next();
		String child=it.next();
		
		//Switch to child window
		driver.switchTo().window(child);
		//Print child window message
		String ch=driver.findElement(By.xpath("//div[@class='example']/h3")).getText();
		System.out.println(ch);
		//Switch to parent window
		driver.switchTo().window(parent);
		//Print parent window message
		String pt=driver.findElement(By.xpath("//div[@class='example']/h3")).getText();
		System.out.println(pt);
	}

}
