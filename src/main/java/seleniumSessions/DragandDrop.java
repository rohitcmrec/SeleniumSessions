package seleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragandDrop {
	
	static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("http://demo.guru99.com/test/drag_drop.html");
		
		By locator_src = By.xpath("(//a[@class='button button-orange'])[4]");
		By locator_trg = By.xpath("(//li[@class='placeholder'])[2]");
		
		doDragDrop(driver, locator_src, locator_trg);
	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static void doDragDrop(WebDriver driver, By locator_src, By locator_trg){
		Actions action = new Actions(driver);
		action.clickAndHold(getElement(locator_src)).moveToElement(getElement(locator_trg)).release().build().perform();
	}

}
