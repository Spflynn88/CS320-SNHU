
public class Contact {
	// Attributes
	private String firstName;
	private String lastName;
	private String id;
	private String number;
	private String address;
	
	// Constructor
	public Contact(String t_id, String t_firstName, String t_lastName, String t_number, String t_address) {
		
		// Assign attributes
		setFirstName(t_firstName);
		setLastName(t_lastName);
		setNumber(t_number);
		setAddress(t_address);
		setId(t_id);
	}
	
	// Gets
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public String getId() {
		return id;
	}
	
	public String getNumber() {
		return number;
	}
	
	public String getAddress() {
		return address;
	}
	
	// Sets
	private void setId(String t_id) {
		if(t_id == null || t_id.length() > 10) {
			throw new IllegalArgumentException("Invalid id");
		}
		this.id = t_id;
	}
	
	public void setFirstName(String t_name) {
		if(t_name == null || t_name.length() > 10) {
			throw new IllegalArgumentException("Invalid first name");
		}
		this.firstName = t_name;
	}
	
	public void setLastName(String t_name) {
		if(t_name == null || t_name.length() > 10) {
			throw new IllegalArgumentException("Invalid last name");
		}
		this.lastName = t_name;
	}
	
	public void setNumber(String t_num) {
		if(t_num == null || t_num.length() != 10) {
			throw new IllegalArgumentException("Invalid number");
		}
		this.number = t_num;
	}
	
	public void setAddress(String t_address) {
		if(t_address == null || t_address.length() > 30) {
			throw new IllegalArgumentException("Invalid address");
		}
		this.address = t_address;
	}
	
}







