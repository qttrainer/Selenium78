package sekenium;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(TestListners.class)
 class TestPage {
	
	
	@Test
	public  void verify()
	{
		
		boolean expected = true;
		
		Assert.assertEquals(expected, true);
		
		
	}

}
