import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebookxpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.setProperty("webdriver.chrome.driver","C:\\WorkDriver\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://facebook.com");
        driver.findElement(By.xpath("//input[@type='email']")).sendKeys("First xpath code");
        driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("Hello");
        driver.findElement(By.xpath("//input[@data-testid='royal_login_button']")).click();
        
        
        
	}

}
