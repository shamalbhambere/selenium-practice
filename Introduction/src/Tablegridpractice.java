import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tablegridpractice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		int sum = 0;

		System.setProperty("webdriver.chrome.driver", "C:\\WorkDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.get("https://www.cricbuzz.com/live-cricket-scorecard/20277/eng-vs-nz-match-41-icc-cricket-world-cup-2019");
		WebElement table = driver.findElement(By.cssSelector("div[class='cb-col cb-col-100 cb-ltst-wgt-hdr']"));
		int count = table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).size();
		for (int i = 0; i < count-2;i++) {
			String value = table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).get(i).getText();
			int tablevalue = Integer.parseInt(value);
			sum = sum + tablevalue;
		}
		Thread.sleep(1000);
		// System.out.println(sum);
		String extrasvalue = driver.findElement(By.xpath("//div[@class='cb-col cb-col-60']/following-sibling::div"))
				.getText();
		int extrasval = Integer.parseInt(extrasvalue);
		// System.out.println(extrasval);
		int Totalsumval = sum + extrasval;
		String totalval = driver.findElement(By.xpath("//div[text()='Total']/following-sibling::div")).getText();
		int totalvalue = Integer.parseInt(totalval);
		if (totalvalue == Totalsumval) {
			System.out.println("Test passed");

		} else {
			System.out.println("Test failed");
		}
	}

}
