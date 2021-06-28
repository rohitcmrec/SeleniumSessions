package seleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DynamicXpath {
	
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
	
	
	
	String xpath = "//a[contains(text(),'Rocky Jon')]/parent::td/following-sibling::td/a[contains(@href,'mailto')]";
	WebElement mail = driver.findElement(By.xpath(xpath));
	System.out.println(mail.getText());
	
	System.out.println(getMailId("Lisa"));
	System.out.println(getMailId("Jackson"));
	
	
	
	}
	
	public static String getMailId(String name) {
		String xpath = "//a[contains(text(),'"+name+"')]/parent::td/following-sibling::td/a[contains(@href,'mailto')]";
		return driver.findElement(By.xpath(xpath)).getText();
	}
	

}
