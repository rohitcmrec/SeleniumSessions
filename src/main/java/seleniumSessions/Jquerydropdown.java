package seleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Jquerydropdown {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://www.jquery-az.com/jquery/demo.php?ex=48.0_3");
		Thread.sleep(5000);

		driver.findElement(By.xpath("//div[@class='ms-options-wrap']")).click();

		By drp = By.xpath("//div[@class='ms-options']//li//input[@type='checkbox']");
		doSelectChoiceByAttributeType(drp,"title","all","Java");
		//System.out.println(ele.get(i).getAttribute("title"));
	}

	public static void doSelectChoiceByAttributeType(By locator, String atrType, String... value) {
		List<WebElement> optionList = driver.findElements(locator);
		if(!value[0].equalsIgnoreCase("All")) {

			for(int i=0;i<optionList.size();i++) {

				for(int j=0;j<value.length;j++) {

					if(optionList.get(i).getAttribute(atrType).equals(value[j])) {

						optionList.get(i).click();
					}
				}
			}
		}
		else {
			for(WebElement e:optionList) {
				e.click();
			}
		}
	}

}