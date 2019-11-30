package Test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Carloan {

	@BeforeClass
	public void bfclass()
	{
		System.out.println("I am first in class");
	}
	@Test
	public void webCarLogin()
	{
		System.out.println("Web login for car loan");
	}
	@Test
	public void MobileCarLogin()
	{
		System.out.println("mobile login for car loan");
	}
	@Test
	public void APICarLogin()
	{
		System.out.println("APIlogin for car loan");
	}
	@AfterClass
	public void afclass()
	{
		System.out.println(" i am last in class");
	}
}
