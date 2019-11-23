import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

/*
1.Select any checkbox
2.Grab the label of selected checkbox
3.select an option in dropdown.here option to select should come from step2
4.enter the step2 grabbed label text in editbox
5.click alert and then verifyif text grabbed from step2 is present in the popup message 
 */
public class Assignment6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\WorkDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.qaclickacademy.com/practice.php");
		driver.findElement(By.id("checkBoxOption2")).click();
		String op=driver.findElement(By.xpath("//*[@id='checkbox-example']/fieldset/label[2]")).getText();
		WebElement drp= driver.findElement(By.id("dropdown-class-example"));
		Select opt=new Select(drp);
		opt.selectByVisibleText(op);
		driver.findElement(By.id("name")).sendKeys(op);
		driver.findElement(By.id("alertbtn")).click();
		String message=driver.switchTo().alert().getText();
		if(message.contains(op))
		{
		
		
		    System.out.println("Text is Present in the pop-up message");
		}
		else
		{

		    System.out.println("Text is not Present in the pop-up message");
	
		}
	}
}
