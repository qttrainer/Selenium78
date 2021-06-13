package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationExample {
	
	
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:/seleniu_4_5/sekenium/src/main/resources/excutables/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		Options options = driver.manage();
		Window window = options.window();
		window.maximize();
		
		
		driver.findElement(By.xpath("//a[text() = 'Images']")).click();
		
		driver.findElement(By.xpath("//a[text() = 'Sign in']")).click();
		
		
		driver.navigate().back();
		
		driver.navigate().forward();
		
		driver.navigate().refresh();
		
		
		driver.findElement(By.xpath("//a[text() = 'Help']")).click();
		
		Thread.sleep(10000L);
		
		
		driver.findElement(By.xpath("//a[text() = 'Community']")).click();
	}

}
