package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorsConcept {
	
	static WebDriver driver;

	public static void main(String[] args) {
	
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		
		// 1.
//		driver.findElement(By.id("Form_submitForm_FirstName")).sendKeys("rohit");
//		driver.findElement(By.id("Form_submitForm_LastName")).sendKeys("agarwal");
		
		// 2.
		
//		WebElement firstname = driver.findElement(By.id("Form_submitForm_FirstName"));
//		WebElement lastname = driver.findElement(By.id("Form_submitForm_LastName"));
//		
//		firstname.sendKeys("raja");
//		lastname.sendKeys("kumar");
		
		// 3.
		
		By firstname = By.id("Form_submitForm_FirstName");
		By lastname = By.id("Form_submitForm_LastName");
		
//		driver.findElement(firstname).sendKeys("naveen");
//		driver.findElement(lastname).sendKeys("kunteta");
		
		// 4.
		
//		getElement(firstname).sendKeys("naveen");
//		getElement(lastname).sendKeys("kunteta");
//		
		// 5.
		
		doSendkeys(firstname, "rohit");
		
	}
	
	public static WebElement getElement(By locator)
	{
		return driver.findElement(locator);
	}
	
	public static void doSendkeys(By locator,String value)
	{
		getElement(locator).sendKeys(value);
	}

}
