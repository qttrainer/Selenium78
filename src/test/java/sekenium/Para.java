package sekenium;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Para {

	@Test
	@Parameters({"message"})
	public void show(@Optional ("From Optional" ) String message)
	{
		
		System.out.println(message);
	}
}
