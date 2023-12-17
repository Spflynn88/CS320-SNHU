import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ContactServiceTest {

	@Test
	void testCreateContact() {
        ContactService contactService = new ContactService();
        Contact testContact = new Contact("A1B2C3D4E5", "Sean", "Flynn", "1112223333", "Monkey Island");

        contactService.createContact(testContact);
        assertEquals(testContact, contactService.findContact("A1B2C3D4E5"));

        // Check to add existing contact Id
        assertThrows(IllegalArgumentException.class, () ->
                contactService.createContact(new Contact("A1B2C3D4E5", "Sean", "Flynn", "1112223333", "Monkey Island")));
	}
	
	@Test
	void testRemoveContact() {
		ContactService contactService = new ContactService();
        Contact testContact = new Contact("A1B2C3D4E5", "Sean", "Flynn", "1112223333", "Monkey Island");
        
        contactService.createContact(testContact);
        contactService.removeContact("A1B2C3D4E5");
        assertNull(contactService.findContact("A1B2C3D4E5"));
	}
	
	@Test
	void testUpdateContact() {
		ContactService contactService = new ContactService();
        Contact testContact = new Contact("A1B2C3D4E5", "Sean", "Flynn", "1112223333", "Monkey Island");
        
        contactService.createContact(testContact);
        contactService.updateContact("A1B2C3D4E5", "Brutus", "the dog", "111800ADOG", "Asleep, the couch");
        
        assertEquals("Brutus", testContact.getFirstName());
        assertEquals("the dog", testContact.getLastName());
        assertEquals("111800ADOG", testContact.getNumber());
        assertEquals("Asleep, the couch", testContact.getAddress());
        
	}
	
	@Test
	void testFindContact() {
		ContactService contactService = new ContactService();
        Contact testContact = new Contact("A1B2C3D4E5", "Sean", "Flynn", "1112223333", "Monkey Island");
        
        contactService.createContact(testContact);
        assertEquals(testContact, contactService.findContact("A1B2C3D4E5"));
        assertNull(contactService.findContact("Waffle House"));
	}
}
