package SeleniumSession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WDM_Concepts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.google.com");
		
		String strTitle= driver.getTitle();
		
		System.out.println(strTitle);
		System.out.println(driver.getCurrentUrl());
		driver.quit();
		strTitle= driver.getTitle();
		System.out.println("After quit:" + strTitle );		
		if(strTitle.equals("Google")) {
			System.out.println("Title is matched");
			driver.quit();
		}
		else {
			System.out.println("Title is not matched");
		}
				
		
	}

}
