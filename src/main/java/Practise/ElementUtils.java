package Practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ElementUtils {
	
	WebDriver driver;
	
	public ElementUtils(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public WebElement getElement(By locator)
	{
		return driver.findElement(locator);
	}
	
	public void doSendKeys(String value, By locator)
	{
		getElement(locator).sendKeys(value);
	}
	public void doClick(By locator)
	{
		getElement(locator).click();
	}

}
