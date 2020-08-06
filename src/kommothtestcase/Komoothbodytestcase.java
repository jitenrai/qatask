/**
 * 
 */
package kommothtestcase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import qataskkomooth.Komoothbody;
import qataskkomooth.Komoothsignup;

/**
 * @author jiten
 *
 */
public class Komoothbodytestcase {
	
	@Test
	public void body()
	{
	
	// Initializing geckodriver for firefox	
    System.setProperty("webdriver.gecko.driver",
    "C:\\Users\\jiten\\git\\qatask\\qatask\\driver\\geckodriver.exe"); WebDriver
    
    // maximizing firefox driver 
	driver=new FirefoxDriver(); driver.manage().window().maximize();
	
	// navigating to komoot
	driver.get("https://www.komoot.com/");
		 
	Komoothbody body = new Komoothbody(driver);	 
	
	body.clickbody();
	
	// closing firefox

	driver.quit(); 


}

}
