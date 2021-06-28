package seleniumSessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetAttributeValue {
	
	static WebDriver driver;

	public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	
	driver.get("https://www.amazon.in/");
	
	By linktag = By.tagName("a");
	
	List<String> atrvaluelist = getAttributeValue(linktag, "href");
	for(String e:atrvaluelist)
	{
		System.out.println(e);
	}

	}
	
	public static List<WebElement> getElements(By locator)
	{
		return driver.findElements(locator);
	}
	
	public static List<String> getAttributeValue(By locator, String atr)
	{
		List<WebElement> atrlist = getElements(locator);
		List<String> elelist = new ArrayList<String>();
		
		for(WebElement e:atrlist)
		{
			String atrvalue = e.getAttribute(atr);
			if(atrvalue!=null && !atrvalue.isEmpty())
			{
				elelist.add(atrvalue);
			}
		}
		return elelist;
	}
	
	

}
