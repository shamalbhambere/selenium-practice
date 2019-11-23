import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actiondemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\WorkDriver\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
	    driver.get("https://www.amazon.com/");
	    Actions a=new Actions(driver);
	    
	    //Move the cursor to specific element
	    a.moveToElement(driver.findElement(By.id("nav-link-accountList"))).build().perform();
	
        //Write on search Text Box using keyboard action
	    
	    a.moveToElement(driver.findElement(By.cssSelector("#twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("lipstick").build().perform();
	    
	    // If we have to select the text
	    
	    a.moveToElement(driver.findElement(By.cssSelector("#twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("lipstick").doubleClick().build().perform();
		    
	}

}
