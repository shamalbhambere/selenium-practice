package stepDefinations;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class dealsstepDefination {

    WebDriver driver;

    public dealsstepDefination(sharedriver sd) {
        driver = sd.driver;
    }

    @Given("^User click on log in$")
    public void user_click_on_log_in() {
        driver.findElement(By.xpath("/html/body/div[1]/header/div/nav/div[2]/div/div[2]/ul/a")).click();

    }

    @Given("^user entered username and password$")
    public void user_entered_username_and_password(DataTable arg1) {
        List<List<String>> datavalue = arg1.raw();
        driver.findElement(By.name("email")).sendKeys(datavalue.get(0).get(0));
        driver.findElement(By.name("password")).sendKeys(datavalue.get(0).get(1));
        driver.findElement(By.xpath("//*[@id=\"ui\"]/div/div/form/div/div[3]")).click();
        

    }

    @When("^verify title of home is cogmento CRM$")
    public void verify_title_of_home_is_cogmento_CRM() {
        String title = driver.getTitle();
        System.out.println(title);
        Assert.assertEquals("Cogmento CRM", title);
    }

    @When("^user click on deals$")
    public void user_click_on_deals() {
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='main-nav']/a[5]/span")));
        driver.findElement(By.xpath("//div[@id='main-nav']/a[5]/span")).click();



    }

    @Then("^user click on new button$")
    public void user_click_on_new_button() {
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='dashboard-toolbar']/div[2]/div/a[3]/button")));
       
        driver.findElement(By.xpath("//*[@id='dashboard-toolbar']/div[2]/div/a[3]/button")).click();

    }

    @Then("^user enter title, amount, probability and commission$")
    public void user_enter_title_products_probability_and_commission(DataTable arg1) {
         List <List<String>> data=arg1.raw();
         driver.findElement(By.name("title")).sendKeys(data.get(0).get(0));
         driver.findElement(By.name("amount")).sendKeys(data.get(0).get(1));
         driver.findElement(By.name("probability")).sendKeys(data.get(0).get(2));
         driver.findElement(By.xpath("//*[@type='text']")).sendKeys(data.get(0).get(3));


    }

    @Then("^user click on save button$")
    public void user_click_on_save_button() {

        driver.findElement(By.xpath("//*[@id='dashboard-toolbar']/div[2]/div/button[2]")).click();

    }

}
