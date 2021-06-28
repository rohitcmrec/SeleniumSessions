package Practise;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StaleElement_Frshworks_Solution {

	public static void main(String[] args) throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://www.freshworks.com/");
	
	List<WebElement> footerLinks = driver.findElements(By.xpath("(//ul[@class='footer-nav'])[2]//a"));
	
//	for(WebElement e:footerLinks) {
//		e.click();
//		driver.navigate().back();
//		footerLinks = driver.findElements(By.xpath("(//ul[@class='footer-nav'])[2]//a"));
//	}
	
	for(int i=0;i<footerLinks.size();i++) {
		footerLinks.get(i).click();
		driver.navigate().back();
		footerLinks = driver.findElements(By.xpath("(//ul[@class='footer-nav'])[2]//a"));
	}

	}

}
