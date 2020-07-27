package deletePromoGmail;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class deleteGmailPromotions {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "/Users/mounamukhargoswami/Coding/Workspace/deletePromoGmailchromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		inted error

		driver.get("http://www.facebook.com");
		 
		// Maximize browser
		 
		driver.manage().window().maximize();
		
		

	}

}
