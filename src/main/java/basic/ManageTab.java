package basic;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class ManageTab {
	
	public static void main(String[] args) throws InterruptedException {
		//
		
		System.setProperty("webdriver.chrome.driver", "E:/seleniu_4_5/sekenium/src/main/resources/browser/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		String pId = driver.getWindowHandle();
		System.out.println("base id : " +pId);
		driver.get("https://about.google/products/");
		Options options = driver.manage();
		Window window = options.window();
		window.maximize();
	//
		
		driver.findElement(By.xpath("//em[text() = 'Covid-19 information & resources from Google']")).click();
		
		
		
	//	
		
		
		Set<String> windows =driver.getWindowHandles();
		
		for(String tab : windows)
		{
			if(tab!=pId)
				driver.switchTo().window(tab);
			System.out.println(tab);
		}
		
		Thread.sleep(10000L);
		driver.findElement(By.xpath("//span[text() = 'Educators']")).click();
	}
	
	
	

}
