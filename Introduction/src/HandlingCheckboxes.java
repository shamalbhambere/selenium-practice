import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.*;

public class HandlingCheckboxes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\WorkDriver\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://book.spicejet.com/");
        Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='FamilyAndFriends']")).isSelected());
        System.out.println(driver.findElement(By.cssSelector("input[id*='FamilyAndFriends']")).isSelected()); 
        driver.findElement(By.cssSelector("input[id*='FamilyAndFriends']")).click(); 
        Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='FamilyAndFriends']")).isSelected());
        System.out.println(driver.findElement(By.cssSelector("input[id*='FamilyAndFriends']")).isSelected()); 
        
        //Count the number of checkboxes
        System.out.println(driver.findElements(By.xpath("//input[@type='checkbox']")).size());
        
	}
}