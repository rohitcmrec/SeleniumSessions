package testNGPractise;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DemoCart_DataProvider extends BaseTest {
	
	@DataProvider
	public Object[][] getData() {
		return new Object[][] {{"tom","jane","nicpoiuy@gmail.com","987993994944","tom@123"},
							{"pony","trump","poinnrtyf@gmail.com","567784298","pony@564"}};
	}
	
	@Test(dataProvider="getData")
	public void registerDemoCartApp(String fname, String lname, String mail, String phone, String pwd) {
		doRegistration(fname, lname, mail, phone, pwd);
	}
	
	public void doRegistration(String fname, String lname, String mail, String phone, String pwd) {
		driver.findElement(By.id("input-firstname")).sendKeys(fname);
		driver.findElement(By.id("input-lastname")).sendKeys(lname);
		driver.findElement(By.id("input-email")).sendKeys(mail);
		driver.findElement(By.id("input-telephone")).sendKeys(phone);
		driver.findElement(By.id("input-password")).sendKeys(pwd);
		driver.findElement(By.id("input-confirm")).sendKeys(pwd);
		driver.findElement(By.xpath("//input[@name='agree']")).click();
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		driver.findElement(By.linkText("Logout")).click();
		driver.findElement(By.linkText("Register")).click();
	}

}
