package stepDefinations;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class TaggingstepDefination {
    WebDriver driver;

    public TaggingstepDefination(sharedriver sd) {
        driver = sd.driver;
    }

    @Given("^User click on login$")
    public void user_click_on_URL() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(By.xpath("/html/body/div[1]/header/div/nav/div[2]/div/div[2]/ul/a")).click();

    }

    @When("^User Enter valid \"([^\"]*)\" & \"([^\"]*)\"$")
    public void user_Enter_valid(String arg1, String arg2) {
        driver.findElement(By.name("email")).sendKeys(arg1);
        driver.findElement(By.name("password")).sendKeys(arg2);
        driver.findElement(By.xpath("//*[@id=\"ui\"]/div/div/form/div/div[3]")).click();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    }

    @Then("^Verify title of home page$")
    public void verify_title_of_home_page() {
        String title = driver.getTitle();
        System.out.println(title);
        Assert.assertEquals("Cogmento CRM", title);

    }

    @When("^User enter \"([^\"]*)\" and \"([^\"]*)\"$")
    public void user_enter_and(String arg1, String arg2) {
        driver.findElement(By.name("email")).sendKeys(arg1);
        driver.findElement(By.name("password")).sendKeys(arg2);
        driver.findElement(By.xpath("//*[@id=\"ui\"]/div/div/form/div/div[3]")).click();

    }

    @Then("^User enter data in search text$")
    public void user_enter_data_in_search_text() {
        driver.findElement(By.xpath("//*[@placeholder='Search']")).sendKeys("Komal");
        driver.findElement(By.xpath("//*[@placeholder='Search']")).sendKeys(Keys.ENTER);

    }

    @Then("^verify data is showing$")
    public void verify_data_is_showing() {

        Assert.assertEquals("Search Results: Komal",
                driver.findElement(By.xpath("//*[@id='dashboard-toolbar']/div[1]")).getText());

    }

    @Then("^User click on calendar menu$")
    public void user_click_on_calendar_menu() {
        driver.findElement(By.xpath("//*[@id='main-nav']/a[2]")).click();

    }

    @Then("^User click new button$")
    public void user_click_new_button() {
        driver.findElement(By.xpath("//*[@id='dashboard-toolbar']/div[2]/div/a/button")).click();
    }

    @Then("^User enter \"([^\"]*)\",\"([^\"]*)\" and \"([^\"]*)\"$")
    public void user_enter_and(String arg1, String arg2, String arg3) throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(By.name("title")).sendKeys(arg1);
        driver.findElement(By.name("location")).sendKeys(arg2);
        driver.findElement(By.name("description")).sendKeys(arg3);

    }

    @Then("^User click on save button$")
    public void user_click_on_save_button() {
        driver.findElement(By.xpath("//*[@id='dashboard-toolbar']/div[2]/div/button[2]")).click();

    }

    @When("^User enter username and Password$")
    public void user_enter_username_and_Password() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.name("email")).sendKeys("shamal.bhambere@gmail.com");
        driver.findElement(By.name("password")).sendKeys("Audvik@05");
        driver.findElement(By.xpath("//*[@id=\"ui\"]/div/div/form/div/div[3]")).click();

    }

    @Then("^User click on contacts menu$")
    public void user_click_on_contacts_menu() {
        driver.findElement(By.xpath("//*[@id='main-nav']/a[3]")).click();

    }

    @Then("^User enter firstname and lastname$")
    public void user_enter_firstname_and_lastname(DataTable arg1) {
        List<List<String>> data = arg1.raw();
        driver.findElement(By.name("first_name")).sendKeys(data.get(0).get(0));

        driver.findElement(By.name("last_name")).sendKeys(data.get(0).get(1));

    }

    @Then("^user click on companies menu$")
    public void user_click_on_companies_menu() {
        driver.findElement(By.xpath("//*[@id='main-nav']/a[4]")).click();

    }

    @Then("^User enter companies details$")
    public void user_enter_companies_details(DataTable arg1) throws InterruptedException {
        for (Map<String, String> values : arg1.asMaps(String.class, String.class)) {
            driver.findElement(By.name("name")).sendKeys(values.get("Name"));
            Thread.sleep(2000);
            driver.findElement(By.name("description")).sendKeys(values.get("Description"));
            Thread.sleep(3000);
            driver.findElement(By.name("annual_revenue")).sendKeys(values.get("Annual Revenue"));

            driver.findElement(By.xpath("//*[@id='dashboard-toolbar']/div[2]/div/button[2]")).click();

            
           
            driver.findElement(By.xpath("//*[@id='dashboard-toolbar']/div[2]/div/a[2]/button")).click();

        }

    }

    @Then("^user click on deals menu$")
    public void user_click_on_deals_menu() {
        driver.findElement(By.xpath("//*[@id='main-nav']/a[5]")).click();
        driver.findElement(By.xpath("//*[@id='dashboard-toolbar']/div[2]/div/a[3]/button")).click();

    }

    @Then("^User enter data in deals fields$")
    public void user_enter_data_in_deals_fields() {

        WebDriverWait wait1 = new WebDriverWait(driver, 30);
        wait1.until(ExpectedConditions.visibilityOfElementLocated(By.name("title")));

        driver.findElement(By.name("title")).sendKeys("xxxxx");
        driver.findElement(By.name("commission")).sendKeys("20%");

    }

    @Then("^user click on tasks menu$")
    public void user_click_on_tasks_menu() {
        driver.findElement(By.xpath("//*[@id='main-nav']/a[6]")).click();

    }

    @Then("^User enter data in tasks fields$")
    public void user_enter_data_in_tasks_fields() {
        driver.findElement(By.name("title")).sendKeys("sssss");
        driver.findElement(By.name("completion")).sendKeys("20");

    }

    @Then("^user click on cases menu$")
    public void user_click_on_cases_menu() {
        driver.findElement(By.xpath("//*[@id='main-nav']/a[7]")).click();

    }

    @Then("^User enter data in cases fields$")
    public void user_enter_data_in_cases_fields() {
        driver.findElement(By.name("title")).sendKeys("cases ");

    }

    @Then("^close browser$")
    public void close_browser() {
        driver.close();
    }
}