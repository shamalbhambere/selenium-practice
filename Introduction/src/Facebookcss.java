import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebookcss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  System.setProperty("webdriver.chrome.driver", "C:\\WorkDriver\\chromedriver_win32\\chromedriver.exe");
  WebDriver driver=new ChromeDriver();
  driver.get("http://facebook.com");
  driver.findElement(By.cssSelector("input[data-testid='royal_email']")).sendKeys("First cssSelector code");
  driver.findElement(By.cssSelector("input[name='pass']")).sendKeys("Hello");
  driver.findElement(By.cssSelector("input[value='Log In']")).click();
  
	}

}
