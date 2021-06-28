package Practise_others;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class test {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("start-maximized");

		WebDriver driver = new ChromeDriver(options);

		driver.get("https://www.bestbuy.com/?intl=nosplash");
		
		driver.findElement(By.xpath("(//button[@class='btn-unstyled  isVisible'])[2]")).click();
		driver.findElement(By.xpath("(//button[@class='btn-unstyled  isVisible'])[2]")).click();
		driver.findElement(By.xpath("(//button[@class='btn-unstyled  isVisible'])[2]")).click();
		driver.findElement(By.xpath("(//button[@class='btn-unstyled  isVisible'])[2]")).click();
		boolean status =driver.findElement(By.xpath("(//button[@class='btn-unstyled  isVisible'])[2]")).isEnabled();
		System.out.println(status);
		boolean dis = driver.findElement(By.xpath("//div[@class='carousel-with-dotd-CaretRight']")).isDisplayed();
		System.out.println(dis);
		System.out.println(driver.findElement(By.xpath("(//button[@class='btn-unstyled  isVisible'])[2]")).getAttribute("disabled"));

	}

}
