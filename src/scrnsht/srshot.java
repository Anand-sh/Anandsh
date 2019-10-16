package scrnsht;

import java.io.File;
import java.io.IOException;


import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class srshot {

	
	public static void main(String[] args) throws IOException {
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\JCPQA\\eclipse-workspace\\Seln\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		TakesScreenshot tk = (TakesScreenshot)driver;
		
		File src = tk.getScreenshotAs(OutputType.FILE);
		
		File des = new File("C:\\Users\\JCPQA\\eclipse-workspace\\Seln\\screenshot\\anand.png");
		
		FileUtils.copyFile(src,des);
		
		
		
		
	}
	
	
}
