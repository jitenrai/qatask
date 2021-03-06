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
public class komoothdiscoverpage {

	public WebDriver driver;
	
	//locators for discover page
	By cookie = By.xpath("//*[@id=\"google_analytics_gdpr_portal\"]/div/div/div/div[2]/div/div[2]/button");
	By komooth = By.xpath("//*[@id=\"pageMountNode\"]/div/div[1]/div/div/a");
	By discover = By.xpath("//*[@id=\"pageMountNode\"]/div/div[1]/div/div/div[1]/ul/li[1]/a");
	By hiking = By.xpath("//*[@id=\"sports\"]/div/div/div/div[1]/div/div[2]");
	By biketrails = By.xpath("//*[@id=\"sports\"]/div/div/div/div[2]/div/div[3]");
	By mountainbike = By.xpath("//*[@id=\"sports\"]/div/div/div/div[3]/div/div[2]");
	By roadroutes = By.xpath("//*[@id=\"sports\"]/div/div/div/div[4]/div/div[2]");
	By runningtrails = By.xpath("//*[@id=\"sports\"]/div/div/div/div[5]/div/div[2]");
	By mountianhikes = By.xpath("//*[@id=\"sports\"]/div/div/div/div[6]/div/div[2]");

	// constructor to initlize webdriver

	public komoothdiscoverpage(WebDriver driver)
	{
		this.driver = driver;
	}

	
   public void clickdiscoverpage() {
	  driver.manage().timeouts().implicitlyWait(150,TimeUnit.SECONDS) ;
	  driver.findElement(cookie).click();
	  driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS) ;
	  driver.findElement(discover).click();
	  driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS) ;
	  
	}
	  
	 
	public void hikingtrails() {
		driver.manage().timeouts().implicitlyWait(150,TimeUnit.SECONDS) ;
		driver.findElement(cookie).click();
		driver.manage().timeouts().implicitlyWait(150, TimeUnit.SECONDS);
		driver.findElement(hiking).click();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		driver.findElement(discover).click();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
	}

	public void bikeroutetrails() {
		driver.manage().timeouts().implicitlyWait(150,TimeUnit.SECONDS) ;
	    driver.findElement(cookie).click();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		driver.findElement(biketrails).click();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		driver.findElement(discover).click();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
	}

	public void mountianbikingtrails() {
		
		driver.manage().timeouts().implicitlyWait(150,TimeUnit.SECONDS) ;
	    driver.findElement(cookie).click();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		driver.findElement(mountainbike).click();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		driver.findElement(discover).click();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
	}

	public void roadcyclingroutes() {
		
		driver.manage().timeouts().implicitlyWait(150,TimeUnit.SECONDS) ;
		driver.findElement(cookie).click();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		driver.findElement(roadroutes).click();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		driver.findElement(discover).click();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
	}

	public void runningtrailsroutes() {
		
		driver.manage().timeouts().implicitlyWait(150,TimeUnit.SECONDS) ;
	    driver.findElement(cookie).click();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		driver.findElement(runningtrails).click();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		driver.findElement(discover).click();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
	}

	public void mountainhikeroutes() {
		
		driver.manage().timeouts().implicitlyWait(150,TimeUnit.SECONDS) ;
		driver.findElement(cookie).click();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		driver.findElement(mountianhikes).click();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		driver.findElement(discover).click();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
	}

}
