package seleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CrossBrowser {

	static WebDriver driver;
	public static void main(String[] args) {
	
		String browsername = "edge";
		
		switch (browsername) {
		case "chrome":
//			System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;
			
		case "firefox":
//			System.setProperty("webdriver.gecko.driver", "./software/geckodriver.exe");
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;
			
		case "edge":
//			System.setProperty("wendriver.chrome.driver", "./softare/chromedriver.exe");
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			break;	
			
		default:
			System.out.println("Enter a valid browser name");
			break;
			
		}

	}

}
