import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment8 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\WorkDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.get("http://www.qaclickacademy.com/practice.php");
		WebElement table=driver.findElement(By.id("product"));
		int row=table.findElements(By.xpath("//table[@id='product']/tbody/tr")).size();
		System.out.println("Number of raws: "+row);
		int column=table.findElements(By.xpath("//table[@id='product']/tbody/tr/th")).size();
		System.out.println("Number of columns: "+column);
		System.out.println("Table data :"+table.findElement(By.xpath("//table[@id='product']/tbody/tr[3]")).getText());
	
		

	}

}
