import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingOrSwitchingWindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\WorkDriver\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
	    driver.get("https://login.yahoo.com/account/create?specId=yidReg");
	    driver.findElement(By.xpath("//*[@id=\'regform\']/p/a[2]")).click();
	    //get the titile of parent window
	    System.out.println(driver.getTitle());
	    Set<String> ids=driver.getWindowHandles();
	    Iterator<String> it=ids.iterator();
        String parentWindow=it.next();
	    String childWindow=it.next();
	    driver.switchTo().window(childWindow);
	    //get the title of child window
	    System.out.println(driver.getTitle());
	    //again get the title of parent window 
	    driver.switchTo().window(parentWindow);	
         System.out.println(driver.getTitle());
}
}
