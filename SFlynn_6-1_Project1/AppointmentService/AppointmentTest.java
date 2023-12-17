import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import java.util.Date;
import java.util.Calendar;

class AppointmentTest {
	// Make a current and future date for testing
	Date currentDate = new Date();
	Calendar cal = Calendar.getInstance();
	Date appDate;
    
	public AppointmentTest() {
		cal.setTime(currentDate);
		cal.add(Calendar.DAY_OF_MONTH, 3);
		this.appDate = cal.getTime();
	}
    
	
	// --- Test Id ---
	@Test
	// Test a instance
	void testValidInstance() {
		Appointment testAppointment = new Appointment("A1B2C3D4E5",  "Do stuff", appDate);
		assertEquals("A1B2C3D4E5", testAppointment.getAppId());
		assertEquals(appDate, testAppointment.getDate());
		assertEquals("Do stuff", testAppointment.getDescription());
	}
	
	@Test
	// Test an invalid Id
	void testInvalidId() {
		Date date = new Date();
		assertThrows(IllegalArgumentException.class, () ->
        new Appointment("A1B2C3D4E5F6-LONG", "Do stuff", appDate));
	}
	
	@Test
	// Test a null Id
	void testNullId() {
		Date date = new Date();
		assertThrows(IllegalArgumentException.class, () ->
        new Appointment(null, "Do stuff", appDate));
	}
	
	// --- Test Date ---
	@Test
	// Test an invalid date
	void testInvalidDate() {
		Date date = new Date();
		assertThrows(IllegalArgumentException.class, () ->
        new Appointment("12345", "Do stuff", date));
	}
	
	@Test
	// Test a null date
	void testNullDate() {
		assertThrows(IllegalArgumentException.class, () ->
		new Appointment("12345", "Do stuff", null));
	}
	
	// --- Test Description ---
	@Test
	// Test invalid description
	void testInvalidDescription() {
		assertThrows(IllegalArgumentException.class, () ->
		new Appointment("12345", "This is 10This is 20This is 30This is 40This is 50This is 60", appDate));
	}
	
	// Test null description
		void testNullDescription() {
			assertThrows(IllegalArgumentException.class, () ->
			new Appointment("12345", null, appDate));
		}
	
	

}
