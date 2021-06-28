package Practise;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WorldInfo {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://www.worldometers.info/world-population/");
		
		String xpath_world = "//h1[contains(text(),'Current World Population')]//parent::div//span[@class='rts-counter']";
		String xpath_today = "//div[text()='Today'or text()='This Year']/parent::div//span[@class='rts-counter']";
		String xpath_today_thisyear = "//div[text()='Today'or text()='This year']/parent::div//span[contains(@class,'counter')]";
		
		int count=0;
		while(count<=20) {
			System.out.println("After "+count+" sec");
			System.out.println("*********Current World opulation*********");
		getPopulationCount(xpath_world);
		System.out.println("******Today's & This Year's******");
		//getPopulationCount(xpath_today);
		getPopulationCount(xpath_today_thisyear);
		Thread.sleep(1000);
		count++;
		
		}
	}
	
	public static void getPopulationCount(String locator) {
		
		List<WebElement> worldPopu = driver.findElements(By.xpath(locator));

		for(WebElement e:worldPopu) {
			System.out.println(e.getText());
		}
		
		
	}

}
