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
public class Komoothfooter {
	
	public WebDriver driver;
	
	// locators for footer
	
	By cookie = By.xpath("//*[@id=\"google_analytics_gdpr_portal\"]/div/div/div/div[2]/div/div[2]/button");
	By komooth = By.xpath("//*[@id=\"pageMountNode\"]/div/div[1]/div/div/a");
	// what we offer
	By discover = By.xpath("//*[@id=\"footer\"]/section/div/div/div[1]/ul[1]/li[1]/a");
	By routeplanner = By.xpath("//*[@id=\"footer\"]/section/div/div/div[1]/ul[1]/li[2]/a");
	By features = By.xpath("//*[@id=\"footer\"]/section/div/div/div[1]/ul[1]/li[3]/a");
	// B2B
	By partners = By.xpath("//*[@id=\"footer\"]/section/div/div/div[1]/ul[2]/li[1]/a");
	By connect = By.xpath("//*[@id=\"footer\"]/section/div/div/div[1]/ul[2]/li[2]/a");
	By embedroutes = By.xpath("//*[@id=\"footer\"]/section/div/div/div[1]/ul[2]/li[3]/a");
	
	
	
	// constructor to initlize webdriver

	public Komoothfooter(WebDriver driver)
	{
		this.driver = driver;
	}
	
	
	 public void footer() {
		// what we offer
		  driver.manage().timeouts().implicitlyWait(150,TimeUnit.SECONDS) ;
		  driver.findElement(cookie).click();
		  driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS) ;
		  driver.findElement(discover).click();
		  driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS) ;
		  driver.findElement(komooth).click();
		  driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS) ;
		  driver.findElement(routeplanner).click();
		  driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS) ;
		  driver.findElement(komooth).click();
		  driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS) ;
		  driver.findElement(features).click();
		  driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS) ;
		  driver.findElement(komooth).click();
		// B2B
		  driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS) ;
		  driver.findElement(partners).click();
		  driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS) ;
		  driver.findElement(komooth).click();
		  driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS) ;
		  driver.findElement(connect).click();
		  driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS) ;
		  driver.findElement(komooth).click();
		  driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS) ;
		  driver.findElement(embedroutes).click();
		  driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS) ;
		  driver.findElement(komooth).click();
		
		}
		  

}
