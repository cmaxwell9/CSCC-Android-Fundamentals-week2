package com.cmax.execise8;



/**
 * Created by Clint on 4/19/2016.
 *
 * Add a class to the previous example that represents a collection of
 * contacts, both of the base class and the derived class. The collection
 * class should include a single method to add a contact, regardless of class,
 * to the collection - this demonstrates upcasting. The collection class
 * should also include a method to iterate through the contacts and call
 * their display methods - this demonstrates late binding.

 *
 *
 */

public class Main {
    public static void main(String[] args) {
        Contact arthur = new Contact("arthur", "arthur@arthur.com");
        BusinessContact bob = new BusinessContact("bob", "bob@bob.com", "123-456-7890");

        ContactCollection collection = new ContactCollection();
        collection.addContact(arthur);
        collection.addContact(bob);
        for (Contact contact: collection) {
            contact.display();
            };

}
}
