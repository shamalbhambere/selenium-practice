import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TraverseBackToParentxpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       System.setProperty("webdriver.chrome.driver", "C:\\WorkDriver\\chromedriver_win32\\chromedriver.exe");
       WebDriver driver=new ChromeDriver();
       driver.get("http://www.qaclickacademy.com/interview.php");
       driver.findElement(By.xpath("//*[@id='tablist1-tab4']")).click();
        driver.findElement(By.xpath("//*[@id='tablist1-tab4']/preceding-sibling::li[1]")).click();
       driver.findElement(By.xpath("//*[@id='tablist1-tab4']/preceding-sibling::li[2]")).click();
       driver.findElement(By.xpath("//*[@id='tablist1-tab4']/preceding-sibling::li[3]")).click();
       System.out.println(driver.findElement(By.xpath("//*[@id='tablist1-tab2']/parent::ul")).getAttribute("role"));
       
       
	}

}
