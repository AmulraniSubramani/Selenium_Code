package SeleniumSession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class QuitVsClose {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.google.com"); // session ex 123
		
		String strTitle= driver.getTitle();
		
		System.out.println(strTitle);
		System.out.println(driver.getCurrentUrl()); // session id 123
		driver.quit();   // close the browser
		
		
		driver=new  ChromeDriver();
		driver.get("https://www.google.com");
		strTitle= driver.getTitle(); // session id is null 
		
		//org.openqa.selenium.NoSuchSessionException: Session ID is null. Using WebDriver after calling quit()?
		System.out.println("After quit:" + strTitle );
		
		
		/// close
		
		driver.close();
		driver=new  ChromeDriver();
		driver.get("https://www.google.com");
		strTitle= driver.getTitle(); // session id 123
		
		 //org.openqa.selenium.NoSuchSessionException: invalid session id
		System.out.println("After quit:" + strTitle );
		driver.quit();
		
		
	}

}
