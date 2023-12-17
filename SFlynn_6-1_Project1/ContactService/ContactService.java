import java.util.Vector;

public class ContactService {
	// Attributes
	Vector<Contact> contacts = new Vector<>();
	
	// Constructor
	public ContactService() {}
	
	// Methods
	
	// Create contact
	public void createContact(Contact t_contact) {
		// Check for duplicate contact id
		Contact searchContact = findContact(t_contact.getId());
		
		if(searchContact == null) {
			// If no contact is found add it
			contacts.add(t_contact);
		}
		else {
			throw new IllegalArgumentException("Contact already exists");
		}
		
		
	}
	
	// Remove contact
	public void removeContact(String t_contactId) {
		Contact searchContact = findContact(t_contactId);
		
		// Remove the found contact or throw error if no contact is found
		if(searchContact != null) {
			contacts.remove(searchContact);
		}
		else {
			throw new IllegalArgumentException("Contact not found");
		}
		
	}
	
	// Update contact
	public void updateContact(String t_contactId, String t_firstName, String t_lastName, String t_number, String t_address) {
		Contact toUpdate = findContact(t_contactId);
		if(toUpdate == null) {
			throw new IllegalArgumentException("Contact not found");
		}
		
		if(t_firstName != null) {
			toUpdate.setFirstName(t_firstName);
		}
		
		if(t_lastName != null) {
			toUpdate.setLastName(t_lastName);
		}
		
		if(t_number != null) {
			toUpdate.setNumber(t_number);
		}
		
		if(t_address != null) {
			toUpdate.setAddress(t_address);
		}
		
	}
	
	// Find contact by ID
	public Contact findContact(String t_contactId) {
		for(Contact searchContact : contacts) {
			if(searchContact.getId().equals(t_contactId)) {
				return searchContact;
			}
		}
		// Return null if the contact is not found
		return null;
	}
}
