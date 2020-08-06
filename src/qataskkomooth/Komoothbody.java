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
public class Komoothbody {
	
public WebDriver driver;
	
    //locators for komooth body
	By cookie = By.xpath("//*[@id=\"google_analytics_gdpr_portal\"]/div/div/div/div[2]/div/div[2]/button");
	By hiking = By.xpath("//*[@id=\"pageMountNode\"]/div/div[2]/div/main/div[2]/div/div[2]/div[2]/div/div[1]/ul/li[1]/a");
	By biketouring = By.xpath("//*[@id=\"pageMountNode\"]/div/div[2]/div/main/div[2]/div/div[2]/div[2]/div/div[1]/ul/li[2]/a");
	By mountainbiking = By.xpath("//*[@id=\"pageMountNode\"]/div/div[2]/div/main/div[2]/div/div[2]/div[2]/div/div[1]/ul/li[3]/a");
	By roadcycling = By.xpath("//*[@id=\"pageMountNode\"]/div/div[2]/div/main/div[2]/div/div[2]/div[2]/div/div[1]/ul/li[4]/a");
	
	// constructor to initlize webdriver
	public Komoothbody(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public void clickbody() {
		  driver.manage().timeouts().implicitlyWait(150,TimeUnit.SECONDS) ;
		  driver.findElement(cookie).click();
		  driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS) ;
		  driver.findElement(hiking).click();
		  driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS) ;
		  driver.findElement(biketouring).click();
		  driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS) ;
		  driver.findElement(mountainbiking).click();
		  driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS) ;
		  driver.findElement(roadcycling).click();
		  
		}

}
