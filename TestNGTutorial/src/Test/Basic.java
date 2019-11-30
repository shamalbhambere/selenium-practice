package Test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Basic {
	@AfterMethod
	public void afmethod()
	{
		System.out.println("I will execute after method");
	}
	
@Test(groups= {"Smoke"})
public void seleniumaatext(){
	System.out.println("Hello");
}
@BeforeMethod
public void bfmethod()
{
     System.out.println("I will execute 1st before method");	
}

@AfterSuite
public void afsuite()
{
	System.out.println("BBye");
}
@BeforeTest
public void seleniu() {
	System.out.println("Enjoying");
	
}

@Test(groups= {"Smoke"})
public void Demo(){
	System.out.println("Practice");
}

}
