import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Assignment2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\WorkDriver\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.cleartrip.com");
       
        //date
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@placeholder='Pick a date']")).click();
        //driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click(); 
        driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();
       
        // Static Dropdown 
        
        Select A=new Select(driver.findElement(By.id("Adults")));
        A.selectByValue("4");
        Select C=new Select(driver.findElement(By.id("Childrens")));
        C.selectByIndex(2);
        
        //Link
        driver.findElement(By.id("MoreOptionsLink")).click();
        driver.findElement(By.id("AirlineAutocomplete")).sendKeys("Indigo");

        //Button
        
        driver.findElement(By.id("SearchBtn")).click();
        
       //Error message
        System.out.println(driver.findElement(By.id("homeErrorMessage")).getText());
        
        
	}

}
