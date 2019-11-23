import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tablegrid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\WorkDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.cricbuzz.com/live-cricket-scorecard/20278/afg-vs-wi-match-42-icc-cricket-world-cup-2019");
		WebElement table=driver.findElement(By.cssSelector("div[class='cb-col cb-col-100 cb-ltst-wgt-hdr']"));
       int count= table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).size();
       for(int i=0;i<count-2;i++)
       {
    	   System.out.println( table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).get(i).getText());
       }
       
	   System.out.println(driver.findElement(By.xpath("//div[text()='Extras']/following-sibling::div")).getText());
	  System.out.println(driver.findElement(By.xpath("//div[text()='Total']/following-sibling::div")).getText());
	}

}
