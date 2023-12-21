package com.addressbook;

import java.util.*;

public class AddressBookMain {
    private static Map<String,AddressBook> addressBooks = new HashMap<>();
    public static void main(String[] args) {
        AddressBook a1 = new AddressBook();
        AddressBook a2 = new AddressBook();
        Contact c1 = new Contact("Lokeshwar", "PG", "Anna Nagar", "Chennai", "TamilNadu", 601202, "9677595842", "pglokeshwarmca@gmail.com");
        Contact c2 = new Contact("Rajesh", "Pinjala", "Jubilee Hills", "Hyderabad", "Telangana", 501202, "9677595842", "pglokeshwarmca@gmail.com");
        Contact c3 = new Contact("Rajesh", "Kumar", "Banashankari", "Banglore", "Karnataka", 571202, "9677595842", "pglokeshwarmca@gmail.com");
        Contact c4 = new Contact("Madhesh", "Kumar", "Banashankari", "Banglore", "Karnataka", 571202, "9677595842", "pglokeshwarmca@gmail.com");
        a1.addContact(c1);
        a1.addContact(c2);
        a1.addContact(c4);
        a1.updateContact(c3);
        a1.deleteContact(c1);
        a2.addContact(c1);
        a2.addContact(c2);
        addressBooks.put("book1",a1);
        addressBooks.put("book2",a2);
        AddressBook book2 = addressBooks.get("book2");
        Contact contact2 = book2.getContact(1);
        String book2Contact2SecondName = contact2.getLastName();
        System.out.println("Second Name of Second Contact From Second Book: "+book2Contact2SecondName);
        System.out.println("\n All Address books details");
        System.out.println("---------------------------");
        displayAddressBooks();
    }
    public static void displayAddressBooks() {
        Set<Map.Entry<String, AddressBook>> booksPair =addressBooks.entrySet();
        for (Map.Entry<String, AddressBook> bookPair : booksPair) {
            System.out.println(bookPair.getKey()+" : ");
            AddressBook book = bookPair.getValue();
            book.displayContacts();
        }



    }
}
