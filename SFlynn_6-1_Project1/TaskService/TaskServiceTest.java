import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TaskServiceTest {
	
	// Test the create task and ensure duplicates are caught
	@Test
	void testCreateContact() {
        TaskService taskService = new TaskService();
        Task testTask = new Task("123456789", "Testy Test", "Test the code!");

        taskService.createTask(testTask);
        assertEquals(testTask, taskService.findTask("123456789"));

        // Check to add existing contact Id
        assertThrows(IllegalArgumentException.class, () ->
                taskService.createTask(new Task("123456789", "Test", "Description text")));
	}
	
	// Test task removal
	@Test
	void testRemoveTask() {
		TaskService taskService = new TaskService();
        Task testTask = new Task("123456789", "Testy Test", "Test the code!");

        taskService.createTask(testTask);
        taskService.removeTask("123456789");
        assertNull(taskService.findTask("123456789"));
	}
	
	// Test the task search function
	@Test
	void testFindTask() {
		TaskService taskService = new TaskService();
        Task testTask = new Task("123456789", "Testy Test", "Test the code!");

        taskService.createTask(testTask);
        assertEquals(testTask, taskService.findTask("123456789"));
        
        // Test to make sure null is returned when no task is found
        assertNull(taskService.findTask("Waffle House"));
	}
	
	// Test task update
	@Test
	void testUpdateContact() {
		TaskService taskService = new TaskService();
        Task testTask = new Task("123456789", "Testy Test", "Test the code!");

        taskService.createTask(testTask);
        taskService.updateTask("123456789", "Pet the dog", "the dog needs to be pet");
        
        assertEquals("Pet the dog", testTask.getName());
        assertEquals("the dog needs to be pet", testTask.getDescription());
	}

}
