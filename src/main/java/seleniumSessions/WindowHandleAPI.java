package seleniumSessions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandleAPI {

	public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	driver.get("https://demo.opencart.com/index.php?route=account/register");
	String parentid = driver.getWindowHandle();
	
	String tab = Keys.chord(Keys.CONTROL,Keys.ENTER);
	driver.findElement(By.xpath("(//a[contains(text(),'Login')])[2]")).sendKeys(tab);
	
	Set<String> handles = driver.getWindowHandles();
	
	Iterator<String> it = handles.iterator();
	
	while(it.hasNext()) {
		String handle = it.next();
		if(!handle.equals(parentid)) {
			driver.switchTo().window(handle);
			if(driver.getTitle().equals("Account Login")) {
				System.out.println("child winodw TC PASSED");
				driver.close();
			}
		}
	}
	driver.switchTo().window(parentid);
	if(driver.getTitle().equals("Register Account")) {
		System.out.println("Parent window TC PASSED");
		driver.quit();
	}
	

	}

}
