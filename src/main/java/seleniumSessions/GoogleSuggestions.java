package seleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleSuggestions {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		
		driver.findElement(By.name("q")).sendKeys("naveen automa");
		Thread.sleep(4000);
		
		List<WebElement> ele = driver.findElements(By.xpath("//ul[@class='erkvQe']//div[contains(@class,'wM6W7d')]//span"));
		for(WebElement e:ele) {
			System.out.println(e.getText());
			if(e.getText().equals("naveen automation labs appium")) {
				e.click();
			}
		}
	}

}
