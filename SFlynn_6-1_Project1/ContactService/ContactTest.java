import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ContactTest {
	
	// --- Test Id ---
	@Test
	// Test a vaild Id
	void testValidId() {
		Contact testContact = new Contact("A1B2C3D4E5", "Sean", "Flynn", "1112223333", "Monkey Island");
		assertEquals("A1B2C3D4E5", testContact.getId());
	}
	
	@Test
	// Test an invalid Id
	void testInvalidId() {
		assertThrows(IllegalArgumentException.class, () ->
        new Contact("A1B2C3D4E5F6", "Sean", "Flynn", "1112223333", "Monkey Island"));
	}
	
	@Test
	// Test a null Id
	void testNullId() {
		assertThrows(IllegalArgumentException.class, () ->
        new Contact(null, "Sean", "Flynn", "1112223333", "Monkey Island"));
		
	}
	
	
	// --- Test First name ---
	
	@Test
	// Test a valid first name
	void testValidFirstName() {
		Contact testContact = new Contact("A1B2C3D4E5", "Sean", "Flynn", "1112223333", "Monkey Island");
		assertEquals("Sean", testContact.getFirstName());
	}
	
	@Test
	// Test a long first name
	void testInvalidFirstName() {
		assertThrows(IllegalArgumentException.class, () ->
        new Contact("A1B2C3D4E5", "Sean Stunt Man Wannabe", "Flynn", "1112223333", "Monkey Island"));
	}
	
	@Test
	// Test a null first name
	void testNullFirstName() {
		assertThrows(IllegalArgumentException.class, () ->
        new Contact("A1B2C3D4E5", null, "Flynn", "1112223333", "Monkey Island"));
	}
	
	// --- Test last name ---
	
	@Test
	// Test a valid last name
	void testValidLastName() {
		Contact testContact = new Contact("A1B2C3D4E5", "Sean", "Flynn", "1112223333", "Monkey Island");
		assertEquals("Flynn", testContact.getLastName());
	}
	
	@Test
	// Test a long last name
	void testInvalidLastName() {
		assertThrows(IllegalArgumentException.class, () ->
        new Contact("A1B2C3D4E5", "Sean", "Could use a sandwich Flynn", "1112223333", "Monkey Island"));
	}
	
	@Test
	// Test a null last name
	void testNullLastName() {
		assertThrows(IllegalArgumentException.class, () ->
        new Contact("A1B2C3D4E5", "Sean", null, "1112223333", "Monkey Island"));
	}
	
	// -- Test number ---
	
	@Test
	// Test a valid number
	void testValidNumber() {
		Contact testContact = new Contact("A1B2C3D4E5", "Sean", "Flynn", "1112223333", "Monkey Island");
		assertEquals("1112223333", testContact.getNumber());
	}
	
	@Test
	// Test a long number
	void testInvalidNumber() {
		assertThrows(IllegalArgumentException.class, () ->
	    new Contact("A1B2C3D4E5", "Sean", "Flynn", "111222333344445555", "Monkey Island"));	
	}
	
	@Test
	// Test a null number
	void testNullNumber() {
		assertThrows(IllegalArgumentException.class, () ->
	    new Contact("A1B2C3D4E5", "Sean", "Flynn", null, "Monkey Island"));	
	}
	
	// --- Test address ---
	
	@Test
	// Test a valid address
	void testValidAddress() {
		Contact testContact = new Contact("A1B2C3D4E5", "Sean", "Flynn", "1112223333", "Monkey Island");
		assertEquals("Monkey Island", testContact.getAddress());
	}
	
	@Test
	// Test a long address
	void testInvalidAddress() {
		assertThrows(IllegalArgumentException.class, () ->
	    new Contact("A1B2C3D4E5", "Sean", "Flynn", "1112223333", "Monkey Island, home of the dragon lizard Nina"));	
	}
	
	@Test
	// Test a null address
	void testNullAddress() {
		assertThrows(IllegalArgumentException.class, () ->
	    new Contact("A1B2C3D4E5", "Sean", "Flynn", "1112223333", null));	
	}
}
