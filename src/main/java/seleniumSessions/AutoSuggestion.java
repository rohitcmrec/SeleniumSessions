package seleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoSuggestion {

	public static void main(String[] args) throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	driver.get("http://automationpractice.com/index.php");
	
	driver.findElement(By.id("search_query_top")).sendKeys("dress");
	Thread.sleep(4000);
	
	List<WebElement> optionList = driver.findElements(By.xpath("//div[@class='ac_results']//li"));
	System.out.println(optionList.size());
	
	for(WebElement e:optionList) {
		System.out.println(e.getText());
		if(e.getText().contains("Summer Dresses > Printed Chiffon ")) {
			e.click();
			break;
		}
	}
	
	System.out.println(driver.findElement(By.xpath("//h1[@itemprop='name']")).getText());
	
	if(driver.findElement(By.xpath("//h1[@itemprop='name']")).getText().contains("Printed Summer Dress")) {
		System.out.println("PASSED");
	}
	else
		System.out.println("FAILED");

	}

}
