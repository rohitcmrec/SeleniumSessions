package Practise;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NoonPagination {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://www.noon.com/uae-en/");

		Thread.sleep(10000);
		getSectionList("Trending deals");


	}
	public static void getSectionList(String name) {

		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		WebElement eleName = driver.findElement(By.xpath("//h3[contains(text(),'"+name+"')]"));
		js.executeScript("arguments[0].scrollIntoView(true);", eleName);

		List<WebElement> itemList = driver.findElements(By.xpath("//h3[contains(text(),'"+name+"')]/parent::div/parent::div/following-sibling::div//div[@class='kcs0h5-0 diNcmV grid']"));

		for(WebElement e:itemList) {

			System.out.println(e.getAttribute("title"));
		}


	}

}
