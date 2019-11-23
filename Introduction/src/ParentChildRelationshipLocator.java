import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ParentChildRelationshipLocator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.setProperty("webdriver.chrome.driver", "C:\\WorkDriver\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://book.spicejet.com");
        driver.findElement(By.xpath("//input[@id='ControlGroupSearchView_AvailabilitySearchInputSearchVieworiginStation1_CTXT']")).click();
        driver.findElement(By.xpath("//a[@value='PNQ']")).click();
        /*driver.findElement(By.xpath("(//a[@value='BOM'])[2]")).click();//Optional -While using index of object  */
        
        driver.findElement(By.xpath("//div[@id='glsControlGroupSearchView_AvailabilitySearchInputSearchViewdestinationStation1_CTNR'] //a[@value='BOM']")).click();
        /* Using parent-child relation*/    
	}

}
