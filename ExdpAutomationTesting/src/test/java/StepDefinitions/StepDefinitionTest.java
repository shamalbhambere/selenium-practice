package StepDefinitions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinitionTest {
	WebDriver driver;
	
	public StepDefinitionTest(ShareDriver sd) {
		driver = sd.driver;
	}
	@Given("^User enter URL$")
    public void user_enter_url(){
		driver.get("http://localhost:3000/");
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);

	}

	@Given("^User is already on page$")
	public void user_is_already_on_page() {
	    System.out.println(driver.getTitle());
			}

	@When("^User select action \"([^\"]*)\" drop down$")
	public void user_select_action_drop_down(String arg1) throws InterruptedException {

		driver.findElement(By.id("exdp-entry-form_action")).click();
		Thread.sleep(3000);
		List<WebElement> data = driver.findElements(
				By.xpath("//*[contains(@class,'ant-select-dropdown-placement-bottomLeft')]//div//ul//li"));

		System.out.println(data.size());
		for (int i = 0; i < data.size(); i++) {
			if (data.get(i).getText().contains(arg1)) {
				data.get(i).click();
				break;
			}
		}

	}

	@When("^User enter symbol \"([^\"]*)\" and select \"([^\"]*)\"$")
	public void user_enter_symbol_key_and_select_option(String arg1, String arg2) throws InterruptedException {
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys(arg1);
		Thread.sleep(4000);
		List<WebElement> data = driver
				.findElements(By.xpath("//*[contains(@style,'width: 401px; left: 455px; top: 117px;')]//div//ul//li"));
        Thread.sleep(3000);
		System.out.println(data.size());
		for (int i = 0; i < data.size(); i++) {
			if (data.get(i).getText().contains(arg2)) {
				data.get(i).click();
				break;
			}
		}

	}

	@And("^User enter qty \"([^\"]*)\"$")
	public void user_enter_qty(String arg1) {

		driver.findElement(By.id("exdp-entry-form_quantity")).sendKeys(arg1);

	}

	@And("^User enter stop price \"([^\"]*)\"$")
	public void user_enter_stop_price(String arg1) {

		driver.findElement(By.id("exdp-entry-form_stop_price")).sendKeys(arg1);
	}

	@And("^User enter price \"([^\"]*)\"$")
	public void user_enter_price(String arg1) {

		driver.findElement(By.id("exdp-entry-form_price")).sendKeys(arg1);
	}

	@When("^User select \"([^\"]*)\" type drop down$")
	public void user_select_order_type_drop_down(String arg1) throws InterruptedException {
		driver.findElement(By.id("exdp-entry-form_type")).click();
		//Thread.sleep(4000);
		List<WebElement> data = driver
				.findElements(By.xpath("//*[contains(@style,'width: 297px; left: 143px; top: 211px;')]//div//ul//li"));

		System.out.println(data.size());
		for (int i = 0; i < data.size(); i++) {
			if (data.get(i).getText().contains(arg1)) {
				data.get(i).click();
				break;
			}
		}

	}

	@And("^User select tif \"([^\"]*)\" drop down$")
	public void user_select_TIF_drop_down(String arg1) {
		driver.findElement(By.id("exdp-entry-form_tif")).click();
		List<WebElement> data = driver.findElements(
				By.xpath("//div[contains(@style,'width: 297px; left: 455px; top: 211px;')]//div//ul//li"));

		System.out.println(data.size());
		for (int i = 0; i < data.size(); i++) {
			if (data.get(i).getText().contains(arg1)) {
				data.get(i).click();
				break;
			}
		}

	}

	@And("^User Enter \"([^\"]*)\"$")
	public void user_Enter(String arg1) {
		
		driver.findElement(By.id("exdp-entry-form_comment")).sendKeys(arg1);

	}

	@Then("^User click on submit button$")
	public void user_click_on_submit_button() throws Throwable {
       
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
	}

	@And("^check data is added in data grid table$")
	public void check_data_is_added_in_data_grid_table() throws Throwable {

	}
}
