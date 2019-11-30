
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SalesForce {

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
        
       /* d.get("https://login.salesforce.com");
        d.findElement(By.id("username")).sendKeys("Enter User name for login");
        d.findElement(By.name("pw")).sendKeys("123456");
        d.findElement(By.xpath("//*[@id=\'Login\']")).click(); */
        d.get("https://login.salesforce.com");
        d.findElement(By.cssSelector("#username")).sendKeys("Enter valid username");
        d.findElement(By.xpath("//*[@id='password']")).sendKeys("Enter valid password");
        d.findElement(By.cssSelector("#rememberUn")).click();
        d.findElement(By.cssSelector("#forgot_password_link")).click();
        d.findElement(By.xpath("//*[@id=\'Login\']")).click();
        d.close();
       

        
        
      }

}
