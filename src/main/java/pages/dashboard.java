package pages;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import base.baseswaglabs;



public class dashboard extends baseswaglabs{
	
	@FindBy(className="product_sort_container")
	WebElement dropdown;
	
	@FindBy(xpath="(//button[normalize-space()='ADD TO CART'])[3]")
	WebElement addtocart;
	
	public dashboard()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void dashboarddd()
	{
		String expectedTitle="Swag Labs";
		String actualTitle=driver.getTitle();		
		Assert.assertEquals(actualTitle, expectedTitle);
		
		
		
		Select sel=new Select(dropdown);
		sel.selectByValue("za");
		
		addtocart.click();
		
	}

}
