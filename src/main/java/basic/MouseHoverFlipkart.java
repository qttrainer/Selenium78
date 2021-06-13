package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverFlipkart {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:/seleniu_4_5/sekenium/src/main/resources/browser/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		String pId = driver.getWindowHandle();
		System.out.println("base id : " +pId);
		driver.get("https://www.flipkart.com/");
		Options options = driver.manage();
		Window window = options.window();
		window.maximize();
		
		driver.findElement(By.xpath("//button[text() = '✕']")).click();
		
		Actions actions = new Actions(driver);
		
		
		WebElement electro = driver.findElement(By.xpath("//div[text() = 'Electronics']"));
		
		
		actions.moveToElement(electro).build().perform();
		
		Thread.sleep(5000L);
		
		WebElement cp = driver.findElement(By.xpath("//a[text() = 'Computer Peripherals']"));
		
	//	actions.contextClick(cp).build().perform();
		
	//	actions.doubleClick(cp).build().perform();
		
		cp.click();
		
		
		driver.manage().window().setPosition(new Point(-500, 0));
		
		

	}

}
