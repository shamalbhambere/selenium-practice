import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class SpiceJetAirline {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\WorkDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
	    driver.get("https://www.spicejet.com/");
	    //DropDown
	    driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//a[@value='BOM']")).click();
	    driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='PNQ']")).click();
	    
	    //Calander/ Date when id/class is define
	    
	    driver.findElement(By.cssSelector("a.ui-state-default.ui-state-highlight")).click();
	    //radio buttons
	    driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
	    //enable and disable return date
	    System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
	    if(driver.findElement(By.id("Div1")).getAttribute("style").contains("1"))
	    {
	    	System.out.println("Return date calander and round trip button is enable");
	    	Assert.assertTrue(true);
	    }
	    else
	    {
	    	System.out.println("Return date calander and round trip button is disable");
	 	   	Assert.assertTrue(false);
	    }
	    
	    //Checkboxes
	    
	    driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).click();
	    Assert.assertTrue(driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).isSelected());
	    System.out.println(driver.findElements(By.xpath("//input[@type='checkbox']")).size());
	    
	    //Updates Dropdowns
	    
	    Thread.sleep(1000);
	    driver.findElement(By.cssSelector(".paxinfo")).click();

	    Thread.sleep(2000L);

	 for(int i=1;i<5;i++)

	 {

	 driver.findElement(By.id("hrefIncAdt")).click();

	 }

	 driver.findElement(By.id("btnclosepaxoption")).click();

	 Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "5 Adult");

	 System.out.println(driver.findElement(By.id("divpaxinfo")).getText());    
	
	  //Search Flight
	 
	 driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
	}

}
