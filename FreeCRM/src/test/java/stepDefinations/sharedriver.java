package stepDefinations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class sharedriver {
	
	WebDriver driver;
	@Before
	public WebDriver startbrowser()
	{
			System.setProperty("webdriver.chrome.driver", "C:\\WorkDriver\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://freecrm.com");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.manage().window().maximize();
    	return driver;
    	
	}

	@After
	public void closebowser()
	{
		//driver.close();
		//driver.quit();
	
	}
}