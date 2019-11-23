import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingRadiobuttonDynamically {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
          System.setProperty("webdriver.chrome.driver", "C:\\WorkDriver\\chromedriver_win32\\chromedriver.exe");
	       WebDriver driver=new ChromeDriver();
	       driver.get("https://www.qaclickacademy.com/practice.php");
	       Thread.sleep(2000);
	       driver.findElement(By.xpath("//input[@value='radio2']")).click();
	       int count=driver.findElements(By.xpath("//input[@name='radioButton']")).size();
	       Thread.sleep(2000);
	      for(int i=0;i<count;i++)
	       {
	    	  // driver.findElements(By.xpath("//input[@name='radioButton']")).get(i).click();
	    	  String y= driver.findElements(By.xpath("//input[@name='radioButton']")).get(i).getAttribute("value");
	    	   if(y==("Radio1"))
	    	   {
	    		   driver.findElements(By.xpath("//input[@name='radioButton']")).get(i).click();  
	    	   }
	    	   
	       }
	       
	}

}
