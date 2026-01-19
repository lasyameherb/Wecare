package ProjectOne.Wecare;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class ProgramsLinksPage extends loginPage  {
	
	WebDriver driver;
	WebDriver wait;
	
	public ProgramsLinksPage(WebDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="programsLink")
	private WebElement programsLinkmenu;
	
	@FindBy(xpath= "//a[text()='BeMyKaki Movie Bus'] ")
	private WebElement submenumovies;
	
	@FindBy(id="addMovies")
	private WebElement addMoviepage;
	@FindBy(id="movieTitle")
	private WebElement movieName;
	
	@FindBy(id="movieYear")
	private WebElement movieYear;
	
	@FindBy(id="movieStudio")
	private WebElement movieStudio;
	
	@FindBy(id="durationMovieHr")
	private WebElement hrs;
	
	@FindBy(id="durationMovieMin")
	private WebElement movieMin;
	
	@FindBy(id="movieLanguage")
	private WebElement movieLang;
	
	
	@FindBy(id="addMovieSubmit")
	private WebElement submitbutton;
	
	@FindBy(xpath = "//input[@type='checkbox']")
	private List<WebElement> movieCategoryCheckboxes;
	
	@FindBy(className="modal-title")
	private WebElement sucessfullyMveAdded;
	
	@FindBy(id="movieSuccess")
	private WebElement closebtn;
	
	
	public void clickmenulink() {
		programsLinkmenu.click();
		submenumovies.click();
		addMoviepage.click();
		
	}
	
	
	public void addmovie(String title, String year, String movieStudiotext, String hours, String min, String lang) {
		WebDriverWait  wait =  new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("addMovieSubmit")));
		 movieName.sendKeys(title);
		 movieYear.sendKeys(year);
		 movieStudio.sendKeys(movieStudiotext);
		 Select dropdown = new Select(hrs);
		 dropdown.selectByValue(hours);
		 Select choose = new Select(movieMin);
		 choose.selectByVisibleText(min);
		 Select selectlang = new Select(movieLang);
		 selectlang.selectByVisibleText(lang);
		
	}
	
	
	public void selectMovieCategories(String... categories) {

	    JavascriptExecutor js = (JavascriptExecutor) driver;

	    for (String category : categories) {

	        WebElement checkbox = driver.findElement(
	            By.xpath("//span[normalize-space()='" + category + "']/preceding-sibling::input")
	        );

	        js.executeScript("arguments[0].scrollIntoView({block:'center'});", checkbox);

	        if (!checkbox.isSelected()) {
	            js.executeScript("arguments[0].click();", checkbox);
	        }
	    }
	    
	}
	
	
	public void addMoviebtn() {
		
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		 js.executeScript("document.getElementById('addMovieSubmit').click();");
		
	}
	
	public void msgclose() {
		
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		 WebElement successMsg = wait.until(ExpectedConditions.visibilityOf(sucessfullyMveAdded));
		
		String actual= successMsg.getText();
		String excpected = "Movie has been added successfully.";
		
		 Assert.assertEquals(actual, excpected);
			closebtn.click();
			
		
	}

}
