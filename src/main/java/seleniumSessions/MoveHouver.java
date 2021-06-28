package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MoveHouver {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("http://demo.automationtesting.in/Register.html");
		
		Thread.sleep(10000);
		
//		WebElement ele = driver.findElement(By.xpath("//a[text()='Interactions ']"));
		
		By hover = By.xpath("//a[text()='Interactions ']");
		
		doMoveToElement(driver,hover);
		

		
		
	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static void doMoveToElement(WebDriver driver,By locator) {
		Actions action = new Actions(driver);
		action.moveToElement(getElement(locator)).perform();
		
	}

}
