package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import contact.Contact;
import contact.ContactService;

class ContactServiceTest {
	private ContactService contactService;
	
	@BeforeEach
    public void setUp() {
        contactService = new ContactService();
    }
	
	@Test
	void testAddContact() {
		Contact contact = new Contact("001", "Brandon", "Walters", "0123456789", "123 Street");
		contactService.addContact(contact);
        assertEquals(contact, contactService.getContact("001"));
	}
	
	@Test
	void testDeleteContact() {
		Contact contact = new Contact("001", "Brandon", "Walters", "0123456789", "123 Street");
		contactService.addContact(contact);
		contactService.deleteContact("001");
		assertNull(contactService.getContact("001"));
	}
	
	@Test
    public void testUpdateFirstName() {
		Contact contact = new Contact("001", "Brandon", "Walters", "0123456789", "123 Street");
        contactService.addContact(contact);
        contactService.updateFirstName("001", "Bran");
        assertEquals("Bran", contactService.getContact("001").getFirstName());
    }

    @Test
    public void testUpdateLastName() {
		Contact contact = new Contact("001", "Brandon", "Walters", "0123456789", "123 Street");
        contactService.addContact(contact);
        contactService.updateLastName("001", "Walt");
        assertEquals("Walt", contactService.getContact("001").getLastName());
    }

    @Test
    public void testUpdatePhone() {
		Contact contact = new Contact("001", "Brandon", "Walters", "0123456789", "123 Street");
        contactService.addContact(contact);
        contactService.updatePhone("001", "0987654321");
        assertEquals("0987654321", contactService.getContact("001").getPhone());
    }

    @Test
    public void testUpdateAddress() {
		Contact contact = new Contact("001", "Brandon", "Walters", "0123456789", "123 Street");
        contactService.addContact(contact);
        contactService.updateAddress("001", "321 Street");
        assertEquals("321 Street", contactService.getContact("001").getAddress());
    }
}
