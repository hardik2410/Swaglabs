package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


import base.baseswaglabs;
import pages.cartpage;
import pages.dashboard;
import pages.loginpage;

public class carttestcase extends baseswaglabs{
	dashboard db;
	cartpage cp;
	loginpage lp;
	
	
	@BeforeTest
	public void settingup() throws InterruptedException
	{
		initialisation();
		db=new dashboard();
		lp=new loginpage();
		cp=new cartpage();
		
		lp.logginin();
		db.dashboarddd();
		
	}
	
	@Test
	public void cartcases() throws InterruptedException
	{
		cp.validatinginventory();
	}

}
