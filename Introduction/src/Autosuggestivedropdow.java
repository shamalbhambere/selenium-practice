import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//Enter letter BENG
//Verify if airport option is displaying in suggestive box

public class Autosuggestivedropdow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\WorkDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ksrtc.in/oprs-web");
		driver.findElement(By.xpath("//input[@id='fromPlaceName']")).sendKeys("BENG");
		for (int i = 1; i < 5; i++) {
			driver.findElement(By.xpath("//input[@id='fromPlaceName']")).sendKeys(Keys.ARROW_DOWN);
			// driver.findElement(By.xpath("//input[@id='fromPlaceName']")).sendKeys(Keys.ARROW_DOWN);
			// driver.findElement(By.xpath("//input[@id='fromPlaceName']")).sendKeys(Keys.ARROW_DOWN);
		}
		// Javascript DOM can extract hidden element
		// because selenium cannot identify hidden element-(ajax implementation)
		// investigate the properties of object if it have any hidden text

		// JavascriptExecutor
		JavascriptExecutor js = (JavascriptExecutor) driver;
		String script = " return document.getElementById(\"fromPlaceName\").value;";
		String text = (String) js.executeScript(script);
		System.out.println(text);

		if (text.contains("BENGALURU AIRPORT")) {
			System.out.println("Test is passed");
		} else {
			System.out.println("Test is failed");
		}

	}
}
