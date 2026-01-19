package ProjectOne.Wecare;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class loginPage {

	
	WebDriver driver;
	
	//constructor
	
	    public loginPage(WebDriver driver) {
		this.driver =driver;
		PageFactory.initElements(driver, this);
		
	}
	    
	    //Locators
	    
	    @FindBy(id="userID")
	    private WebElement userField;
	    
	    @FindBy(id="password")
	    private WebElement passwordField;
	    
	    @FindBy(xpath="//button[@id='login']")
	    private WebElement signUp;
	    
	    @FindBy(xpath= "//p[contains(text(),'Login failed')]")
	    private WebElement errormsg;
	    
	    
	    @FindBy(xpath="//div[@class=\"col-xs-12\"]/button[contains(@class,'btn-default')]")
	    private WebElement okBtn;
	    
	    //Action
	    
	    public void user(String userName) {
	    	userField.sendKeys(userName);
	    }
	    
	    public void password(String pswrd) {
	    	passwordField.sendKeys(pswrd);
	    }
	    
	    public void signup() {
	    	signUp.click();
	    }
	    
	   
	    public void login(String userName, String pswrd) {
	    	user(userName);
	    	password(pswrd);
	    	signup();
	    }
	    
	    public String getemsg() {
	    
	    	return errormsg.getText();
	    	
	    }
	    
	    public void btn() {
		    
	    	okBtn.click();
	    	
	    }
}
