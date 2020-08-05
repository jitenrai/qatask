/**
 * 
 */
package kommothtestcase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
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
	
	System.setProperty("webdriver.gecko.driver", "C:\\Users\\jiten\\eclipse-workspace\\qatask\\driver\\geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("https://www.komoot.com/");
	Komoothhomepageheader headerpage = new Komoothhomepageheader(driver);
	
	headerpage.clickdiscover();
	headerpage.clickrouteplanner();
	headerpage.clickfeatures();
	headerpage.clickpricing();
	
	
	driver.quit();
	
	
	}
	

}
