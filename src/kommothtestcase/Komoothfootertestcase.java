/**
 * 
 */
package kommothtestcase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import qataskkomooth.Komoothfooter;


/**
 * @author jiten
 *
 */
public class Komoothfootertestcase {
	
	
	@Test
	public void footer()
	{
	
	// Initializing geckodriver for firefox	
    System.setProperty("webdriver.gecko.driver",
    "C:\\Users\\jiten\\git\\qatask\\qatask\\driver\\geckodriver.exe"); WebDriver
    
    // maximizing firefox driver 
	driver=new FirefoxDriver(); driver.manage().window().maximize();
	
	// navigating to komoot
	driver.get("https://www.komoot.com/");
		 
    	 
	Komoothfooter footercheck = new Komoothfooter(driver);
	
	footercheck.footer();
	
	// closing firefox

	driver.quit(); 
	
	}

}
