/**
 * 
 */
package kommothtestcase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import qataskkomooth.Komoothsignup;

/**
 * @author jiten
 *
 */
public class Komoothsignuptestcase {
	
	@Test
	public void signup()
	{
	
	// Initializing geckodriver for firefox	
    System.setProperty("webdriver.gecko.driver",
    "C:\\Users\\jiten\\git\\qatask\\qatask\\driver\\geckodriver.exe"); WebDriver
    
    // maximizing firefox driver 
	driver=new FirefoxDriver(); driver.manage().window().maximize();
	
	// navigating to komoot
	driver.get("https://www.komoot.com/");
		 
    	 
	Komoothsignup signup = new Komoothsignup(driver);
	
	signup.clicksignup();
	
	// closing firefox

	driver.quit(); 


}

}
