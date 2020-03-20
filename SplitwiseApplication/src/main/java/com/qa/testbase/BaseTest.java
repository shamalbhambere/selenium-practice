package com.qa.testbase;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {
	
	public static WebDriver driver;
	public static Properties prop;
	
	public BaseTest() {

		try {
			prop = new Properties();
			FileInputStream fis = new FileInputStream("C:\\workspace\\selenium-practice\\SplitwiseApplication\\src\\main\\java\\com\\qa\\util\\Configration.Properties");
			prop.load(fis);
		}catch(Exception e) {
			System.out.println(e);
		}
	}

	public void initialization() {
		if(prop.getProperty("browser").equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\WorkDriver\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
			
		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
	}
	
}
