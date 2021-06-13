package basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectExample {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:/seleniu_4_5/sekenium/src/main/resources/excutables/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Options options = driver.manage();
		Window window = options.window();
		window.maximize();
		
		driver.findElement(By.xpath("//a[text() = 'Create New Account']")).click();
		
		Thread.sleep(5000L);
		WebElement month = driver.findElement(By.id("month"));
		
		
		Select select = new Select(month);
		
		select.selectByVisibleText("May");
		
		
	List<WebElement> sex = 	driver.findElements(By.name("sex"));
	
	for(WebElement element : sex)
	{
		if(element.getAttribute("value").equals("2"))
		{
			element.click();
		}
		System.out.println(element.getText()  + element.isSelected());
	
		
	}
	
	
	
	
	
	}
}
