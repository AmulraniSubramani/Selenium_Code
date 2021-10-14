package SeleniumSession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDownAllValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Browser_Util bu= new Browser_Util();
		WebDriver driver = bu.initDriver("chrome");
		bu.launchurl("https://www.orangehrm.com/orangehrm-30-day-trial/");
		By country=By.id("Form_submitForm_Country");
		
		WebElement el= driver.findElement(country);
		Select sel=new Select(el);
		List<WebElement> ListValues=sel.getOptions();
		System.out.println(ListValues.size());
		for(WebElement e:ListValues) {
//			System.out.println(e);
			String text=e.getText();
			System.out.println(text);
			if(text.trim().equals("India")) {
				e.click();
				System.out.println("India is selected");
				break;
			}
		}
	}

}
