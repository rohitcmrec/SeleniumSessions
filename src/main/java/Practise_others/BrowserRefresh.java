package Practise_others;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserRefresh {

	public static void main(String[] args) throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	ChromeOptions options = new ChromeOptions();
	options.addArguments("start-maximized");
	options.addArguments("disable-infobars");
	//options.addArguments("incognito");
	WebDriver driver = new ChromeDriver(options);
	
	driver.get("https://www.guru99.com/chrome-options-desiredcapabilities.html");
	Thread.sleep(5000);
	
	//driver.navigate().refresh();
	driver.findElement(By.id("nav-logo-sprites")).sendKeys(Keys.F5);
	

	}

}
