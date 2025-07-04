package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.baseswaglabs;

public class findingthebrokenlinksonly extends baseswaglabs{
	
	
	@FindBy(tagName="a")
	List <WebElement> links;
	
	
	public findingthebrokenlinksonly() {

	    PageFactory.initElements(driver, this);
	}
	
	public void findingbrokenlinks()
	{
		//List <WebElement> links= driver.findElements(By.tagName("a"));
		
		WebElement s1= links.get(0);
		String s2=s1.getText();
		
		System.out.println(s2);
		
		System.out.println("Number of links on page"+links.size());
		
		for(WebElement link:links)
		{
			System.out.println("link text is " +link.getText());
			System.out.println("Link is "+link.getDomAttribute("href"));
		}

		
	}

}
