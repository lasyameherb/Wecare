package ProjectOne.Wecare;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class prgmMovieOfferings extends loginPage{
	
	
	WebDriver driver;
	WebDriver wait;
	
	public prgmMovieOfferings(WebDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="programsLink")
	private WebElement programsLinkmenu;
	
	@FindBy(xpath= "//a[text()='BeMyKaki Movie Bus'] ")
	private WebElement submenumovies;
	
	
	@FindBy(id="movieOffering")
	private WebElement offeringLink;
	
	//@FindBy(xpath="//table[@id='table_movies']/tbody/tr")
	//private List<WebElement> tablerows;

	
	
	public void toOfferingList() {
		programsLinkmenu.click();
		submenumovies.click();
		offeringLink.click();
		
	}
	
	//How do you get the number of rows in a table?
	
	public void getRowCount() {
	    List<WebElement> rows = driver.findElements(
	        By.xpath("//table[@id='table_movies']/tbody/tr")
	    );
	    System.out.println(rows.size());
	}
	
	
	//How do you get the number of columns?
	public void getcolumnCount() {
		List<WebElement> columns =
				driver.findElements(By.xpath("//table[@id='table_movies']/thead/tr/th"));

				System.out.println(columns.size());
	}
	
	
	//How do you read all data from a table?
	
	public void readdata() {
		  List<WebElement> tabledata = driver.findElements(By.xpath("//table[@id='table_movies']/tbody/tr"));
		
		for(WebElement tabletext:tabledata) {
			System.out.println(tabletext.getText());
		}
	}
	
	//How do you fetch a specific cell value (Row & Column)?
	
	public void cellValue() {
		
		String value = driver.findElement(
			    By.xpath("//table[@id='table_movies']/tbody/tr[1]/td[3]")
			).getText();
		
		System.out.println(value);
	}
	
	//How do you find a row based on cell value? Status = update
	
	public void rowsBasedValue() {
		 List<WebElement> rowsdata = driver.findElements(By.xpath("//table[@id='table_movies']/tbody/tr"));
			
			for(WebElement rowdata:rowsdata) {
				if(rowdata.getText().contains("Action")) {
				System.out.println("update option rowns found:" + rowdata.getText());
				}
			}
		}
	
	
}
