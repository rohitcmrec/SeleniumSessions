package seleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserUtils {
	
	WebDriver driver;
	
	/**
	 * this method is used to initialize the driver
	 * and return the driver
	 */
	public WebDriver initDriver(String browserName)
	{
		System.out.println("The name of browser is "+browserName);
		switch (browserName) {
		
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;
			
		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;
			
		case "edge":
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			break;
			
		default:
			System.out.println("Please pass the right browser name");
			break;
		}
		
		return driver;
	}
	
	public void launchUrl(String url)
	{	
		if(url==" ") return;
		if (url==null) return;
		if(url.isEmpty()) return ;
		driver.get(url);
	}
	
	public String getPageTitle()
	{
		return driver.getTitle();
	}
	
	public String getPageUrl()
	{
		return driver.getCurrentUrl();
	}
	
	public void closeBrowser()
	{
		driver.close();
	}
	
	public void quitBrowser()
	{
		driver.quit();
	}

}
