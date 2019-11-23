import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\WorkDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
        d.get("http://google.com");
        System.out.println(d.getTitle());
        System.out.println(d.getCurrentUrl());
      //  System.out.println(d.getPageSource());
        d.get("http://yahoo.com");
        d.navigate().back();
        
        d.get("http://facebook.com");
        d.findElement(By.id("email")).sendKeys("Enter Email ID");
        d.findElement(By.name("pass")).sendKeys("Audvik");
        d.findElement(By.linkText("Forgot account?")).click();
      //  d.close();
       // d.quit();
	}

}
