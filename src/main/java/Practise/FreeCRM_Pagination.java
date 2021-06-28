package Practise;

import java.util.ArrayList;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FreeCRM_Pagination {

	static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();

		driver.get("https://classic.freecrm.com/index.html");
		driver.findElement(By.name("username")).sendKeys("groupautomation");
		driver.findElement(By.name("password")).sendKeys("Test@12345");
		driver.findElement(By.xpath("//input[@value='Login']")).click();

		driver.switchTo().frame("mainpanel");
		driver.findElement(By.linkText("CONTACTS")).click();

		List<WebElement> pageList = driver.findElements(By.xpath("(//div[@class='pagination'])[1]/a"));
		List<WebElement> emp = driver.findElements(By.xpath("//a[text()='Tom Google']"));
		int i=0;
		while(true) {

			if(driver.findElements(By.linkText("rohht")).size()==1) {
				driver.findElement(By.xpath("//a[text()='rohht']/parent::td/preceding-sibling::td/input")).click();
				break;
			}
			try {
			
				pageList.get(i).click();
				pageList = driver.findElements(By.xpath("(//div[@class='pagination'])[1]//a"));
			}
			catch(Exception e) {
				System.out.println("no match");
				break;
			}
			i++;
			
		}


	}

}

