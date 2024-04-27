package contact;

import java.util.HashMap;
import java.util.Map;

public class ContactService {
	private Map<String, Contact> contacts;

    public ContactService() {
        contacts = new HashMap<>();
    }

    public void addContact(Contact contact) {
        contacts.put(contact.getContactID(), contact);
    }

    public void deleteContact(String contactID) {
        contacts.remove(contactID);
    }

    public void updateFirstName(String contactID, String firstName) {
        if (contacts.containsKey(contactID)) {
            Contact contact = contacts.get(contactID);
            contact.setFirstName(firstName);
            contacts.put(contactID, contact);
        }
    }

    public void updateLastName(String contactID, String lastName) {
        if (contacts.containsKey(contactID)) {
            Contact contact = contacts.get(contactID);
            contact.setLastName(lastName);
            contacts.put(contactID, contact);
        }
    }

    public void updatePhone(String contactID, String phone) {
        if (contacts.containsKey(contactID)) {
            Contact contact = contacts.get(contactID);
            contact.setPhone(phone);
            contacts.put(contactID, contact);
        }
    }

    public void updateAddress(String contactID, String address) {
        if (contacts.containsKey(contactID)) {
            Contact contact = contacts.get(contactID);
            contact.setAddress(address);
            contacts.put(contactID, contact);
        }
    }
    
    public Contact getContact(String contactID) {
        return contacts.get(contactID);
    }

}
