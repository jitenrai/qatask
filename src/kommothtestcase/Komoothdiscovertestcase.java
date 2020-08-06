/**
 * 
 */
package kommothtestcase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import qataskkomooth.Komoothhomepageheader;
import qataskkomooth.komoothdiscoverpage;

/**
 * @author jiten
 *
 */
public class Komoothdiscovertestcase {
	
	@Test
	public void discoverpage()
	{
	
	// Initializing geckodriver for firefox	
    System.setProperty("webdriver.gecko.driver",
    "C:\\Users\\jiten\\git\\qatask\\qatask\\driver\\geckodriver.exe"); WebDriver
    
    // maximizing firefox driver 
	driver=new FirefoxDriver(); driver.manage().window().maximize();
	
	// navigating to komoot
	driver.get("https://www.komoot.com/");
		 
    	 
	komoothdiscoverpage discoverpage = new komoothdiscoverpage(driver);
	
	//discoverpage.clickdiscoverpage();
	discoverpage.hikingtrails();
	discoverpage.bikeroutetrails();
	discoverpage.mountianbikingtrails();
	discoverpage.roadcyclingroutes();
	discoverpage.runningtrailsroutes();
	discoverpage.mountainhikeroutes();
	
	
	
	
	// closing firefox

	driver.quit(); 


}
}
