import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Synchronization {

	private static final TimeUnit Seconds = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\WorkDriver\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        driver.get("https://www.alaskaair.com/hotels/mp/home/en/?t=1561909440355&utm_source=alaska&utm_medium=partner-page&utm_campaign=alaska-homepage-bookingformlet-hotelstab-Q12019-home-tr");
        driver.findElement(By.xpath("//input[@placeholder='Where do you need a hotel?']")).sendKeys("NYC");
        driver.findElement(By.id("FH-searchButtonExt1")).sendKeys(Keys.ENTER);
        driver.findElement(By.cssSelector(".btn.wl-btn-search.search-submit-btn.big")).click();
       driver.findElement(By.id("FH-searchButtonExt1")).sendKeys(Keys.ENTER);
        
	}

}
