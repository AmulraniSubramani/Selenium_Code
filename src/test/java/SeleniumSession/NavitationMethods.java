package SeleniumSession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NavitationMethods {

	static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("http://www.google.com");
		System.out.println(driver.getTitle());
		// from google we can navigate to amazon page and both get and navigate.to works in same way
		driver.navigate().to("https://www.amazon.in/");
		System.out.println(driver.getTitle());
		driver.navigate().back(); // back to google
		driver.navigate().forward(); // forward to amazon
		driver.navigate().refresh(); // refresh the same page but not adivisable because it may change the session id
				
		
	}

}
