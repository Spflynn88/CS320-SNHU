import java.util.Map;
import java.util.HashMap;

public class AppointmentService {
	// Attributes
	Map<String, Appointment> appointments = new HashMap<>();
	
	// Constructor
	public AppointmentService() {}
	
	// Methods
	// Add appointment
	public void addAppointment(Appointment t_appnt) {
		// Check if id exists
		if (appointments.containsKey(t_appnt.getAppId())) {
			throw new IllegalArgumentException("Appointment already exists");
		}
		else {
			appointments.put(t_appnt.getAppId(), t_appnt);
		}
	}
	
	// Remove appointment
	public void removeAppointment(String t_appId) {
		if (appointments.containsKey(t_appId)) {
			appointments.remove(t_appId);
		}
		else {
			throw new IllegalArgumentException("Appointment does not exist");
		}
	}
	
	
	
}
