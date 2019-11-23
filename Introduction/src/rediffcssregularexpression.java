import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class rediffcssregularexpression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\WorkDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://rediff.com");
		driver.findElement(By.cssSelector("a[title*='Sign in']")).click();
		driver.findElement(By.cssSelector("input[id*='login1']")).sendKeys("Enter username");
		driver.findElement(By.cssSelector("input[type*='password']")).sendKeys("Helloword");
		driver.findElement(By.cssSelector("input[name*='proceed']")).click();
		driver.close();
		

	}

}
