package launchurl;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Draandrp {
	
public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\JCPQA\\eclipse-workspace\\Seln\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.guru99.com/test/drag_drop.html");
		
		WebElement m1 = driver.findElement(By.id("bank"));
		
		WebElement m2 = driver.findElement(By.id("amt7"));
		
		Actions dd = new Actions(driver);
		
		dd.dragAndDrop(m1, m2).perform();

}
}
