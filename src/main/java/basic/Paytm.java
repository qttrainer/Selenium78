package basic;

import java.io.File;
import java.io.IOException;
import java.util.List;

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
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Paytm {
	
public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+ "\\src\\main\\resources\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
	    driver.get("https://paytm.com/bus-tickets");
	    
	   
	    
	    driver.findElement(By.xpath("//input[@class = 'fl-input _9KqY'][@data-reactid = '195']")).click();
	    
	    
	    WebElement date = driver.findElement(By.xpath("//div[@class = 'react-datepicker__month']"));
	    
	    List<WebElement> dates = date.findElements(By.className("react-datepicker__day"));
	    
	    for(WebElement elemnet : dates)
	    {
	    	System.out.println(elemnet.getText());
	    	if(elemnet.getText().equals("20"))
	    	{
	    		elemnet.click();
	    		break;
	    	}
	    }
	    
	
	}

}
