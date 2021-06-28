package Practise_others;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Crousel_BestBuy {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("start-maximized");

		WebDriver driver = new ChromeDriver(options);

		driver.get("https://www.bestbuy.com/?intl=nosplash");

		List<WebElement> itemList = driver.findElements(By.xpath("//div[@class='pl-flex-carousel-slider']//div/div/following-sibling::div//a"));
		Set<String> setList = new HashSet<String>();
		

		while(driver.findElement(By.xpath("(//button[@class='btn-unstyled  isVisible'])[2]")).isDisplayed() ) {
			for(WebElement e:itemList) {
				if(!e.getText().equals(" ") && !e.getText().isEmpty()) {
					setList.add(e.getText());
					
				}
				
			}
			
				if(driver.findElement(By.xpath("(//button[@class='btn-unstyled  isVisible'])[2]")).isEnabled()) {
				driver.findElement(By.xpath("//div[@class='carousel-with-dotd-CaretRight']")).click();
				} else
				{
					break;
				}
				
			
			itemList = driver.findElements(By.xpath("//div[@class='pl-flex-carousel-slider']//div/div/following-sibling::div//a"));
		}
		
		for(String e1:setList) {
			System.out.println(e1);
		}


	}

}
