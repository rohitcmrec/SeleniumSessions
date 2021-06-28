package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseHover2 {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
	
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.spicejet.com/");
		
		By locator_parent =By.id("ctl00_HyperLinkLogin"); 
		By locator_child = By.xpath("//a[@href='javascript:void();']");
		
		doMoveToElement(driver, locator_parent, locator_child);
		
		

	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static void doMoveToElement(WebDriver driver,By locator_parent, By locator_child ) throws InterruptedException {
		Actions action = new Actions(driver);
		action.moveToElement(getElement(locator_parent)).perform();
		Thread.sleep(3000);
		action.moveToElement(getElement(locator_child)).perform();
	}

}
