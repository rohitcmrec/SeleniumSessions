package Practise_others;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavascriptMain {

	public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in/");
	
	JavascriptUtils js = new JavascriptUtils(driver);
	
//	WebElement cleaning_essentials = driver.findElement(By.cssSelector("span.a-size-small.a-color-base.aok-align-center.aok-inline-block"));
	WebElement cleaning_essentials1 = driver.findElement(By.xpath("//span[text()='Cleaning essentials']"));
//	js.doClickByJS(cleaning_essentials);
	
//	WebElement serach_box = driver.findElement(By.cssSelector("input#twotabsearchtextbox"));
//	js.doSendKeysByJS(serach_box, "Iphone");
	
//	System.out.println(js.getTitleByJS());
	
//	System.out.println(js.getInnerTextByJS());
	
//	js.refreshByJS();
	
//	js.alertByJS("Welcome to India");
	
	WebElement icon = driver.findElement(By.cssSelector("a#nav-logo-sprites"));
//	js.drawBorderByJS(icon);
	
//	js.flashByJS(icon, "rgb(0,200,0)");
	
//	js.scrollDown();
//	js.scrollUp();
	
//	js.scrollHeight("500");
	

	
	js.scrollToElement(cleaning_essentials1);
	
	
	
	

	}

}
