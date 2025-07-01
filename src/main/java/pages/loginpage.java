package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import base.baseswaglabs;

public class loginpage extends baseswaglabs{
	
	@FindBy(id="user-name")
	WebElement uname;
	
	@FindBy(id="password")
	WebElement passwd;
	
	@FindBy(id="login-button")
	WebElement loginbutton;
	
	
	public loginpage()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void logginin() throws InterruptedException
	{
		uname.sendKeys(prop.getProperty("username"));
		passwd.sendKeys(prop.getProperty("password"));
		loginbutton.click();
		Thread.sleep(2000);
	
	}

}
