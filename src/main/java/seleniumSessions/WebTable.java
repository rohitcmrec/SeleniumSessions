package seleniumSessions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTable {

	static WebDriver driver;

	public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	driver.get("https://classic.freecrm.com/index.html");
	
	driver.findElement(By.name("username")).sendKeys("rohitcmrec");
	driver.findElement(By.name("password")).sendKeys("Qa@123456");
	driver.findElement(By.xpath("//input[@value='Login']")).click();
	
	driver.switchTo().frame("mainpanel");
	driver.findElement(By.xpath("//a[contains(text(),'Contacts')]")).click();
	clickCompanyEmployee("Apple");
	
	

	}
	
	public static void clickCompanyEmployee( String companyName) {
		String companyXpath = "//a[contains(text(),'"+companyName+"')]/parent::td/preceding-sibling::td/input[@type='checkbox']";
		List<WebElement> checkBoxList = driver.findElements(By.xpath(companyXpath));
		
		for(WebElement e :checkBoxList) {
			e.click();
		}
	}

}
