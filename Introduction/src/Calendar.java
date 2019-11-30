import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calendar {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\WorkDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://book.spicejet.com/");
		//for months
		driver.findElement(By.id("custom_date_picker_id_2")).click();
		
		Thread.sleep(1000);
		while(!driver.findElement(By.cssSelector(".ui-datepicker-group-last span.ui-datepicker-year")).getText().contains("2020"))
		{
		   driver.findElement(By.cssSelector(".ui-datepicker-next.ui-corner-all")).click();
			
		}
		
		
		//System.out.println(driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div[2]/div/div/span[1]")).getText() + " element");
		while(!driver.findElement(By.cssSelector(".ui-datepicker-group-last span.ui-datepicker-month")).getText().contains("May"))
		{
		   driver.findElement(By.cssSelector(".ui-datepicker-next.ui-corner-all")).click();
			
		}
			//grab the common attribute and put it into list and iterate 
		int count=driver.findElements(By.cssSelector(".ui-datepicker-group-last .ui-state-default")).size();
	     for(int i=0;i<count;i++)
	     {
	    	String text= driver.findElements(By.cssSelector(".ui-datepicker-group-last .ui-state-default")).get(i).getText(); 
	         if(text.equals("19"))
	   	     {
	        	 driver.findElements(By.cssSelector(".ui-datepicker-group-last .ui-state-default")).get(i).click();
	        	 System.out.println("Date is selected");
	 	        break;
	     }
	         
	}

}
}