package SeleniumSession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetFooterLink {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		
		By closeBtn=By.xpath("//div[@class='_2QfC02']/button[@class='_2KpZ6l _2doB4z']"); 
		
		ElementUtil ul= new ElementUtil(driver);
		boolean bln=driver.findElement(closeBtn).isDisplayed();
		System.out.println(bln);
//		ElementUtil el=new ElementUtil(driver);
//		boolean bl=el.doIsDisplayed(closeBtn);
//		System.out.println(bl);
		try {
		if(bln==true) {
			ul.toclick(closeBtn);
		}
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
		By footer=By.xpath("//div[@class='_2WErco row']/div");
		
		List<WebElement> footerlink=driver.findElements(footer);
		for(WebElement e:footerlink) {
			String footNamee= e.getText();
			System.out.println(footNamee);
		}

		
				
	}

}
