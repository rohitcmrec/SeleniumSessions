package Practise_others;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenCart {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://demo.opencart.com/index.php?route=account/login");
		
		List<WebElement>lists = driver.findElements(By.xpath("//ul[@class='list-inline']//li"));
		
		for(int i=0;i<lists.size();i++) {
			System.out.println(lists.get(i).getText());
		}

	}

}
