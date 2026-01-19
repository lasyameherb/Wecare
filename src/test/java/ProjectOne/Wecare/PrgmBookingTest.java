package ProjectOne.Wecare;

import org.testng.annotations.Test;

public class PrgmBookingTest extends baseTest{
	
	@Test
	
	public void checkAvailablity() {
		
		
		PrgmBooking movie =new PrgmBooking(driver) ;
		movie.toBookingLink();
		movie.BookingAvailability();
		
		
	}

}
