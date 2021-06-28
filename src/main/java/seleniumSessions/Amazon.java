package seleniumSessions;

public class Amazon {

	public static void main(String[] args) {
	
		BrowserUtils br = new BrowserUtils();
		br.initDriver("chrome");
		br.launchUrl(" ");
		
		String title=br.getPageTitle();
		System.out.println("The tile of page is "+title);
		if(title.contains("Online Shopping"))
		{
			System.out.println("PASSED");
		}
		else 
		{
			System.out.println("FAILED");
		}
		
		String url=br.getPageUrl();
		System.out.println("The url is "+url);
		
		br.closeBrowser();

	}

}
