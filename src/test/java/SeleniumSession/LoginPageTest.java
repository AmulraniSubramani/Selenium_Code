package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPageTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Browser_Util bu= new Browser_Util();
		WebDriver driver=bu.initDriver("chrome");
		bu.launchurl("https://demo.opencart.com/index.php?route=account/login");
		
		ElementUtil ul=new ElementUtil(driver);
		
		//By locator
		By emailID=By.id("input-email");
		By pwd=By.id("input-password");
		By login =By.xpath("//input[@value='Login']");
		
		ul.dosendKeys(emailID, "amulsubramani@gmail.com");
		ul.dosendKeys(pwd, "Anulekha@123");
		ul.toclick(login);
		System.out.println("Login successfully");		
		
	}

}
