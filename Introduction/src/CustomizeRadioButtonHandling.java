import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomizeRadioButtonHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\WorkDriver\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://www.qaclickacademy.com/practice.php");
        driver.findElement(By.xpath("//input[@value='radio2']")).click();
        System.out.println(driver.findElements(By.xpath("//input[@name='radioButton']")).size());

	}

}
