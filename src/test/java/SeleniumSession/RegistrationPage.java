package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegistrationPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Browser_Util bu=new Browser_Util();
		WebDriver driver=bu.initDriver("chrome");
		bu.launchurl("https://demo.opencart.com/index.php?route=account/login");
		
		//element util
		ElementUtil ul=new ElementUtil(driver);
		
		
		//By locators for registration form
		By register=By.linkText("Register");
		By firstName=By.id("input-firstname");
		By lastName=By.name("lastname");
		By emailId=By.id("input-email");
		By telephone=By.name("telephone");
		By password=By.id("input-password");
		By cfmPwd=By.id("input-confirm");
		By radioBtnNo=By.cssSelector("#content > form > fieldset:nth-child(3) > div > div > label:nth-child(2) > input[type=radio]");
		By agree=By.name("agree");
		By con=By.xpath("//*[@id='content']/form/div/div/input[2]");
		
		///Actions // registration form
		ul.toclick(register);
		ul.dosendKeys(firstName, "Amulrani");
		ul.dosendKeys(lastName, "Subramani");
		ul.dosendKeys(emailId, "amulsubramani@gmail.com");
		ul.dosendKeys(telephone, "8939842639");
		ul.dosendKeys(password, "Anulekha@123");
		ul.dosendKeys(cfmPwd, "Anulekha@123");
		ul.toclick(radioBtnNo);
		ul.toclick(agree);
		ul.toclick(con);
		bu.quit();
		
		
	}

}
