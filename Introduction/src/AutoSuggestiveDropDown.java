import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestiveDropDown {

	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\WorkDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.makemytrip.com/flights/");
	    driver.findElement(By.xpath("//input[@id='fromCity']")).click();
	    WebElement src=driver.findElement(By.xpath("//input[@placeholder='From']"));
	   src.click();
	   Thread.sleep(2000);
	   src.sendKeys("MUM");
       src.sendKeys(Keys.ARROW_DOWN);
       src.sendKeys(Keys.ENTER); 
      src=driver.findElement(By.xpath("//input[@placeholder='To']"));
      src.click();
      Thread.sleep(2000);
      src.sendKeys("DEL");
      Thread.sleep(2000);
      for(int i=1;i<6;i++)
      {	  
      src.sendKeys(Keys.ARROW_DOWN);
      }
      src.sendKeys(Keys.ENTER);
	driver.close();
	}

}
