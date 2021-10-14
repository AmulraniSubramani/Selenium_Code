package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HandleAttribute {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Browser_Util bu=new Browser_Util();
		WebDriver driver = bu.initDriver("chrome");
		bu.launchurl("https://classic.freecrm.com/register/");
		
		// Handle Attributes
		//getAttribute is use to get the attribute values ex,value,type,name,class etc....
		
		By firstName=By.name("first_name");
		By submitBtn= By.id("submitButton");
		String placeHolderValue =driver.findElement(firstName).getAttribute("placeholder");
		System.out.println(placeHolderValue);
		
		ElementUtil ul=new ElementUtil(driver);
		System.out.println(ul.doGetAttributeValue(firstName, "type"));
				
		System.out.println("Using Attribute Values" +ul.checkElementDisplayed(submitBtn, "disabled"));
	}

}
