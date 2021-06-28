package testNG;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HRMTest extends BaseTest {

	
	@Test
	public void validateTitleTest() {
		Assert.assertEquals(driver.getTitle(), "Free Human Resource Management Software | 30 Day Trial Creation");
	}
	
	@Test
	public void validateLogo() {
		Assert.assertTrue(driver.findElement(By.xpath("//img[@class='nav-logo']")).isDisplayed());
	}
	
	

}
