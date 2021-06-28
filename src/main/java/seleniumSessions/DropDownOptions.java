package seleniumSessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownOptions {
	static WebDriver driver;

	public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	 driver = new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
	
	By indus = By.id("Form_submitForm_Industry");
	By count = By.id("Form_submitForm_Country");
	
//	Select select = new Select(driver.findElement(indus));
//	List<WebElement>optionList = select.getOptions();
//	
//	for(WebElement e:optionList) {
//		System.out.println(e.getText());
//	}
//	
//	for(int i=0;i<optionList.size();i++) {
//		System.out.println(optionList.get(i).getText());
//	}
	
//	printDropDownoptions(count);
	doSelectValueFromDropDown(indus, "Education");
	
	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static List<String> doGetOptionListText(By locator) {
		Select select = new Select(getElement(locator));
		List<String> optionTextList = new ArrayList<String>();
		List<WebElement>optionList = select.getOptions();
		
		for(WebElement e:optionList) {
			optionTextList.add(e.getText());
		}
		return optionTextList;
	}
	
	public static void printDropDownoptions(By locator) {
		doGetOptionListText(locator).stream().forEach(e->System.out.println(e));
	}
	
	public static void doSelectValueFromDropDown(By locator, String value) {
		Select select = new Select(getElement(locator));
		List<WebElement>optionList = select.getOptions();
		
		for(WebElement e:optionList) {
			if(e.getText().equalsIgnoreCase(value)) {
				e.click();
				break;
			}
		}
	}

}
