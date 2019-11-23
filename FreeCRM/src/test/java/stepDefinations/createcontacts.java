package stepDefinations;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class createcontacts {

    WebDriver driver;

    public createcontacts(sharedriver sd) {
        driver = sd.driver;
    }

    @Given("^user is logged in and verify title$")
    public void user_is_login_and_verify_title() {

        driver.findElement(By.xpath("/html/body/div[1]/header/div/nav/div[2]/div/div[2]/ul/a")).click();
        driver.findElement(By.name("email")).sendKeys("shamal.bhambere@gmail.com");
        driver.findElement(By.name("password")).sendKeys("Audvik@05");
        WebElement element = driver.findElement(By.xpath("//*[@id=\"ui\"]/div/div/form/div/div[3]"));
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", element);
        String title = driver.getTitle();
        System.out.println(title);
        Assert.assertEquals("Cogmento CRM", title);

    }

    @When("^user is click on contacts$")
    public void user_is_click_on_contacts() {
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='main-nav']/a[3]/span")));
        driver.findElement(By.xpath("//div[@id='main-nav']/a[3]/span")).click();

    }

    @When("^click on new button$")
    public void click_on_new_button() {

        driver.findElement(By.xpath("//*[@id='dashboard-toolbar']/div[2]/div/a/button")).click();

    }

    @Then("^user enter \"(.*)\" and \"(.*)\" and \"(.*)\"$")
    public void user_enter_first_name_last_name_position(String first, String last, String position) {
        driver.findElement(By.name("first_name")).sendKeys(first);
        driver.findElement(By.name("last_name")).sendKeys(last);
        driver.findElement(By.name("position")).sendKeys(position);

    }

    @Then("^click on save button$")
    public void click_on_save_button() {
        driver.findElement(By.xpath("//*[@id='dashboard-toolbar']/div[2]/div/button[2]")).click();
        driver.close();
    }

}