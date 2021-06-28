package Practise_others;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DynamicWait {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	driver.get("https://demo.opencart.com/index.php?route=common/home");
	
//	By locator= By.cssSelector("img[title='iPhone'][alt='iPhone']");
//	
//	WebElement iphone_icon = waitByPresenceOfElementLocated(locator, driver, 10);
//	iphone_icon.click();
//	
//	By tv = By.cssSelector("img[title='Apple Cinema 30\"']");
//	WebElement apple_tv = waitByVisibilityOfEement(driver, tv, 10);
//	apple_tv.click();
//	
	Thread.sleep(3000);
	
	driver.findElement(By.cssSelector("div.swiper-button-next")).click();
	WebDriverWait wait = new WebDriverWait(driver,10);
	
	wait.until(ExpectedConditions.alertIsPresent());
	
	
	

	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static WebElement waitByPresenceOfElementLocated(By locator, WebDriver driver, int timeout) {
		WebDriverWait wait = new WebDriverWait(driver,timeout);
		return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	}
	
	public static WebElement waitByVisibilityOfEement(WebDriver driver, By locator, int timeout) {
		WebDriverWait wait = new WebDriverWait(driver,timeout);
		return wait.until(ExpectedConditions.visibilityOf(getElement(locator)));
	}

}
