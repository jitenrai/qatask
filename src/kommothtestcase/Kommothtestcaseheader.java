/**
 * 
 */
package kommothtestcase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import qataskkomooth.Komoothhomepageheader;

/**
 * @author jiten
 *
 */
public class Kommothtestcaseheader {
	
	@Test
	public void homepage()
	{
	
	// Initializing geckodriver for firefox	
    System.setProperty("webdriver.gecko.driver",
    "C:\\Users\\jiten\\git\\qatask\\qatask\\driver\\geckodriver.exe"); WebDriver
    
    // maximizing firefox driver 
	driver=new FirefoxDriver(); driver.manage().window().maximize();
	
	// navigating to komoot
	driver.get("https://www.komoot.com/");
		 
    	 
	Komoothhomepageheader headerpage = new Komoothhomepageheader(driver);
	
	headerpage.clickdiscover();
	headerpage.clickrouteplanner();
	headerpage.clickfeatures();
	headerpage.clickpricing();
	
	// closing firefox
	driver.quit(); 
	
	
	}
	

}
