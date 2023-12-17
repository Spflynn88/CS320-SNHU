import java.util.Vector;

public class TaskService {
	// Attributes
	Vector<Task> tasks = new Vector<>();
	
	// Constructor
	public TaskService() {}
	
	// Methods
	// Find task by ID
	public Task findTask(String t_taskId) {
		for (Task searchTask: tasks) {
			if (searchTask.getId().equals(t_taskId)) {
				return searchTask;
			}
		}
		// Return null if contact is not found
		return null;
	}
	
	
	// Create task
	public void createTask(Task t_task) {
		// Check for duplicate task Id
		Task searchTask = findTask(t_task.getId());
		
		// If no duplicate found crate task
		if (searchTask == null) {
			tasks.add(t_task);
		}
		else {
			throw new IllegalArgumentException("Contact task exists");
		}
	}
	
	// Remove task
	public void removeTask(String t_taskId) {
		// Find the requested task
		Task searchTask = findTask(t_taskId);
		if(searchTask != null) {
			tasks.remove(searchTask);
		}
		else {
			throw new IllegalArgumentException("Task not found");
		}
	}
	
	// Update task
	public void updateTask(String t_taskId, String t_name, String t_desc) {
		// Search for the task with ID, then update name or description or both
		Task toUpdate = findTask(t_taskId);
		
		if(t_name != null) {
			toUpdate.setName(t_name);
		}
		
		if(t_desc != null) {
			toUpdate.setDescription(t_desc);
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
