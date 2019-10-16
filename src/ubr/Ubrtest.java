package ubr;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Ubrtest {

	
	
	public static void main(String[] args) throws InterruptedException  {
		
     System.setProperty("webdriver.chrome.driver", "C:\\Users\\JCPQA\\eclipse-workspace\\Seln\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://uber-checker.netlify.com/login");
		
		
		
		WebElement m1 = driver.findElement(By.id("username"));
		m1.sendKeys("anand@yopmail.com");
		
		WebElement m2 = driver.findElement(By.id("password"));
		
		m2.sendKeys("Anand789@");
		
//		WebElement m3 = driver.findElement(By.id("select-entryType"));
//		m3.click();
		
		Select dropdown = new Select(driver.findElement(By.id("select-entryType")));  
		dropdown.selectByIndex(2);
		dropdown.selectByVisibleText("Entry");
		
//		WebElement m6 = driver.findElement(By.id("(//span[@class='MuiTouchRipple-root'])[2]"));
//		m6.click();
//		

		
		
		
		
	
		
		
		
		
}
}
