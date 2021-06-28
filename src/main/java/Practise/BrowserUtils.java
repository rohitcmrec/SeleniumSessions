package Practise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserUtils {
	
	 WebDriver driver;
	
	public WebDriver initDriver(String browserName)
	{
		System.out.println("The name of browser is "+browserName);
		
		switch(browserName)
		{
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;
			
		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			
		case "edge":
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			
		default :
			System.out.println("please pass the correct browser name");
		}
		
		return driver;
	}
	
	public void launchUrl(String url)
	{
		driver.get(url);
	}
	
	public void quitBrowser()
	{
		driver.quit();
	}
	
	

}
