package SeleniumSession;

import javax.lang.model.element.Element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SelectHTMLDropDown {

//	static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Browser_Util bu=new Browser_Util();
		 WebDriver driver=bu.initDriver("chrome");
		bu.launchurl("https://www.orangehrm.com/orangehrm-30-day-trial/");
		
		By country= By.id("Form_submitForm_Country");
		// select the value by index
		
//		WebElement e=driver.findElement(country);
//		Select sel=new Select(e);
//		sel.selectByIndex(5);
		
		ElementUtil el= new ElementUtil(driver);
		el.doSelectByIndex(country, 5);
		System.out.println("Working fine");
		
		//select the value by visible text
		
//		Select sel= new Select(el.getElement(country));
//		sel.selectByVisibleText("India");
		
//		boolean bln=el.doSelectByVisibleText(country, "India");
//		System.out.println(bln);
//		System.out.println("Country India is selected");
		
		//select by value(By attribute value)
		
//		Select sel= new Select(el.getElement(country));
//		sel.selectByValue("American Samoa");
		 
//		el.doSelectByValue(country, "American Samoa");
//		System.out.println("Value is selected");
		
		
		// How to check whetehre our expected value is selected or not
//		if(sel.getFirstSelectedOption().getText().equals("American Samoa")) {
//			System.out.println("expected value is selected");
//		}
	}
	
	

}
