package seleniumSessions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DynamiXpath2 {
	
	static WebDriver driver;

	public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
//	driver.get("https://www.espncricinfo.com/series/bangladesh-in-sri-lanka-2019-1193502/sri-lanka-vs-bangladesh-1st-odi-1193504/full-scorecard");
//	
//	String xpath = "//a[contains(text(),'Avishka')]/parent::td/following-sibling::td/span[@class='cursor-pointer']";
//	
//	System.out.println(driver.findElement(By.xpath(xpath)).getText());
	
	
	driver.get("https://demoqa.com/webtables");
	rowList("Cierra");
	rowList("Alden");
	rowList("Kierra");
	
	
	}
	
	public static void rowList(String name) {
		String xpath = "//div[contains(text(),'"+name+"')]/following-sibling::div";
		
		List<WebElement> row= driver.findElements(By.xpath(xpath));
		for(WebElement e:row) {
			
			System.out.print(e.getText()+" ");
			
		}
		System.out.println("");
	}

}
