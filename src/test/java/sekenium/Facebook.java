package sekenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Facebook {
	
	WebDriver driver; 
	
	TestData data;
	
	public void start()
	{
		data = new TestData();
	}
	
	@Test(priority = 1)
	public void VerifyApplicationOPening()
	{
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\chrome\\chromedriver.exe");
		 driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		Options options = driver.manage();
		Window window = options.window();
		window.maximize();
	}
	
	@Test(priority=2)
	public void VerifyUserISAbleToNavigateGmail()
	{
		driver.findElement(By.xpath("//a[text() = 'Gmail']")).click();;
		
		String title =  driver.getTitle();
		
		Assert.assertEquals(title, "Gmail - Email from Googles");
	}


}
