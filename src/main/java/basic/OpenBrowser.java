package basic;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class OpenBrowser {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\workspace\\seleniu_4_5\\sekenium\\src\\main\\resources\\browser\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		Options options = driver.manage();
		Window window = options.window();
		window.maximize();
		TakesScreenshot takeScreenshoot = (TakesScreenshot)driver;
		File screen = takeScreenshoot.getScreenshotAs(OutputType.FILE);
		
		File destination = new File("E:\\google.png");
		
		
		
		
	
	
	}
	

}
