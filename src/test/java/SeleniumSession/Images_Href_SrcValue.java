package SeleniumSession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Images_Href_SrcValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Browser_Util bu= new Browser_Util();
//		WebDriver driver= bu.initDriver("chrome");
//
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		By img=By.tagName("img");
		
		ElementUtil ul=new ElementUtil(driver);
//		List<WebElement> list= ul.getAllImg(img);
//		System.out.println(list);
		
		List<WebElement> imgList= driver.findElements(By.tagName("img"));
		System.out.println(imgList.size());
		
		for (int i=0; i<imgList.size();i++) {
			String alt=imgList.get(i).getAttribute("alt");
//			String src=imgList.get(i).getAttribute("src");
//			System.out.println(alt+ " :" +src);
			if(alt.contains("Bedsheets, curtains & more")) {
				String src=imgList.get(i).getAttribute("src");
				System.out.println(alt+":" + src);
				break;
			}
		}
		
		
	}

	
	
	

}
