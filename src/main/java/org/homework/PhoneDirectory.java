package org.homework;

import java.util.*;

public class PhoneDirectory {
    private final Map<String, Set<String>> contacts;

    public PhoneDirectory() {
        contacts = new HashMap<>();
    }

    public void add(String surname, String phone) {
        if (!contacts.containsKey(surname)) {
            contacts.put(surname, new TreeSet<>());
        }
        contacts.get(surname).add(phone);
    }

    public Set<String> get(String surname) {
        if (contacts.containsKey(surname)) {
            return contacts.get(surname);
        } else {
            return new TreeSet<>();
        }
    }

    public void printBook() {
        for (String surname : contacts.keySet()) {
            System.out.println("Фамилия: " + surname + ". Телефоны: ----> " + contacts.get(surname));
        }
    }
}
