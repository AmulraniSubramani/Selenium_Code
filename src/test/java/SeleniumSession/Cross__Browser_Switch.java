package SeleniumSession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Cross__Browser_Switch {

	static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String browser ="firefox";
		switch (browser) {
		
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			break;
			
		case "IE":
		WebDriverManager.chromedriver().setup();
		driver= new InternetExplorerDriver();
		break;
		
		default:
			System.out.println("please pass the correct browser :" + browser);
		}

	}

}
