import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindBrokenLinkedAndImages {

	public static void main(String[] args) throws MalformedURLException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\WorkDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");

		// get all a and img tag
		List<WebElement> linkedList = driver.findElements(By.tagName("a"));
		linkedList.addAll(driver.findElements(By.tagName("img")));

		System.out.println("All the links and images " + linkedList.size());

		List<WebElement> activeLinks = new ArrayList<WebElement>();

		// get active link with href
		for (int i = 0; i < linkedList.size(); i++) {
			if (linkedList.get(i).getAttribute("href") != null
					&& (!linkedList.get(i).getAttribute("href").contains("javascript"))) {
				activeLinks.add(linkedList.get(i));
			}
			
			//get size of active links
			System.out.println("Size of active links and images "+activeLinks.size());
			
			//check href URL with HttpURLConnection
			for(int j=0; j<activeLinks.size(); j++) {
			HttpURLConnection connection = (HttpURLConnection) new URL(activeLinks.get(j).getAttribute("href")).openConnection();
			connection.connect();
			String response = connection.getResponseMessage();
			connection.disconnect();
            System.out.println(activeLinks.get(j).getAttribute("href") + "-->" +response);
		}

	}

}
}