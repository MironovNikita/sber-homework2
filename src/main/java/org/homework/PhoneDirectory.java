package org.homework;

import org.homework.exception.ContactNotFoundException;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneDirectory {
    private final Map<String, List<String>> contacts;

    public PhoneDirectory() {
        contacts = new HashMap<>();
    }

    public void add(String surname, String phone) {
        if (contacts.containsKey(surname)) {
            List<String> phoneNumbers = contacts.get(surname);
            phoneNumbers.add(phone);
        } else {
            List<String> phoneNumbers = new ArrayList<>();
            phoneNumbers.add(phone);
            contacts.put(surname, phoneNumbers);
        }
    }

    public List<String> get(String surname) {
        if (contacts.containsKey(surname)) {
            return contacts.get(surname);
        } else {
            throw new ContactNotFoundException(surname);
        }
    }
}
