

import org.openqa.selenium.chrome.ChromeDriver;

public class deleteGmailPromotions {

	public static void main(String[] args) {
		
		
		WebDriver driver=new ChromeDriver();
		 

		driver.get("http://www.facebook.com");
		 
		// Maximize browser
		 
		driver.manage().window().maximize();
		

	}

}
