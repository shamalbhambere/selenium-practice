import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class StaticDropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\WorkDriver\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://www.airindia.in/online-booking-faqs.htm");
        Select s=new Select(driver.findElement(By.id("ContentPlaceHolder1_UserLanguage1_drpCountry")));
        s.selectByValue("224");
        s.selectByIndex(2);
        //s.deselectByValue("14");
        s.selectByVisibleText("Australia");
        

	}

}
