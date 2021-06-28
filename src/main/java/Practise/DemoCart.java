package Practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoCart {

	static WebDriver driver;
	
	public static void main(String[] args) {
		
		BrowserUtils br = new BrowserUtils();
		driver = br.initDriver("chrome");
		br.launchUrl("https://demo.opencart.com/index.php?route=account/login");
		
		By email = By.id("input-email");
		By pwd = By.id("input-password");
		By submit = By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input");
		
		ElementUtils er = new ElementUtils(driver);
		er.doSendKeys("rohit", email);
		er.doSendKeys("pwd", pwd);
		er.doClick(submit);

	}

}
