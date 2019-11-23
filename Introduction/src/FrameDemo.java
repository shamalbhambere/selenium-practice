import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FrameDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\WorkDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/droppable/");
		//Select the entire frame
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[class='demo-frame']")));
		//Create source and target element of frame
		WebElement src=driver.findElement(By.id("draggable"));
		WebElement trg=driver.findElement(By.id("droppable"));
		
		//Create acton object
		Actions a=new Actions(driver);
		a.dragAndDrop(src, trg).build().perform();
		
		
		
	}

}
