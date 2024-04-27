package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import contact.Contact;

class ContactTest {

	@Test
	void testContactClass() {
		Contact contact = new Contact(
				"001",
				"Brandon",
				"Walters",
				"0123456789",
				"123 Street");
		assertTrue(contact.getContactID().equals("001"));
		assertTrue(contact.getFirstName().equals("Brandon"));
		assertTrue(contact.getLastName().equals("Walters"));
		assertTrue(contact.getPhone().equals("0123456789"));
		assertTrue(contact.getAddress().equals("123 Street"));
	}
	
	
	@Test
	void testContactClassIdToLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("01234567891", "Brandon", "Walters", "0123456789", "123 Street");
		});
	}
	
	@Test
	void ContactClassFirstNameToLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("001", "Brandon0123", "Walters", "0123456789", "123 Street");
		});
	}
	
	@Test
	void ContactClassLasttNameToLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("001", "Brandon", "Walters0123", "0123456789", "123 Street");
		});
	}
	
	@Test
	void ContactClassPhoneToLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("001", "Brandon", "Walters", "01234567890", "123 Street");
		});
	}
	
	@Test
	void ContactClassAdressToLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("001", "Brandon", "Walters", "0123456789", "012345678901234567890123 Street");
		});
	}
	
	@Test
	void ContactClassIdIsNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact(null, "Brandon", "Walters", "0123456789", "123 Street");
		});
	}
	
	@Test
	void ContactClassFirstNameIsNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("001", null, "Walters", "0123456789", "123 Street");
		});
	}
	
	@Test
	void ContactClassLastNameIsNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("001", "Brandon", null, "0123456789", "123 Street");
		});
	}
	
	@Test
	void ContactClassPhoneIsNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("001", "Brandon", "Walters", null, "123 Street");
		});
	}
	
	@Test
	void ContactClassAddressIsNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("001", "Brandon", "Walters", "0123456789", null);
		});
	}
}
