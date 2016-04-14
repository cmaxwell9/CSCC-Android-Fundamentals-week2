package com.cmaxw121;

/**
 * Created by Clint on 4/14/2016.
 */
import java.util.ArrayList;
import java.util.List;

class Contact {
    private String name;
    private String email;

    Contact(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public void displayInfo() {
        System.out.println("Name: " + name + ", Email: " + email);
    }
}


public class Main {
    public static void main(String[] agrs) {
        List contacts = new ArrayList();
        contacts.add(new Contact("bob", "bob@bob.com"));
        contacts.add("sue");

        for (Object o: contacts) {
            Contact c = (Contact) o;
            c.displayInfo();
        }

    }
}