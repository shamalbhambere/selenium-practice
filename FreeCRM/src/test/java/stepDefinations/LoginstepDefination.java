package stepDefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class LoginstepDefination {
	
	WebDriver driver;
	public LoginstepDefination (sharedriver sd){
		driver=sd.driver;
	}
	
	@Given("^user is already on logged in$")
	public void user_is_already_on_login_page() {
		
		driver.get("https://freecrm.com");
    	
	}

	@When("^verify title of login page is Free CRM$")
	public void title_of_login_page_is_Free_CRM() {
		String title=driver.getTitle();
		System.out.println(title);
		Assert.assertEquals("Free CRM #1 cloud software for any business large or small", title);

		
	}

	@When("^click on login button$")
	public void click_on_login_button() {
		driver.findElement(By.xpath("/html/body/div[1]/header/div/nav/div[2]/div/div[2]/ul/a")).click();
	}
	
	@Then("^user enter username & password$")
	public void user_enter_username_password() {
		driver.findElement(By.name("email")).sendKeys("shamal.bhambere@gmail.com");
	    driver.findElement(By.name("password")).sendKeys("Audvik@05");
		
	}

	@Then("^user click on login button$")
	public void user_click_on_login_button() {
		WebElement element = driver.findElement(By.xpath("//*[@id=\"ui\"]/div/div/form/div/div[3]"));
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", element);
		
	}

	@Then("^user is on home page$")
	public void user_is_on_home_page() {
		String title=driver.getTitle();
		System.out.println(title);
		Assert.assertEquals("Cogmento CRM", title);
		driver.close();
		

	}



}
