package org.example.challenges.phonebook;

public class PhoneBookApp {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();

        phoneBook.addContact("John Doe", "123-456-7890");
        phoneBook.addContact("Jane Smith", "987-654-3210");
        phoneBook.addContact("Alex Mi", "123-456-3210");

        System.out.println(phoneBook.searchContact("John Doe"));
        System.out.println(phoneBook.searchContact("Jane Smith"));

        phoneBook.removeContact("Jane Smith");

        System.out.println(phoneBook.listAllContacts());
        System.out.println(phoneBook.listContactsStartingWith("A"));
    }
}
