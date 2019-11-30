import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.*;

public class CheckboxexAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\\\WorkDriver\\\\chromedriver_win32\\\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("http://qaclickacademy.com/practice.php");
driver.findElement(By.id("checkBoxOption1")).click();
Assert.assertTrue(driver.findElement(By.id("checkBoxOption1")).isSelected());

driver.findElement(By.id("checkBoxOption1")).click();
Assert.assertFalse(driver.findElement(By.id("checkBoxOption1")).isSelected());
		
System.out.println(driver.findElements(By.xpath("//input[@type='checkbox']")).size());
	}

}
