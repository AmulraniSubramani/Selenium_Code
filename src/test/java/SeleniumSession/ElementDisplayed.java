package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ElementDisplayed {

	static boolean flag;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Browser_Util bu= new Browser_Util();
		WebDriver driver=bu.initDriver("chrome");
		bu.launchurl("https://classic.freecrm.com/register/");
		
		By submitBtn=By.id("submitButton");
		
		// is Enabled
		
		 flag= driver.findElement(submitBtn).isEnabled();
		System.out.println("Button is not Enabled"+flag);
		
		//isDisplyaed
		flag= driver.findElement(submitBtn).isDisplayed();
		System.out.println("Button is not displyaed :" + flag);
		
		//isSelected
		flag=driver.findElement(submitBtn).isSelected();
		System.out.println("button is not selectec " + " :" + flag);
		
		
		ElementUtil ul=new ElementUtil(driver);
		System.out.println("calling generic function " +ul.doIsDisplayed(submitBtn));
	}

}
