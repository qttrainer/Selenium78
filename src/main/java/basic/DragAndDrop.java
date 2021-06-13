package basic;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DragAndDrop {
	
	//https://the-internet.herokuapp.com/drag_and_drop
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:/seleniu_4_5/sekenium/src/main/resources/browser/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
	
		driver.get("https://the-internet.herokuapp.com/drag_and_drop");
		
		driver.manage().window().maximize();
		
		/*
		Actions actions = new Actions(driver);
		
		Thread.sleep(5000L);//5sec
		
		//implicit wait -- once, and applicable in complete project , with the driver declaration 
		//explicit wait -- on a particular web element 
		//fluent wait -- on particular webElement 
		
		WebDriverWait wait = new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("abc")));
		
		Wait wait = new FluentWait(driver).withTimeout(Duration.ofMinutes(20)).pollingEvery(Duration.ofMinutes(1)).ignoring(NoSuchElementException.class);
		
		WebElement from = driver.findElement(By.id("column-a"));

		WebElement to = driver.findElement(By.id("column-b"));
	//	actions.moveToElement().clickAndHold().moveToElement(to).release().build().perform();
		
		actions.dragAndDropBy(from, 15,15).build().perform();
	
*/		

		
		
		


		
		
//	//
	}

}
