import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class identifysiblingsxpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\WorkDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.qaclickacademy.com/interview.php");
        driver.findElement(By.xpath("//*[@class='responsive-tabs__list']/li[1]/following-sibling::li[1]")).click();
		driver.findElement(By.xpath("//*[@class='responsive-tabs__list']/li[2]/following-sibling::li[1]")).click();
        driver.findElement(By.xpath("//*[@class='responsive-tabs__list']/li[3]/following-sibling::li[1]")).click();
        driver.close();
	}
}
