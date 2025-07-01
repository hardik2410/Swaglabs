package base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.Duration;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class baseswaglabs {
	public static WebDriver driver;
	public static Properties prop;
	public static WebDriverWait waitt;

	
//	 

	
	public baseswaglabs()
	{
		prop = new Properties();
		try {
			// For reading data from the file
			FileInputStream ip = new FileInputStream("D:\\Selenium\\Swaglabs\\src\\main\\java\\Creds\\Creds.txt");
		prop.load(ip);
		//If file not found then this will be printed
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void initialisation() {
	    String Browsername = prop.getProperty("browser");

	    if (Browsername.equalsIgnoreCase("chrome")) {
	    	ChromeOptions options = new ChromeOptions();
	    	options.addArguments("--incognito");
	        driver = new ChromeDriver(options);
	        driver.get(prop.getProperty("url"));
	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	        waitt = new WebDriverWait(driver, Duration.ofSeconds(60));
	    }
	
		
	}

}
