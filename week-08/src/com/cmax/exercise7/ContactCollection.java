package com.cmax.exercise7;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Spliterator;
import java.util.function.Consumer;

/**
 * Created by Clint on 4/20/2016.
 */
class ContactCollection implements Iterable<ExerciseContact> {
    List<ExerciseContact> contacts = new ArrayList<>();

    public void addContact(ExerciseContact newContact) {
        contacts.add(newContact);
    }

    public List<ExerciseContact> getContacts () {
        return contacts;
    }

    @Override
    public Iterator<ExerciseContact> iterator() {
        return contacts.iterator();
    }

    @Override
    public void forEach(Consumer<? super ExerciseContact> action) {

    }

    @Override
    public Spliterator<ExerciseContact> spliterator() {
        return null;
    }
}

