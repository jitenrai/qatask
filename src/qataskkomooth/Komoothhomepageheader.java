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
public class Komoothhomepageheader {
	
    public WebDriver driver;
	
    
    // header locators on komooth home page
    By cookie = By.xpath("//*[@id=\"google_analytics_gdpr_portal\"]/div/div/div/div[2]/div/div[2]/button");
	By komooth = By.xpath("//*[@id=\"pageMountNode\"]/div/div[1]/div/div/a");
	By discover = By.xpath("//*[@id=\"pageMountNode\"]/div/div[1]/div/div/div[1]/ul/li[1]/a");
	By routeplanner = By.xpath("//*[@id=\"pageMountNode\"]/div/div[1]/div/div/div[1]/ul/li[2]/a");
	By features = By.xpath("//*[@id=\"pageMountNode\"]/div/div[1]/div/div/div[1]/ul/li[3]/a");
	By pricing = By.xpath("//*[@id=\"pageMountNode\"]/div/div[1]/div/div/div[1]/ul/li[4]/a");
	
	
	// constructor to initlize webdriver
	
	public Komoothhomepageheader(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void clickdiscover()
	{
		driver.manage().timeouts().implicitlyWait(150,TimeUnit.SECONDS) ;
		driver.findElement(cookie).click();
		driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS) ;	
		driver.findElement(discover).click();
		driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS) ;	
		driver.findElement(komooth).click();
		driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS) ;	
	}
	
	public void clickrouteplanner()
	{
		driver.manage().timeouts().implicitlyWait(150,TimeUnit.SECONDS) ;
		driver.findElement(cookie).click();
		driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS) ;	
		driver.findElement(routeplanner).click();
		driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS) ;	
		driver.findElement(komooth).click();
		driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS) ;	
	}
	
	
	public void clickfeatures()
	{
		driver.manage().timeouts().implicitlyWait(150,TimeUnit.SECONDS) ;
		driver.findElement(cookie).click();
		driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS) ;	
		driver.findElement(features).click();
		driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS) ;	
		driver.findElement(komooth).click();
		driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS) ;	
		
	}
	
	public void clickpricing()
	{
		driver.manage().timeouts().implicitlyWait(150,TimeUnit.SECONDS) ;
		driver.findElement(cookie).click();
		driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS) ;	
		driver.findElement(pricing).click();
		driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS) ;	
		driver.findElement(komooth).click();
		driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS) ;	
	}
	
	
	

}
