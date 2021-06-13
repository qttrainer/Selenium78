package sekenium;

import java.lang.reflect.Method;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Data { 
	
	@DataProvider (name = "dataprovider" )
	public Object[][] dp(Method m)
	{
		switch(m.getName())
		{
		case "add":
		return new Object[][] {{4,5}, {6,9}};
		case "sub":
			return new Object[][] {{4,-5}, {6,-9}};
		}
		return null;
		}
	
	
	
	
	
	@Test(dataProvider = "dataprovider")
	public void add(int a, int b)
	{
		
		System.out.println(a+b);
		
	}
	
	
	@Test(dataProvider = "dataprovider")
	public void sub(int a , int b)
	{
		System.out.println(a-b);
	}

}
