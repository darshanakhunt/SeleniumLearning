package TestNGTEst;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import org.testng.annotations.Test;

public class TestNGBasic {

	@BeforeTest
	public void setup()
	{
		System.out.println("first");
	}
	
	
	
	@Test
	public void test1()
	{
		System.out.println("1");
	}

	
	@AfterTest
	public void teardown()
	{
		System.out.println("last");
	}
}
