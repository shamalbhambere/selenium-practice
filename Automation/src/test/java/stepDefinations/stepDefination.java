package stepDefinations;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;

import cucumber.api.junit.Cucumber;
import io.github.bonigarcia.wdm.WebDriverManager;

import java.util.concurrent.TimeUnit;

import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@RunWith(Cucumber.class)
public class stepDefination {
 
	 WebDriver driver;
    @Given("^User is on Facebook login page$")
    public void user_is_on_netbanking_landing_page() throws Throwable {
       //write a code to navigate login url
    	//System.setProperty("webdriver.chrome.driver", "C:\\Users\\shama\\Downloads\\chromedriver_win32\\chromedriver.exe");
    	WebDriverManager.chromedriver().setup();
    	WebDriver driver=new ChromeDriver();
    	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    	
    	driver.get("https://www.facebook.com/");
    	
    }

    @When("^User login in to application with username and password$")
    public void user_login_in_to_application_with_username_and_password() throws Throwable {
        //write a code of username,password and submit
    	driver.findElement(By.xpath("//input[@id='email']")).sendKeys("shamal.bhambere@gmail.com");
    	driver.findElement(By.cssSelector("input[id='pass']")).sendKeys("Audvik@05");
    	driver.findElement(By.xpath("//input[@value='Log In']")).click();
    }

    @Then("^Profile page populated$")
    public void home_is_populated() throws Throwable {
        //write a code of home page validation
     System.out.println("Facebook profile page successfully login");	
    }

   
}