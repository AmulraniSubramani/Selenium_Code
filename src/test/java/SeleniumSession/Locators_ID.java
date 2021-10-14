package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Locators_ID {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeOptions co= new ChromeOptions();
		co.addArguments("--disable-extentions");
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver(co);
		driver.get("https://demo.opencart.com/index.php?route=account/login");
		
		//Selenium always works on one formula -----> create webelemnt+performAction(click,sendkeys,getText,isdisplayed)
		
		//By locator
		
		By emailID=By.id("input-email");
		By pwd=By.id("input-password");
		
		ElementUtil el=new ElementUtil(driver); // creating object of elementutil class
		el.dosendKeys(emailID, "amulsubramani@gmail.com");
		el.dosendKeys(pwd, "amulrani@12345");
		String exValue=el.dogetText(emailID);
		System.out.println("Value is"+ exValue + "hi");
		el.toValidText(emailID, exValue);
		driver.close();
		
		
	}

}
