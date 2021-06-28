package seleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownwithoutSelect {

	static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");

		By indus = By.id("Form_submitForm_Industry");
		By count = By.id("Form_submitForm_Country");

		By industry = By.xpath("//select[@id='Form_submitForm_Industry']/option");
		
		doSelectValues(industry, "Travel");



	}

	public static void doSelectValues(By locator, String value) {
		List<WebElement> optionList = driver.findElements(locator);

		for(WebElement e:optionList) {
			if(e.getText().equals(value)) {
				e.click();
			}
		}
	}

}
