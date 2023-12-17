
public class Task {
	// Attributes
	private String taskId;
	private String name;
	private String description;
	
	// Constructor
	public Task(String t_Id, String t_name, String t_description) {
		 
		// Assign attributes
		setTaskId(t_Id);
		setName(t_name);
		setDescription(t_description);	
	}
	
	// Gets
	public String getId() {
		return taskId;
	}
	
	public String getName() {
		return name;
	}
	
	public String getDescription() {
		return description;
	}
	
	// Sets
	public void setTaskId(String t_id) {
		if(t_id == null || t_id.length() > 10) {
			throw new IllegalArgumentException("Invalid id");
		}
		this.taskId = t_id;
	}
	
	public void setName(String t_name) {
		if(t_name == null || t_name.length() > 20) {
			throw new IllegalArgumentException("Invalid name");
		}
		this.name = t_name;
	}
	
	public void setDescription(String t_desc) {
		if(t_desc == null || t_desc.length() > 50) {
			throw new IllegalArgumentException("Invalid description");
		}
		this.description = t_desc;
	}
	
}
