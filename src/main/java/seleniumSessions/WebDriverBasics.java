package seleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverBasics { 

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://amazon.com");
		
		String title = driver.getTitle();
		System.out.println(title);
		if(title.equals("Amazon.in: Online Shopping India - Buy mobiles, laptops, cameras, books, watches, apparel, shoes and e-Gift Cards. Free Shipping & Cash on Delivery Available."))
		{
			System.out.println("PASSED");
		}
		else
		{
			System.out.println("FAILED");
		}

	}

}
