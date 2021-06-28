package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DemoCartTest {

	public static void main(String[] args) {
	
		BrowserUtils br = new BrowserUtils();
		WebDriver driver = br.initDriver("chrome");
		br.launchUrl("https://demo.opencart.com/index.php?route=account/login");
		
		By mailid = By.id("input-email");
		By pswd = By.id("input-password");
		By regisLink=By.linkText("Register");
		
		ElementUtils er = new ElementUtils(driver);
		er.doSendkeys(mailid, "rohit@gmail.com");
		er.doSendkeys(pswd, "hello");
		er.doClick(regisLink);
		
		//br.closeBrowser();

	}

}
