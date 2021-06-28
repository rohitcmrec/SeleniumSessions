package seleniumSessions;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CricInfo_Bowler {

	static WebDriver driver;

	public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	driver.get("https://www.espncricinfo.com/series/sri-lanka-tour-of-bangladesh-2021-1262340/bangladesh-vs-sri-lanka-2nd-odi-1262346/full-scorecard");
	
	System.out.print("O "+"M "+"R "+"W "+"ECON "+"0s "+"4s "+"6s "+"WD "+"NB ");
	System.out.println(" ");
	getBowlerStats("Dasun Shanaka").stream().forEach(e->System.out.print(e+" "));
	System.out.println(" ");
	getBowlerStats("Isuru").stream().forEach(e->System.out.print(e+" "));

	}
	
	public static List<String> getBowlerStats(String bowlerName) {
		String xpath = "//a[contains(text(),'"+bowlerName+"')]/parent::td[@class='text-nowrap']/following-sibling::td";
		
		List<WebElement>bowlerStats = driver.findElements(By.xpath(xpath));
		List<String> statsList = new ArrayList<String>();
		
		for(WebElement e:bowlerStats) {
			statsList.add(e.getText());
		}
		return statsList;
	}

}
