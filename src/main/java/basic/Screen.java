package basic;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Screen {
	
public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+ "\\src\\main\\resources\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
	    driver.get("https://www.flipkart.com/?ef_id=efae1bbe17e2152267a87b357402085d:G:s&s_kwcid=AL!739!10!76347481385536!76347484024120&semcmpid=sem_F1167BY7_Brand_adcenter");
	    
	   
	    
	    driver.findElement(By.xpath("//html[1]/body[1]/div[2]/div[1]/div[1]/button[1]")).click();
	    System.out.println(driver.manage().window().getSize());
	    
	    Dimension dm = new Dimension(450,630);
	    
	    driver.manage().window().setSize(dm);
	    
	    WebDriverWait wait = new WebDriverWait(driver,20);
	    JavascriptExecutor javascriptexecutor= (JavascriptExecutor)driver;
	    javascriptexecutor.executeScript("window.scrollBy(200,0)");  //scroll horizontally in the right direction
	    
	  //  javascriptexecutor.executeScript("window.scrollBy(-2000,0)"); //scroll horizontally in the left direction
	    
	    //javascriptexecutor.executeScript("window.scrollBy(200,300)");//scroll at a particular coordinate
	    
	//    javascriptexecutor.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	//    javascriptexecutor.executeScript("window.scrollTo(document.body.scrollHeight,0)");//scroll up in a vertical direction,
	    
		/*
		 * driver.get("https://www.google.com/"); Options options = driver.manage();
		 * Window window = options.window(); window.maximize(); TakesScreenshot
		 * takeScreenshoot = (TakesScreenshot)driver; File screen =
		 * takeScreenshoot.getScreenshotAs(OutputType.FILE);
		 * 
		 * File destination = new File("E:\\google.png");
		 * 
		 * FileUtils.copyFile(screen, destination);
		 * 
		 * driver.findElement(By.xpath("//a[text() = 'Gmail']")).click();
		 * 
		 * JavascriptExecutor javascriptExecutor = (JavascriptExecutor)driver;
		 * 
		 * javascriptExecutor.executeScript(
		 * "window.scrollTo(0,document.body.scrollHeight)");
		 * 
		 * driver.navigate().back();
		 * 
		 * driver.navigate().refresh();
		 * 
		 * driver.navigate().forward();
		 */
		
	
	
	}

}
