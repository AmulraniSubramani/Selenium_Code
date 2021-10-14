package SeleniumSession;

import org.openqa.selenium.WebDriver;

public class WebTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Browser_Util bu= new Browser_Util();
		WebDriver driver =bu.initDriver("chrome");
		driver.get("https://www.w3schools.com/html/html_tables.asp");
	}

}
