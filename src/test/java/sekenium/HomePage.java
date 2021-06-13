package sekenium;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



public class HomePage {
	
	
	@BeforeMethod
	public void RefreshPage()
	{
		System.out.println("Page referseh done");
		
	}
	
	@Test
	public void openApplication()
	{
		System.out.println("Open Application");
		
		Assert.assertEquals("Actual", "Expected");
		
	}
	
	@Test (groups= {"sanity"})
	public void doLogin()
	{
		System.out.println("Login Done");
	}
	
	@Test (groups= {"sanity"})
	public void doRegistration()
	{
		System.out.println("Registration done");
	}

}


