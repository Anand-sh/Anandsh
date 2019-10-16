package launchurl;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;

public class UrlLaunch {
	
	public static void main(String[] args) {
		
		//Chrome browser
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\JCPQA\\eclipse-workspace\\Seln\\driver\\chromedriver.exe");
	
		WebDriver driver = new ChromeDriver();
		
		//Firefox
		
//		System.setProperty("webdriver.gecko.driver", "C:\\Users\\JCPQA\\eclipse-workspace\\Seln\\driver\\geckodriver.exe");
	
//	    WebDriver driver = new FirefoxDriver();
		
		//IE Browser
		
//		System.setProperty("webdriver.ie.driver", "C:\\Users\\JCPQA\\eclipse-workspace\\Seln\\driver\\IEDriverServer.exe");
	
//		WebDriver driver = new InternetExplorerDriver();
		
		driver.get("http://greenstech.in/selenium-course-content.html");
		
		WebElement mov1 = driver.findElement(By.xpath("//a[text()='COURSES']"));
		
		Actions m1 = new Actions(driver);
		
		m1.moveToElement(mov1).perform();
		
		WebElement mov2 = driver.findElement(By.xpath("//span[text()='Data Warehousing Training']"));
		
		m1.moveToElement(mov2).perform();
		
		WebElement mov3 = driver.findElement(By.xpath("//span[text()='Oracle SQL Training']"));
		m1.click();
		
		driver.quit();
		
	}
	
	

}
