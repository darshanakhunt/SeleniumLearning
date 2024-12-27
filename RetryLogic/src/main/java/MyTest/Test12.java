package MyTest;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.Assert;

public class Test12 {
	
	@Test
	public void Test1()
	{
		AssertJUnit.assertEquals(false, true);
	}


	@Test
	public void Test2()
	{
		Assert.assertEquals(false, true);
	}

}
