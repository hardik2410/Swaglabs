package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


import base.baseswaglabs;
import pages.dashboard;
import pages.loginpage;

public class dashboardtest extends baseswaglabs{
	dashboard db;
	loginpage lp; 
	
	@BeforeTest
	public void settingup() throws InterruptedException
	{
		initialisation();
		db=new dashboard();
		lp=new loginpage();
		lp.logginin();
		
	}
	
	
	@Test
	public void dashboard()
	{
		db.dashboarddd();
	}

}
