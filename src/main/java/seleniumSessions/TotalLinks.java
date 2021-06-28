package seleniumSessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TotalLinks {
	
	static WebDriver driver;

	public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	
	driver.get("https://www.amazon.in/");
	
//	List<WebElement> linklist = driver.findElements(By.tagName("a"));
	
	By tagname = By.tagName("a");
	
//	for(int i=0;i<linklist.size();i++)
//	{
//		System.out.println(linklist.get(i).getText());
//	}
//	
		getElementsText(tagname);
	
	}
	
	public static List<WebElement> getElements(By locator)
	{
		return driver.findElements(locator);
	}

	public static List<String> getElementsTextList(By locator)
	{
		List<WebElement> linkslist = getElements(locator);
		List<String> eleTextList = new ArrayList<String>();
		
		for(WebElement e:linkslist)
		{
			String text = e.getText();
			if(!text.isEmpty())
			{
				eleTextList.add(text);
			}
		}
		
		return eleTextList;
	}
	
	public static void getElementsText(By locator)
	{
		getElementsTextList(locator).stream().forEach(e->System.out.println(e));
	}
}
