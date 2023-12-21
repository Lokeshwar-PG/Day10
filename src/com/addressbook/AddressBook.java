package com.addressbook;

import java.util.ArrayList;
import java.util.List;

public class AddressBook {
    private List<Contact> contacts;

    public AddressBook() {
        this.contacts = new ArrayList<>();
    }

    public void addContact(Contact contact) {
        contacts.add(contact);
        System.out.println(contact.getFirstName()+" added succesfully to the contacts");
    }

    public void updateContact(Contact updateContact) {
        String firstName = updateContact.getFirstName();
        for(Contact contact: contacts ) {
            int updateIndex = contacts.indexOf(contact);
            if(contact.getFirstName().equals(firstName)) {
                contacts.set(updateIndex, updateContact);
                break;
            }
        }
    }

    public void deleteContact(Contact contact) {
        contacts.remove(contact);
        System.out.println(contact.getFirstName()+" deleted successfully from the contacts");
    }

    public void displayContacts() {
        if(contacts.isEmpty()) {
            System.out.println("There is no contacts");
        }
        else {
            System.out.println("The available contacts are...");
            for(Contact contact: contacts) {
                System.out.println(contact.getFirstName()+" "+contact.getLastName()+" "+contact.getAddress()
                        +" "+contact.getCity()+" "+contact.getState()+ " "+contact.getZip()
                        +" "+contact.getPhoneNumber()+" "+contact.getEmail());
            }

        }
    }


}
