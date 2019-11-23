import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class rediffxpathregularexpression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\WorkDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://rediff.com");
		driver.findElement(By.xpath("//a[contains(@title,'Sign in')]")).click();
		driver.findElement(By.xpath("//input[contains(@id,'login1')]")).sendKeys("Enter valid username");
		driver.findElement(By.xpath("//input[contains(@name,'passwd')]")).sendKeys("Enter valid password");
		driver.findElement(By.xpath("//input[contains(@name,'proceed')]")).click();
		System.out.println(driver.findElement(By.xpath("//div[@id='login']/div/div[1]")).getText());
		System.out.println(driver.findElement(By.xpath("//div[@id='login']/div/div[3]")).getText());
		  
	    //driver.close();
	}

}
