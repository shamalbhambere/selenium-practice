import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicitwait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\WorkDriver\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://www.itgeared.com/demo/1506-ajax-loading.html");
        WebDriverWait d=new WebDriverWait(driver,20);
        d.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@href='javascript: void(0);loadAjax();']")));
       driver.findElement(By.xpath("//a[@href='javascript: void(0);loadAjax();']")).click();
       System.out.println(driver.findElement(By.cssSelector("#results")).getText());

	}

}
