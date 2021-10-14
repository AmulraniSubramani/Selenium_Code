package SeleniumSession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * 
 * @author Amulrani Subramani
 *
 */
public class Browser_Util {
	public WebDriver driver;
	

/**
 * This method is used to init the driver on the basis of given browser name
 * @param browserName
 * @return it returns the driver 
 */
	public WebDriver initDriver(String browserName) {
		if(browserName.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver= new ChromeDriver();	
		}
		
		else if(browserName.equalsIgnoreCase("IE")) {
			WebDriverManager.iedriver().setup();
			driver= new InternetExplorerDriver();
		}
		else if(browserName.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		}
		
		else {
			System.out.println("Please pass the correct brosername:" + browserName);
		}
		
		return driver;
	}
	
	/**
	 * This method is used to launch the url on the basis of given url
	 * @param url
	 */
	public void launchurl(String url) {
		if(url==null|| url.isEmpty()) {
			System.out.println("Url is incorrect");
			return;
		}
		driver.get(url);
	}
	
	/**
	 * This method is used to get the title
	 * @return title 
	 */
	public String getTitle() {
		return driver.getTitle();
		
	}
	/**
	 * This method is used to get the pagesource 
	 * @return pagesource code
	 */
	public String getPageSource() {
		return driver.getPageSource();
	}
	
	/**
	 * This method is used to get the current url
	 * @return the current url
	 */
	public String getCurrentUrl() {
		return driver.getCurrentUrl();
	}
	
	/**
	 * This method is used to close the browser
	 */
	public void quit() {
		driver.quit();
	}
	
	/**
	 * This method is used to close the browser
	 */
	public void close() {
		driver.close();
	}
}
