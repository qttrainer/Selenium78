package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

import javafx.scene.control.Alert;

public class AlertExample {
	
	//https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:/seleniu_4_5/sekenium/src/main/resources/browser/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
		Options options = driver.manage();
		Window window = options.window();
		window.maximize();
		
		//<iframe frameborder="0" id="iframeResult" name="iframeResult" allowfullscreen="true"></iframe>
		
		
		
		Thread.sleep(6000L);
		
		
		driver.switchTo().frame("iframeResult");
		
	// to move control to main page
		//driver.switchTo().defaultContent();
		
		driver.findElement(By.xpath("//button[text() = 'Try it']")).click();
		
		System.out.println(driver.switchTo().alert().getText());
		
		driver.switchTo().alert().accept();
		
		
		//driver.switchTo().alert().sendKeys("Write in a alert");

		
	}

}
