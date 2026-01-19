package ProjectOne.Wecare;

import org.testng.annotations.Test;

public class prgmMovieOfferTest extends baseTest {

	@Test
	public void offeringlist() {
		
		prgmMovieOfferings movielist = new prgmMovieOfferings(driver);
		movielist.toOfferingList();
		movielist.getRowCount();
		movielist.getcolumnCount();
		//movielist.readdata();
		movielist.cellValue();
		movielist.rowsBasedValue();
	}
}
