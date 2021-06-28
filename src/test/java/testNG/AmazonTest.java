package testNG;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AmazonTest extends BaseTest{
	
	@Test(priority=1)
	public void validateTitleTest() {
		Assert.assertEquals(driver.getTitle(), "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in");
		
	}
	
	@Test(priority=2)
	public void validateIphone() {
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone");
		driver.findElement(By.id("twotabsearchtextbox")).submit();
		Assert.assertTrue(driver.findElement(By.xpath("//span[text()='iPhone 12. Purple. Power.']")).isDisplayed());
		
	}
	

}

