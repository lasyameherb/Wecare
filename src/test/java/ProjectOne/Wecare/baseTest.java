package ProjectOne.Wecare;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


public class baseTest {
	protected WebDriver driver;
	
	@BeforeMethod
	public void steup() {
	 driver = new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	 driver.get("http://uat-env.ap-southeast-1.elasticbeanstalk.com/");
	 
	 //Login
	 loginPage login = new loginPage(driver);
	 login.login("pa", "Open@1234");
	 
	}
	
//	@AfterMethod
//	public void tearDown() {
//		driver.quit();
//	}
}


// develop chnages
