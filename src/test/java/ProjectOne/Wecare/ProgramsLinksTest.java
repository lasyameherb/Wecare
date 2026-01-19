package ProjectOne.Wecare;

import org.testng.annotations.Test;

public class ProgramsLinksTest extends baseTest {
	
	
	@Test
	public void addmoveinProgram() {
	ProgramsLinksPage addProgram= new ProgramsLinksPage(driver);
	addProgram.clickmenulink();
	addProgram.addmovie("Salar", "2016", "unknown", "02", "45", "Tamil");
	addProgram.selectMovieCategories("Action", "Comedy", "Sci-Fi");
	addProgram.addMoviebtn();
	addProgram.msgclose();
    }
}
