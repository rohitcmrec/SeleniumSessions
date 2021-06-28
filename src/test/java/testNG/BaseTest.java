package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {

	WebDriver driver;

	@Parameters({"URL", "browserName"})
	@BeforeTest
	public void setUp(String URL, String browserName) {
		switch (browserName.toLowerCase()) {
		case "chrome":
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		break;
		case "firefox":
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		break;

		default:
			System.out.println("Please pass on the correct browser");
			break;
		}	

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get(URL);
	}
	
	@AfterTest
	public void tearDown() {
		driver.quit();
	}

}
