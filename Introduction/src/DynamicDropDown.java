import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class DynamicDropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
     System.setProperty("webdriver.chrome.driver", "C:\\WorkDriver\\chromedriver_win32\\chromedriver.exe");
     WebDriver driver=new ChromeDriver();
     driver.get("https://www.expedia.com/Flights");
     driver.findElement(By.id("traveler-selector-flp")).click();
   // driver.findElement(By.xpath("//div[@id='traveler-selector-flp']/div/ul/li/button")).click();
    Thread.sleep(2000L);
     int i=1;
     while(i<5)
     {
    	  driver.findElement(By.xpath("//*[@id='traveler-selector-flp']/div/ul/li/div/div/div/div[1]/div[4]/button")).click();
    	  //Assert.assertEquals(By.xpath("//div[@id='traveler-selector-flp']/div/ul/li/button")).getText() , "5 Adults");	
    System.out.println(driver.findElement(By.xpath("//div[@id='traveler-selector-flp']/div/ul/li/button")).getText());
          i++;
     }
     /*for(int x=0;x<3;x++)
	 {
	   driver.findElement(By.xpath("//div[@id='traveler-selector-flp']/div/ul/li/div/div/div/div[2]/div[1]/div[4]/button")).click();	 
	   System.out.println(driver.findElement(By.xpath("//div[@id='traveler-selector-flp']/div/ul/li/button")).getText());
       
	 }*/
    }
	 
}
