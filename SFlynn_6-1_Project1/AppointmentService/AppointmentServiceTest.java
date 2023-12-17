import static org.junit.jupiter.api.Assertions.*;

import java.util.Calendar;
import java.util.Date;

import org.junit.jupiter.api.Test;

class AppointmentServiceTest {
	// Make a current and future date for testing
	Date currentDate = new Date();
	Calendar cal = Calendar.getInstance();
	Date appDate;
    
	public AppointmentServiceTest() {
		cal.setTime(currentDate);
		cal.add(Calendar.DAY_OF_MONTH, 3);
		this.appDate = cal.getTime();
	}
	
	@Test
	void addAppointmenttest() {
		AppointmentService testService = new AppointmentService();
		Appointment testApp = new Appointment("12345", "Do stuff", appDate);
		
		testService.addAppointment(testApp);
		
		assertEquals(testService.appointments.containsKey(testApp.getAppId()), true);
		
		// Test to add an existing appointment
		assertThrows(IllegalArgumentException.class, () ->
		testService.addAppointment(testApp));
	}
	
	@Test
	void removeAppointmentTest() {
		AppointmentService testService = new AppointmentService();
		Appointment testApp = new Appointment("12345", "Do stuff", appDate);
		
		testService.addAppointment(testApp);
		testService.removeAppointment("12345");
		
		assertEquals(testService.appointments.containsKey(testApp.getAppId()), false);
		
		// Test to remove a nonexistent appointment
				assertThrows(IllegalArgumentException.class, () ->
				testService.removeAppointment("12345"));
	}
	
	
	
	
	
	
	
	
	
	
	

}
