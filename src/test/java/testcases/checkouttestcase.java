package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.baseswaglabs;
import pages.cartpage;
import pages.checkoutpage;
import pages.dashboard;
import pages.loginpage;

public class checkouttestcase extends baseswaglabs{
    loginpage lp;
    dashboard db;
    cartpage cp;
    checkoutpage ct;
	
	@BeforeTest
	public void settingup() throws InterruptedException
	{
		
		initialisation();
        lp = new loginpage();
        db = new dashboard();
        cp = new cartpage();
        ct = new checkoutpage();

        // Perform cart flow here
        lp.logginin();
        db.dashboarddd();
        cp.validatinginventory();
		
	}
	
	@Test
	public void checkingout()
	{
		ct.checkingout();
	}

}
