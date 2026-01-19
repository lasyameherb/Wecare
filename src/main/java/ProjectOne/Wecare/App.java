package ProjectOne.Wecare;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        
    }

    // for using value attribute checkbox;
    
//    public void selectCategoriesByValue(String... values) {
//
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//
//        List<WebElement> checkboxes =
//                driver.findElements(By.xpath("//input[@type='checkbox']"));
//
//        for (WebElement checkbox : checkboxes) {
//            for (String value : values) {
//                if (checkbox.getAttribute("value").equalsIgnoreCase(value)) {
//
//                    js.executeScript("arguments[0].scrollIntoView(true);", checkbox);
//
//                    if (!checkbox.isSelected()) {
//                        js.executeScript("arguments[0].click();", checkbox);
//                    }
//                }
//            }
//        }
//    }

    
    
    
    //With selenium multiple checkbox
    
//    public void selectMovieCategories(String... categories) {
//
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//
//        for (String category : categories) {
//
//            WebElement checkbox = wait.until(
//                ExpectedConditions.elementToBeClickable(
//                    By.xpath("//span[normalize-space()='" + category + "']/preceding-sibling::input")
//                )
//            );
//
//            if (!checkbox.isSelected()) {
//                checkbox.click();
//            }
//        }
//    }
}
