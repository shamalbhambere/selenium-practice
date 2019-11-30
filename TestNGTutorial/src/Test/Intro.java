package Test;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Intro {

	@Test
	public void Testngex()
	{
		System.out.println("Testing Example");
	
	}
    @BeforeSuite
    public void day1()
    {
    	System.out.println("day1 task");
    }
}
