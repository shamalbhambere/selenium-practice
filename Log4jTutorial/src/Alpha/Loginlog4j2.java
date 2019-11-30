package Alpha;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Loginlog4j2 {

	private static Logger log =LogManager.getLogger(Loginlog4j2.class.getName());
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 log.debug("Setting chrome driver property");
		 System.setProperty("webdriver.chrome.driver","C:\\WorkDriver\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver =new ChromeDriver();
		 driver.manage().window().maximize();
		    log.info("Window Maximized");
		    log.debug("Now hitting facebook website");
            driver.get("https://www.facebook.com/");
            log.info("Landed on facebook login page");
           WebElement email= driver.findElement(By.id("email"));
           if(email.isEnabled())
           {
        	   email.sendKeys("amit.metkar@gmail.com");
               log.info("Entered Email ID");
                 
           }else
        	   
           {
        	   log.error("Email id is not correct");
           }
            WebElement pass=driver.findElement(By.id("pass"));
            if(pass.isEnabled())
            {
            	 pass.sendKeys("Bindhast@$7");
            	 log.info("Entered Password");
                 
            }
            else
            {
            	   log.error("Text is not enable");
            	   
            }
             WebElement sub=driver.findElement(By.xpath("//input[@value='Log In']"));
         
           	 sub.click();
            	 log.info("Login successfully");
            
	}

}
