package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.baseswaglabs;

public class checkoutpage extends baseswaglabs{
	
	@FindBy(id="first-name")
	WebElement fname;
	
	@FindBy(id="last-name")
	WebElement lname;
	
	@FindBy(id="postal-code")
	WebElement postcode;
	
	@FindBy(xpath="//input[@type='submit' and @value='CONTINUE']")
	WebElement continuebutton;
	
	
	@FindBy(xpath="//a[normalize-space()='FINISH']")
	WebElement finishbutton;
	
	
	public checkoutpage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void checkingout()
	{
		
		fname.sendKeys(prop.getProperty("fname"));
		lname.sendKeys(prop.getProperty("lname"));
		postcode.sendKeys("47075");
		continuebutton.click();
		finishbutton.click();
	}
	

}
