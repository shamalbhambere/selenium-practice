package stepDefinations;

import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class TaskstepDefination {
    WebDriver driver;

    public TaskstepDefination(final sharedriver sd) {
        driver = sd.driver;
    }

    @Given("^user logged in to the application$")
    public void user_logged_in_to_the_application(final DataTable arg1) {
        driver.findElement(By.xpath("/html/body/div[1]/header/div/nav/div[2]/div/div[2]/ul/a")).click();
        for (final Map<String, String> data : arg1.asMaps(String.class, String.class)) {
            driver.findElement(By.name("email")).sendKeys(data.get("username"));
            driver.findElement(By.name("password")).sendKeys(data.get("password"));
            driver.findElement(By.xpath("//*[@id=\"ui\"]/div/div/form/div/div[3]")).click();

        }

    }

    @When("^verify the title of home page is Cogmento CRM$")
    public void verify_the_title_of_home_page_is_Cogmento_CRM() {
        final String title = driver.getTitle();
        System.out.println(title);
        Assert.assertEquals("Cogmento CRM", title);
    }

    @When("^user click on task menu$")
    public void user_click_on_task_menu() {
        final WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='main-nav']/a[6]")));
        driver.findElement(By.xpath("//div[@id='main-nav']/a[6]")).click();

    }

    @Then("^user click on new button of task$")
    public void user_enter_all_the_details() {
        driver.findElement(By.xpath("//*[@id='dashboard-toolbar']/div[2]/div/a/button")).click();

    }

    @Then("^user enter all the details$")
    public void user_enter_all_the_details(final DataTable arg1) {
        for (final Map<String, String> data : arg1.asMaps(String.class, String.class)) {

            final WebDriverWait wait = new WebDriverWait(driver, 30);
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("title")));

            driver.findElement(By.name("title")).sendKeys(data.get("title"));

            driver.findElement(By.name("completion")).sendKeys(data.get("completion"));
            // driver.findElement(By.xpath("//*[@id='ui']/div/div[2]/div[2]/div/div[2]/form/div[7]/div/div/textarea")).sendKeys(value.get("Description"));
            // driver.findElement(By.xpath("//*[@id='ui']/div/div[2]/div[2]/div/div[2]/form/div[9]/div[2]/div/div/input")).sendKeys(value.get("Identifier"));
            final WebElement element = driver
                    .findElement(By.xpath("//*[@id='dashboard-toolbar']/div[2]/div/button[2]"));
            final JavascriptExecutor executor = (JavascriptExecutor) driver;
            executor.executeScript("arguments[0].click();", element);

            final WebDriverWait wait1 = new WebDriverWait(driver, 30);
            wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='main-nav']/a[6]")));
            driver.findElement(By.xpath("//div[@id='main-nav']/a[6]")).click();

            //TODO: click on new button to open form 

            driver.findElement(By.xpath("//*[@id='dashboard-toolbar']/div[2]/div/a/button")).click();

        }
    }

}
