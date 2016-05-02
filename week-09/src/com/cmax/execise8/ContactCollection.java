package com.cmax.execise8;

/**
 * Created by Clint on 4/20/2016.
*/
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Spliterator;
import java.util.function.Consumer;


public class ContactCollection implements Iterable<ExerciseContact> {
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

    public void addContact(Contact arthur) {
    }
}
*/
