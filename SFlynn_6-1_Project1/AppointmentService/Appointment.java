import java.util.Date;

public class Appointment {
	// Attributes
	String appId;
	String description;
	Date date;
	
	// Constructor
	public Appointment(String t_appId, String t_desc, Date t_date) {
		// Assign attributes
		setAppId(t_appId);
		setDate(t_date);
		setDescription(t_desc);
	}
	
	// Gets
	public String getAppId() {
		return appId;
	}
	
	public Date getDate() {
		return date;
	}
	
	public String getDescription() {
		return description;
	}
	
	// Sets
	public void setAppId(String t_id) {
		if(t_id == null || t_id.length() > 10) {
			throw new IllegalArgumentException("Invalid id");
		}
		this.appId = t_id;
	}
	
	public void setDate(Date  t_date) {
		if (t_date == null || t_date.before(new Date())) {
			throw new IllegalArgumentException("Invalid date - in the past");
		}
		this.date = t_date;
	}
	
	public void setDescription(String t_desc) {
		if(t_desc == null || t_desc.length() > 50) {
			throw new IllegalArgumentException("Invalid description");
		}
		this.description = t_desc;
	}
}
