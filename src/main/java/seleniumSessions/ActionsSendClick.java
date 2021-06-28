package seleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionsSendClick {

	static WebDriver driver;
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		
		driver.get("https://demo.opencart.com/index.php?route=account/login");
		
//		WebElement username = driver.findElement(By.id("input-email"));
//		WebElement password = driver.findElement(By.id("input-password"));
//		WebElement login = driver.findElement(By.xpath("//input[@type='submit']"));
//		
//		Actions action = new Actions(driver);
//		action.sendKeys(username, "rohit@nacho.com").perform();
//		action.sendKeys(password, "password").perform();
//		action.click(login).perform();
		
		By usr = By.id("input-email");
		By pwd = By.id("input-password");
		By login = By.xpath("//input[@type='submit']");
		
		doActionSend(driver, usr,"rohit@gmail.com");
		doActionSend(driver, pwd, "test1234");
		doActionClick(driver, login);
		

	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static void doActionSend(WebDriver driver, By locator, String value) {
		Actions action = new Actions(driver);
		action.sendKeys(getElement(locator), value).perform();
	}
	
	public static void doActionClick(WebDriver driver, By locator) {
		Actions action = new Actions(driver);
		action.click(getElement(locator)).perform();
	}

}
