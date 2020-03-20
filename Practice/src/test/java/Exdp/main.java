package Exdp;

import java.text.ParseException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class main{

	public static WebDriver driver;
	
	@BeforeTest
	public void initiateDriver() {
		driver = initializer.getDriver();
	}
	
	@Test()
	public void InsertRow1() throws InterruptedException, ParseException {
		WebDriverWait wait = new WebDriverWait(driver, 10000);
		exdptest test1 = new exdptest(driver);
		test1.setInputData();
		test1.submitForm();
		
        wait.until(ExpectedConditions.invisibilityOf(driver.findElement(By.cssSelector(".ant-layout > .ant-spin-nested-loading .ant-spin-spinning"))));

		exdptest test2 = new exdptest(driver, "1", "am", "3", "120.23", "200.45", "1", "4", "Test2");
		test2.setInputData();
		test2.submitForm();
		
        wait.until(ExpectedConditions.invisibilityOf(driver.findElement(By.cssSelector(".ant-layout > .ant-spin-nested-loading .ant-spin-spinning"))));

		exdptest test3 = new exdptest(driver, "1", "eb", "2", "123", "202", "2", "3", "Test3");
		test3.setInputData();
		test3.submitForm();

		wait.until(ExpectedConditions.invisibilityOf(driver.findElement(By.cssSelector(".ant-layout > .ant-spin-nested-loading .ant-spin-spinning"))));
		
		test3.tabledata();
		Thread.sleep(2000);
		//test3.UpdatedOn();
	}
	
}
