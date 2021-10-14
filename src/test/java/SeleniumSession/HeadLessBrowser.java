package SeleniumSession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HeadLessBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// headless browser testing
		// headless is non UI mode
		// It wont launch the browser, testing happens behind the scene
		// Headless is not recommend for complex application/popup/mousemovement
		// Headless is faster than UI mode
		// Its recommended for sanity testing( 15-20 Tcs)
		
		
		//Headless - Non UI mode
		
		WebDriverManager.chromedriver().setup();
		
		ChromeOptions co= new ChromeOptions(); // its a class
		co.addArguments("--incognito");
		co.addArguments("--headless");
		co.addArguments("--disable-extensions");
		
		WebDriver driver = new ChromeDriver(co);
		driver.get("http://www.google.com");
		System.out.println(driver.getTitle());
		System.out.println("Completed");
		driver.quit();
		
	}

}
