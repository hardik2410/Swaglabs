package testcases;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.baseswaglabs;
import pages.findingthebrokenlinksonly;
import pages.loginpage;

public class linksfinder extends baseswaglabs {
    loginpage lp;
    findingthebrokenlinksonly bl;

    @BeforeTest
    public void settingup() throws InterruptedException {
        // Initialize driver FIRST
    	initialisation();
//        driver = new ChromeDriver();
//        driver.get("https://www.saucedemo.com");  // Put actual URL

        // NOW create page objects
        lp = new loginpage();
        bl = new findingthebrokenlinksonly();  // assuming this class expects driver

        // Now login
        lp.logginin();
    }

    @Test
    public void findinglinks() {
        bl.findingbrokenlinks();
    }
}