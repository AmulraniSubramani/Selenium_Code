package SeleniumSession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

import org.openqa.selenium.By;

/*
 * This class has all element util(All eleement based methods)
 */

public class ElementUtil {

	WebDriver driver;
	
	public ElementUtil(WebDriver driver) {
		this.driver=driver;
	}
	
	/*
	 * This generic method used to get the element by passing the locator
	 * 
	 */
	public WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	/*
	 * This generic method use to do sendkeys action 
	 * By passing the locator and string value
	 */
	public void dosendKeys(By locator, String value) {
		getElement(locator).sendKeys(value);
	}
	
	/*
	 * This method use to get the text by passing the locator
	 */
	public String dogetText(By locator) {
		return getElement(locator).getText();
	}
	
	/*
	 * This method is use to validate the text
	 */
	public void toValidText(By locator,String expValue) {
		String StrValue= dogetText(locator);
		if(StrValue.equals(expValue)) {
			System.out.println("Text matched");
		}
		else
			System.out.println("Text not matched");
	}
	
	/* 
	 * This method is use to click the element
	 */
	
	public void toclick(By locator) {
		getElement(locator).click();
	}
	
	/*
	 * This method is use to check the element is selected or not
	 */
	public boolean doIsSelected(By locator) {
		return getElement(locator).isSelected();
	}
	
	/*
	 * This method is use to check the element is enabled or not
	 */
	public boolean doIsEnabled(By locator) {
		return getElement(locator).isEnabled();
	}
	
	
	/*
	 * This method is use to check the element is displyaed or not
	 */
	public boolean doIsDisplayed(By locator) {
		return getElement(locator).isDisplayed();
	}
	
	/*
	 * This mehtod is use to check element is displayed or not, without using displayed method
	 */
	public boolean checkElementDisplayed(By locator,String attrName) {
		String attrValue=getElement(locator).getAttribute(attrName);
		if(attrValue.equals("true")) {
			return true;
		}
		return false;
		}
		
	
	/*
	 * This method is use to get attribute value 
	 */
	public String doGetAttributeValue(By locator,String attrName) {
		return getElement(locator).getAttribute(attrName);
	}
	
	
	/*
	 * This method use to get get all the matching elements list usind findElements method
	 */
	
	public List<WebElement> doGetElements(By locator) {
		return driver.findElements(locator);
		
	}
	/*
	 * This method is use to click the link using for loop
	 */
	
	public void doclickLink(By locator,String LinkName) {
		List<WebElement> linkList=doGetElements(locator);

		for(int i=0; i<linkList.size();i++) {
			String linkValue=linkList.get(i).getText();

			if(linkValue.trim().equals(LinkName)) {
				linkList.get(i).click();
				System.out.println("Landed on correct page" + ":" + linkList);
				break;
			}
		}
		
	}
	
	/*
	 * This method is use to get click the link using for each loop
	 */
	public void doClickLinkThruforEachLoop(By locator,String LinkName) {
		List<WebElement> linksList =doGetElements(locator);
		System.out.println(linksList.size());
		for(WebElement e:linksList) {
			String text=e.getText();
			if(text.trim().equals(LinkName)) {
				e.click();
				break;
			}
		}
	}
	
	/*
	 * This method is use to select the value by index
	 * @Param By passing the locator and index 
	 */
	public void doSelectByIndex(By locator,int index) {
		
		Select sel=new Select(getElement(locator));
		sel.selectByIndex(index);
		String expectedValue=sel.getFirstSelectedOption().getText();
//		System.out.println(s);
		isDropDownValueisSelected(sel, expectedValue);
	}
	
	/*
	 * This method is use to select the visible text
	 */
	public boolean doSelectByVisibleText(By locator,String visibletext) {
		Select sel= new Select(getElement(locator));
		sel.selectByVisibleText(visibletext);
		return isDropDownValueisSelected(sel, visibletext);
	}
	/*
	 * This method is use select an attribute value
	 */
	public boolean doSelectByValue(By locator,String value) {
		Select sel=new Select(getElement(locator));
		sel.selectByValue(value);
		return isDropDownValueisSelected(sel, value);
	}
	
	/*
	 * This method is use to check expected value is selected or not
	 * @Param by passing select and expected value
	 */
	public boolean isDropDownValueisSelected(Select select,String expValue) {
		if(select.getFirstSelectedOption().getText().contains(expValue)) {
			System.out.println("Expected value is selected");
			return true;
		}
		return false;
	
	}
	
	
	
}
