package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataprovider extends BaseTest {	
	
	@DataProvider
	public Object[][] data() {
		
	return new Object[][]{{"rohit@gmail.com","123"},
				{" ","rohit"},
				{"ram@mail.com"," "}};	
	}
	
	
	@Test(dataProvider="data")
	public void validateLogin(String username, String password) {
		doLogin(username, password);
	}
	
	public void doLogin(String usr, String pwd) {
		driver.findElement(By.name("email")).clear();
		driver.findElement(By.name("email")).sendKeys(usr);
		driver.findElement(By.name("password")).clear();
		driver.findElement(By.name("password")).sendKeys(pwd);
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		Assert.assertTrue(driver.findElement(By.cssSelector(".alert.alert-danger.alert-dismissible")).getText().contains("No match "));
	}

}
