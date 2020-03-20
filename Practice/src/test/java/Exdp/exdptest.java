package Exdp;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import PageObject.Text1;
import PageObject.comments;
import PageObject.dropdown1;
import PageObject.dropdown2;
import PageObject.dropdown3;
import junit.framework.Assert;


public class exdptest {
	public static Logger log =LogManager.getLogger(exdptest.class.getName());
	
	String action = "2";
	String symbol = "am";
	String qty = "1";
	String price = "10.00";
	String stopPrice = "20.00";
	String type = "2";
	String tif = "3";
	String comment = "Test";

	public static WebDriver driver;

	public exdptest(WebDriver _driver) {
		driver = _driver;
	}

	public exdptest(WebDriver _driver, String action, String symbol, String qty, String price, String stopPrice,
			String type, String tif, String comment) {
		driver = _driver;
		this.action = action;
		this.symbol = symbol;
		this.qty = qty;
		this.price = price;
		this.stopPrice = stopPrice;
		this.type = type;
		this.tif = tif;
		this.comment = comment;

	}

	public void setInputData() throws InterruptedException {
		this.Staticdropdown1();
		this.Textinput();
		this.dynamicdropdown();
		this.dynadropdowm();
		this.checkqant();
		this.CheckpriceField();
		this.checkstopprice();
		this.comm();
	}

	public void submitForm() {
		this.button();
	}

	public void Staticdropdown1() throws InterruptedException {
		dropdown1 sd = new dropdown1(driver);
		sd.clickdrop("exdp-entry-form_action").click();
		String controlID = driver.findElement(By.xpath("//*[@id='exdp-entry-form_action']/div"))
				.getAttribute("aria-controls");
		log.info("Get the path of first dropdown");
		//System.out.println(controlID);
		sd.getdrop(controlID, this.action).click();
		log.info("Clicked on first dropdown");
	}

	public void Textinput() {
		Text1 t1 = new Text1(driver);
		t1.getText().click();
		log.info("Clicked on Textinput");
		t1.getText().sendKeys(this.symbol);
		t1.getText().sendKeys(Keys.ARROW_DOWN);

		t1.getText().sendKeys(Keys.ENTER);
		log.info("Entered data in Textinput field successfully");
	}

	public void dynamicdropdown() throws InterruptedException {
		dropdown2 sd = new dropdown2(driver);
		sd.clickdrop("exdp-entry-form_type").click();
		String controlID = driver.findElement(By.xpath("//*[@id='exdp-entry-form_type']/div"))
				.getAttribute("aria-controls");
		log.info("Get the path of second dropdown");
		//System.out.println(controlID);
		sd.getdrop(controlID, this.type).click();
		log.info("Clicked on second dropdown");

	}

	public void dynadropdowm() throws InterruptedException {
		dropdown3 sd = new dropdown3(driver);
		sd.clickdrop("exdp-entry-form_tif").click();
		String controlID = driver.findElement(By.xpath("//*[@id='exdp-entry-form_tif']/div"))
				.getAttribute("aria-controls");
		log.info("Get the path of Third dropdown");
		//System.out.println(controlID);
		sd.getdrop(controlID, this.tif).click();
		log.info("Clicked on Third dropdown");
	}

	public void CheckpriceField() {
		WebElement price = driver.findElement(By.id("exdp-entry-form_price"));
		price.sendKeys(this.price);
		String pr = price.getAttribute("value");
		float prc = Float.parseFloat(pr);
		//System.out.println(prc);
		log.info("Price field inserted");
		AssertDecimal(prc);
	}

	private void AssertDecimal(float prc) {
		// TODO Auto-generated method stub
		if ((prc - (int) prc) != 0)
			System.out.println("decimal value is there");
		    //log.info("Decimal value inserted");
		else
			System.out.println("decimal value is not there");

	}

	public void checkstopprice() {
		WebElement stprice = driver.findElement(By.id("exdp-entry-form_stop_price"));
		stprice.sendKeys(this.stopPrice);
		String sp = stprice.getAttribute("value");
		float prc = Float.parseFloat(sp);
		log.info("Stop price field inserted");
		//System.out.println(prc);
		AssertDecimal(prc);

	}

	public void checkqant() {
		WebElement abc = driver.findElement(By.id("exdp-entry-form_quantity"));
		abc.sendKeys(this.qty);
		String x = abc.getAttribute("value");
		int qa = Integer.parseInt(x);
		log.info("qty field inserted");
		//System.out.println("Quantity is:" + qa);
		AssertThan(qa);

	}

	public void comm() {
		comments c = new comments(driver);
		c.commt().click();
		c.commt().sendKeys(this.comment);
	}

	public void button() {
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		log.info("Click on submit button");
	}

	public void tabledata() throws ParseException {
		// Date formats
		SimpleDateFormat sdfLong = new SimpleDateFormat("EEE MMM dd yyyy hh:mm:ss", Locale.US);
		SimpleDateFormat sdfShort = new SimpleDateFormat("MM/dd/yy hh:mma");
		// Find all dates in updated on column
		List<WebElement> rows = driver.findElements(By.cssSelector("div[col-id='updatedOn'].ag-cell"));
		// Get all dates in ArrayList of Date
		ArrayList<Date> dates = new ArrayList<Date>();
		for (int i = 0; i < rows.size(); i++) {
			WebElement row = rows.get(i);
			dates.add(sdfLong.parse(row.getText()));
		}
		// Sort date by descending order
		Collections.sort(dates, Collections.reverseOrder());
		// Get the top date/ largest date in common format
		Date largestDate = sdfShort.parse(sdfShort.format(dates.get(0)));
		// Find Last updated text
		String[] TextDate = driver
				.findElement(By.xpath("//*[@id='root']/section/div/div/main/div/div/div/div[3]/header/div/div[2]/span"))
				.getText().split(":", 2);
		String Dates = TextDate[1];
		Date lastUpdatedDate = sdfShort.parse(Dates);
		// Compare date for equality
		ValidateDate(largestDate, lastUpdatedDate);
	}

	private void ValidateDate(Date d1, Date d2) {
		Assert.assertEquals(d1, d2);
	}

	private void AssertThan(int qa) {
		// TODO Auto-generated method stub
		// if (assertComparableNullSafe(qa, "less than")) {
		if (qa < 1) {
			System.out.println("Enter correct qantity");
		} else if (qa > 999) {
			System.out.println("Qantity is outof boundary");
		} else {
			System.out.println("Qantity is successfully pass");
		}

	}

}