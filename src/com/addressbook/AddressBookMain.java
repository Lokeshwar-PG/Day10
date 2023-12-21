package com.addressbook;

public class AddressBookMain {
    public static void main(String[] args) {
        AddressBook a1 = new AddressBook();
        Contact c1 = new Contact("Lokeshwar", "PG", "Anna Nagar", "Chennai", "TamilNadu", 601202, "9677595842", "pglokeshwarmca@gmail.com");
        Contact c2 = new Contact("Rajesh", "Pinjala", "Jubilee Hills", "Hyderabad", "Telangana", 501202, "9677595842", "pglokeshwarmca@gmail.com");
        Contact c3 = new Contact("Rajesh", "Kumar", "Banashankari", "Banglore", "Karnataka", 571202, "9677595842", "pglokeshwarmca@gmail.com");
        a1.addContact(c1);
        a1.addContact(c2);
        a1.displayContacts();
        a1.updateContact(c3);
        a1.displayContacts();
        a1.deleteContact(c1);
        a1.displayContacts();

    }
}
