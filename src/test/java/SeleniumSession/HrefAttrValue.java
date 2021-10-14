package SeleniumSession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HrefAttrValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Browser_Util bu= new Browser_Util();
		WebDriver driver=bu.initDriver("chrome");
		
		bu.launchurl("https://classic.freecrm.com/register/");
		
		ElementUtil ul= new ElementUtil(driver);
		
		By linkHeader= By.xpath("//ul[@class='nav navbar-nav navbar-right']/li");
		// to get the href Attr Value
		List<WebElement> linkList =driver.findElements(linkHeader);
		
//		for(WebElement e: linkList) {
//			String text=e.getAttribute("href");
//			String visibleText= e.getText();
//			System.out.println(visibleText);
//			if(visibleText.trim().equals("Features")) {
//				e.click();
//				System.out.println("Landed on features page");
//				break;
//			}
//		}
//		
		System.out.println("Hi");
		for(int i=0; i<linkList.size();i++) {
			String linkValue=linkList.get(i).getText();
			System.out.println(linkValue);
			if(linkValue.trim().equals("Pricing")) {
				linkList.get(i).click();
				System.out.println("Landed on correct page");
				break;
			}
		}
		
		
		
	
	}

	
	
}
