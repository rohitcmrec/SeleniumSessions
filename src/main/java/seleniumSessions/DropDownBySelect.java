package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownBySelect {
	
	static WebDriver driver;

	public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	 driver = new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
	
//	WebElement indus = driver.findElement(By.id("Form_submitForm_Industry"));
//	
//	Select select = new Select(indus);	
//	
//	//select.selectByIndex(2);
//	
//	//select.selectByValue("health");
//	
//	select.selectByVisibleText("Retail / Wholesale");
	
	By indus = By.id("Form_submitForm_Industry");
	By count = By.id("Form_submitForm_Country");
	
//	doSelectDropDownbyIndex(indus, 3);
	doSelectDropDownbyValue(indus, "Electronics");
	doSelectDropDownbyVisibleText(count, "India");
	
	Select select = new Select(driver.findElement(indus));
	WebElement ele = select.getFirstSelectedOption();
	if(ele.getText().equals("Electronics")) {
		System.out.println("PASSED");
	}
	
	
	

	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static void doSelectDropDownbyVisibleText(By locator, String value) {
		Select select = new Select(getElement(locator));
		select.selectByVisibleText(value);
	}
	
	public static void doSelectDropDownbyValue(By locator, String value) {
		Select select = new Select(getElement(locator));
		select.selectByValue(value);
	}
	
	public static void doSelectDropDownbyIndex(By locator, int index) {
		Select select = new Select(getElement(locator));
		select.selectByIndex(index);
	}

}
