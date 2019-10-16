package scroll;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrll {
	
	public static void main(String[] args) throws InterruptedException{
		
	     System.setProperty("webdriver.chrome.driver", "C:\\Users\\JCPQA\\eclipse-workspace\\Seln\\driver\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.get("https://www.facebook.com/");
			

			
			WebElement m1 = driver.findElement(By.xpath("//*[text()='Games']"));
			
			WebElement m2 = driver.findElement(By.id("email"));
			
			JavascriptExecutor js = (JavascriptExecutor)driver;

			js.executeScript("argument[0].scrollIntoView(true)","Games");

			Thread.sleep(3000);

			js.executeScript("argument[0].scrollIntoView(false)","email");
			
			
			
			

}
}
