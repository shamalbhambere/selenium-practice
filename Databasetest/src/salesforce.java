import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class salesforce {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\WorkDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		String host="localhost";
		String port="3306";
		Connection con=DriverManager.getConnection("jdbc:mysql://" + host+ ":" + port + "/salesforce", "root", "Audvik@05");
        Statement s= con.createStatement();
	    ResultSet rs=s.executeQuery("Select * from employee where id=\"1\"");
	    while(rs.next())
	    {
	    driver.get("https://login.salesforce.com/");
	    driver.findElement(By.id("username")).sendKeys(rs.getString("username"));
	    driver.findElement(By.id("password")).sendKeys(rs.getString("password"));
	    driver.findElement(By.xpath("//*[@id='Login']")).click();
	}
	}

}

	
