package SeleniumSession;

public class Amazon_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		Browser_Util br= new Browser_Util();
		br.initDriver("chrome");
		br.launchurl("https://www.amazon.com");
		String title =br.getTitle();
		System.out.println(title);
		String currentUrl=br.getCurrentUrl();
		System.out.println(currentUrl);
		String pagesource= br.getPageSource();
//		System.out.println(pagesource);
		br.quit();
		
	}

}
