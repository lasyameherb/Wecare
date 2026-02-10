package ProjectOne.Wecare;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
//my committed changes
public class PrgmBooking extends loginPage {

	
	WebDriver driver;
	WebDriver wait;
	
	public PrgmBooking(WebDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="programsLink")
	private WebElement programsLinkmenu;
	
	@FindBy(xpath= "//a[text()='BeMyKaki Movie Bus'] ")
	private WebElement submenumovies;
	
	
	@FindBy(id="movieBooking")
	private WebElement bookingLink;
	
	 @FindBy(xpath="//input[@id='am']/following-sibling::span[@class='checkmark1']")
	 private WebElement radioBtn;
	
	public void toBookingLink() {
		programsLinkmenu.click();
		submenumovies.click();
		bookingLink.click();
		
	}
	
	
	public void BookingAvailability() {
		radioBtn.click();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript(
		    "document.getElementById('eventDate').value='25-01-2026'");
	}
}
