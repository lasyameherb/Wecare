package ProjectOne.Wecare;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;


public class LoginTest extends baseTest {
	
	@Test
	public void validLogin() {   	//Login
		loginPage login = new loginPage(driver);
		login.login("pa", "Open@1234");	
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(10));
		By elementLocator = By.xpath("//img[@alt='logo']");
		wait.until(ExpectedConditions.visibilityOfElementLocated(elementLocator));
    	String expectedUrl = "http://uat-env.ap-southeast-1.elasticbeanstalk.com/#dashboard";
        Assert.assertEquals(driver.getCurrentUrl(),expectedUrl);
	}
   
        @Test
     public void inValidLogin() {  //Login Fail
        	loginPage login = new loginPage(driver);
    		login.login("pa", "Open@123");
    		
    		
    		String errmsg= login.getemsg();
    		Assert.assertEquals(errmsg,"Login failed. Please check your credentials.");
    		
    		login.btn();
    		
     }  
        
        
        
	

	
}
