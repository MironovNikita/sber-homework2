package org.homework.exception;

public class ContactNotFoundException extends RuntimeException {
    public ContactNotFoundException(String surname) {
        super(String.format("Телефонные номера по фамилии %s отсутствуют в телефонном справочнике", surname));
    }
}
