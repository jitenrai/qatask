/**
 * 
 */
package qataskkomooth;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * @author jiten
 *
 */
public class Komoothsignup {
	
	public WebDriver driver;

	By cookie = By.xpath("//*[@id=\"google_analytics_gdpr_portal\"]/div/div/div/div[2]/div/div[2]/button");
	By signup = By.xpath("//*[@id=\"pageMountNode\"]/div/div[1]/div/div/div[2]/div[3]/div/button");
	
			
	
	// constructor to initlize webdriver

	public Komoothsignup(WebDriver driver)
	{
		this.driver = driver;
	}
	
	 public void clicksignup() {
		  
		  driver.manage().timeouts().implicitlyWait(150,TimeUnit.SECONDS) ;
		  driver.findElement(cookie).click();
		  driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS) ;
		  driver.findElement(signup).click();
		  driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS) ;
		  driver.findElement(By.name("email")).sendKeys("test");
		  driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS) ;
		}
		  


}
