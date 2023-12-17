import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TaskTest {
	// ---- Test Id ----
	// Test valid Id
	@Test
	void testValidId() {
		Task testTask = new Task("123456789", "Testy Test", "Test the code!");
		assertEquals("123456789", testTask.getId());
	}
	
	// Test an invalid Id
	@Test
	void testInvalidId() {
		assertThrows(IllegalArgumentException.class, () ->
        new Task("123456789-100", "Testy Test", "Test the code!"));
	}

	// Test null Id
	@Test
	void testNullId() {
		assertThrows(IllegalArgumentException.class, () ->
        new Task(null, "Testy Test", "Test the code!"));
	}
	
	// ---- Test name ----
	// Test valid name
	@Test
	void testValidName() {
		Task testTask = new Task("123456789", "Testy Test", "Test the code!");
		assertEquals("Testy Test", testTask.getName());
	}
	
	// Test an invalid name
	@Test
	void testInvalidName() {
		assertThrows(IllegalArgumentException.class, () ->
        new Task("123456789", "Testy Test but now it's superduper long", "Test the code!"));
	}

	// Test null name
	@Test
	void testNullName() {
		assertThrows(IllegalArgumentException.class, () ->
        new Task("123456789", null, "Test the code!"));
	}
	
	// ---- Test Description ----
	// Test valid description
	@Test
	void testValidDescription() {
		Task testTask = new Task("123456789", "Testy Test", "Test the code!");
		assertEquals("Test the code!", testTask.getDescription());
	}
	
	// Test an invalid description
	@Test
	void testInvalidDescription() {
		assertThrows(IllegalArgumentException.class, () ->
        new Task("123456789", "Testy Test", "Test the code!! - 20Test the code!! - 40Test the code!! - 60"));
	}

	// Test null name
	@Test
	void testNullDescription() {
		assertThrows(IllegalArgumentException.class, () ->
        new Task("123456789", "Testy Test", null));
	}
	
	

}
