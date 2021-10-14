package SeleniumSession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleLanguageLinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.google.co.in/");
		
		By langugeLink=By.xpath("//div[@id='SIvCob']/a");
		List<WebElement> launList=driver.findElements(langugeLink);
		
		// For Each loop
//		for(WebElement e:launList) {
//			String lauName=e.getText();
//			System.out.println(lauName);
//			if(lauName.trim().equals("தமிழ்")) {
//				e.click();
//				break;
//			}
//			
//		}
//		
//		driver.quit();
		
	// For loop
		for(int a=0; a<launList.size(); a++) {
			String lanName=launList.get(a).getText();
			if(lanName.trim().equals("தமிழ்")) {
				launList.get(a).click();
				break;
			}
			
		}
		
//		driver.quit();
	}

}
