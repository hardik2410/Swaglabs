package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import base.baseswaglabs;

public class cartpage extends baseswaglabs{
	
	
	@FindBy(css = ".svg-inline--fa.fa-shopping-cart.fa-w-18.fa-3x")
	WebElement carticon;
	
	@FindBy(className="inventory_item_name")
	WebElement inventory;
	
	@FindBy(xpath="//a[normalize-space()='CHECKOUT']")
	WebElement checkout;
	
	
	public cartpage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void validatinginventory() throws InterruptedException
	{
		Thread.sleep(1000);
		carticon.click();
		if(inventory.isDisplayed())
		{
			String itemname=inventory.getText();
			System.out.println("Item exist in the inventory " +itemname);
			
		}
		else
		{
			System.out.println("Item is not added in the cart");
		}
		
		checkout.click();
		
		
	}
	

}
