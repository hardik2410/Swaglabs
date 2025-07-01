package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.baseswaglabs;
import pages.loginpage;

public class logintestcase extends baseswaglabs{
	loginpage lp;
	
	@BeforeTest
	public void settingup()
	{
		initialisation();
		lp=new loginpage();
	}
	
	
	@Test
	public void loginTest() throws InterruptedException
	{
		lp.logginin();
	}
	

}
