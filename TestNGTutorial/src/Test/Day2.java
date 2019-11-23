package Test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Day2 {

	@Test(groups= {"Smoke"})
	public void Learn()
	{
		System.out.println("Learning Testng");
	}
@AfterTest
	public void Testing()
{
	System.out.println("WebBrowser testing");
}
  
}
