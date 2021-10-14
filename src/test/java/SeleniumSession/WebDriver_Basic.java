package SeleniumSession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriver_Basic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\selenium Drivers\\chromedriver.exe");
//		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.google.com");
		String strTitle= driver.getTitle();
		if(strTitle.equals("Google")) {
			System.out.println("Title is matched");
		}
		else {
			System.out.println("Title is not matched");
		}
		//Automation steps+ verification check(point) --->Automation Tetsing(Testing)
		String strURL= driver.getCurrentUrl();
		System.out.println(strURL);
		System.out.println(driver.getPageSource().contains("Copyright"));
		driver.quit(); // to close the current broser
		
		
		
	}

}
