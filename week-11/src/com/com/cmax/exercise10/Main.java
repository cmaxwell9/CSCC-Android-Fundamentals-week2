package com.com.cmax.exercise10;

/**
 * Created by Clint on 4/19/2016.
 *
 *
 * Create a class to store contact information consisting
 * of a name and email address. Additionally, create a
 * class to store a collection of contacts that implements
 * the Iterable interface so that a for-each loop can be
 * used with the the collection class. Demonstrate this
 * functionality with a for-each loop in the Main.main()
 * method that displays contact information.

 */
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Spliterator;
import java.util.function.Consumer;

/**
 * Created by aneuman1 on 4/7/2016.
 */

class ExerciseContact{
    String name;
    String email;

    ExerciseContact(String name, String email) {
        this.name = name;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Email: " + email;
    }
}

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


public class Main {
    public static void main(String[] args) {
        ExerciseContact clint = new ExerciseContact("Clint", "Cmax0460@yahoo.com");
        ExerciseContact Clint2 = new ExerciseContact("Clint", "cmaxwel@columbus.rr.com");
        ExerciseContact Mark = new ExerciseContact("Mark", "Drifty@yahoo.com");

        ContactCollection contacts = new ContactCollection();
        contacts.addContact(clint);
        contacts.addContact(Clint2);
        contacts.addContact(Mark);

        for(ExerciseContact contact: contacts) {
            System.out.println(contact);
        }
    }
}

