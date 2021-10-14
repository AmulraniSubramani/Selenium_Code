package SeleniumSession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CrossBrowser_if {

	static WebDriver  driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String browser="safari";
		
		if(browser.equalsIgnoreCase("chrome")){
			WebDriverManager.chromedriver().setup();
			driver= new ChromeDriver();
			System.out.println("chrome driver launched");
		}
		else if(browser.equalsIgnoreCase("Firefox")){
			WebDriverManager.chromedriver().setup();
			driver= new FirefoxDriver();
		}
		else if(browser.equalsIgnoreCase("IE")) {
			WebDriverManager.iedriver().setup();
		}
		else {
			System.out.println("Please pass the correct browser :" + browser );
			
	}
		
		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());
		driver.quit();
	}

}
