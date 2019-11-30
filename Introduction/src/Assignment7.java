import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment7 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\WorkDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		driver.get("http://www.qaclickacademy.com/practice.php");
	    driver.findElement(By.id("autocomplete")).sendKeys("IND");
	    driver.findElement(By.xpath("//input[@id='autocomplete']	")).sendKeys(Keys.DOWN);
           Thread.sleep(2000);
	    driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);
	    
	    driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);
	    System.out.println(driver.findElement(By.id("autocomplete")).getText());
	    
	    //Javascript Executor-because in that hidden element used
	    JavascriptExecutor js=(JavascriptExecutor)driver;
	    String script="return document.getElementById(\"autocomplete\").value;";
	    String text=(String) js.executeScript(script);
	    int i=0;
	    while(!text.equalsIgnoreCase("India"))
	    {
	    	
	    	 driver.findElement(By.xpath("//input[@id='autocomplete']")).sendKeys(Keys.DOWN);
	    	 String t=(String) js.executeScript(script);
		    	System.out.println(t);
		    	
		    	if(i>5)
		    	{
		    		break;
		    	}
	    	 
	         
	    }
	    if(i>5)
	    {
	    	System.out.println("Element is not found");
	    }
	    else
	    {
	    	System.out.println("Element found");
		    
	    }
	}

}
