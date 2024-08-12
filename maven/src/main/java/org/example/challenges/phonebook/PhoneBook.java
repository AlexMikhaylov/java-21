package org.example.challenges.phonebook;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * The class stores and manages contacts. Each contact should have a name and a phone number.
 */
public class PhoneBook {

    private HashMap<String, String> contacts = new HashMap<>();

    public PhoneBook(HashMap<String, String> contacts) {
        this.contacts = contacts;
    }

    public PhoneBook() {
    }

    public void addContact(String name, String phoneNumber) {
        contacts.put(name, phoneNumber);
    }

    public String searchContact(String name) {
        return contacts.get(name);
    }

    // listing contacts in alphabetical order
    public Map<String, String> listAllContacts() {
        return new TreeMap<>(contacts);
    }

    // list all contacts that start with a given letter.
    public Map<String, String> listContactsStartingWith(String letter) {
        Map<String, String> result = new TreeMap<>();
        for (String key : contacts.keySet()) {
            if (key.toLowerCase().startsWith(letter.toLowerCase())) {
                result.put(key, contacts.get(key));
            }
        }
        return result;
    }

    public void removeContact(String name) {
        contacts.remove(name);
    }
}
