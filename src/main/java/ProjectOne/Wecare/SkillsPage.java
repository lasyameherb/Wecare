package ProjectOne.Wecare;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;



public class SkillsPage extends loginPage {
WebDriver driver;
	
	//constructor
       
	    public SkillsPage(WebDriver driver) {
	    super(driver);
		this.driver =driver;
		PageFactory.initElements(driver, this);
		
	}
	    
	    //Locators
	    
	    @FindBy(id="skillsLink")
	    private WebElement skillstoggle;
	    
	    @FindBy(id="addSkill")
	    private WebElement addSkillOpt;
	    
	    @FindBy(name="partnerAdd")
	    private WebElement partnerfield;
	    
	    @FindBy(id="categoryAdd")
	    private WebElement categoryfield;
	    
	    @FindBy(id="skillDescAdd")
	    private WebElement topicDescription;
	    
	    @FindBy(name="venueSkill")
	    private WebElement platformfield;
	    
	    @FindBy(id="fromPartnerDate")
	    private WebElement pickFromDate;
	    
	    @FindBy(id="toPartnerDate")
	    private WebElement pickToDate;
	    
	    @FindBy(id="minBen")
	    private WebElement minparctipates;
	    
	    @FindBy(id="maxBen")
	    private WebElement maxparctipates;
	    
	    
	    @FindBy(xpath="//input[@type='checkbox']")
	    private List<WebElement> allcheckboxes;
	    
	    public void clickToggle() {
	    	
	    	skillstoggle.click();
	    	addSkillOpt.click();
	    }
	    
	    
	    public void choosePartnerField() {
	    	WebDriverWait  wait =  new WebDriverWait(driver, Duration.ofSeconds(15));
	          wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("partnerAdd")));
	    	
	    	Select select= new Select(partnerfield);
	    	List<WebElement> options = select.getOptions();
	    	
	    	boolean smrtFound = false;
	    	
	    	for(WebElement option :options) {
	    		System.out.println("Dropdown Options" + option.getText());
	    		
	    		if(option.getText().equalsIgnoreCase("smrt")) {
	    			smrtFound = true;
	    			select.selectByVisibleText("smrt");
	    			break;
	    		}
	    	}
	    	
	    	Assert.assertTrue(smrtFound, "'smrt' option is NOT present in the dropdown");
	    	
	    	
	    }
	    
	    public void choosecategoryField() {
	    	Select select= new Select(categoryfield);
	    	select.selectByValue("6");
	    }
	    
	    public void enterTopic(String descp) {
	    	topicDescription.sendKeys(descp);
	    	
	    	String actualvalue = topicDescription.getAttribute("value");
	    	Assert.assertEquals(actualvalue.length(), 400);
	    }
	    
	    
	    public void choosePlatformField() {
	    	Select select= new Select(platformfield);
	    	select.selectByIndex(1);
	    }
	    
       
	    public void fromDate(String datefrom) {
	    	JavascriptExecutor js = (JavascriptExecutor) driver;
	    	js.executeScript("document.getElementById('fromPartnerDate').value='" + datefrom + "'");
	    	
	    }
	    
	    public void toDate(String tofrom) {
	    	
	    	pickToDate.sendKeys(tofrom);
	    }
	   
	    public void minParticipate(String num) {
	    	minparctipates.sendKeys(num);  
	    	   	
	    }
	    
	   
	    public void maxParticipate(int num) {
	    	maxparctipates.sendKeys(String.valueOf(num));  
	    	   	
	    }
	    

	    
	    public void selectCheckbox() {
	        //WebElement checkbox = driver.findElement(By.id("LI"));
	        
	        JavascriptExecutor js = (JavascriptExecutor) driver;
	        js.executeScript("document.getElementById('LI').click();");

	       
	    }
	    
	    
	    
	    
	    public void remark(String Text) {
	    	WebElement addRemark = driver.findElement(By.id("addnRemarksAdd"));
	    	addRemark.sendKeys(Text);
	    }
}
