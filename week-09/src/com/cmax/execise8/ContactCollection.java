package com.cmax.execise8;

/**
 * Created by Clint on 4/20/2016.
*/
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Spliterator;
import java.util.function.Consumer;


public class ContactCollection implements Iterable<Contact> {
    List<Contact> contacts = new ArrayList<>();

    public void addContact(Contact newContact) {
        contacts.add(newContact);
    }

    public List<Contact> getContacts () {
        return contacts;
    }

    @Override
    public Iterator<Contact> iterator() {
        return contacts.iterator();
    }

    @Override
    public void forEach(Consumer<? super Contact> action) {

    }

    @Override
    public Spliterator<Contact> spliterator() {
        return null;
    }
/*
    public void addContact(Contact arthur) {
    }
    */
}

