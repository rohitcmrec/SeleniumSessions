package seleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleAuthPopUp {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		String usr = "admin";
		String pwd = "admin";
		
		driver.get("https://"+usr+":"+pwd+"@the-internet.herokuapp.com/basic_auth");

	}

}
