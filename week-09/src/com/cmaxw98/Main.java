package com.cmaxw98;

/**
 * Created by Clint on 4/7/2016.
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Contact implements Comparable<Contact> {
    String name;
    String email;

    Contact(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public void display() {
        System.out.println("Name: " + name + ", Email:" + email);
    }

    @Override
    public int compareTo(Contact o) {
        if (!name.equals(o.name)) {
            return name.compareTo(o.name);
        }
        else {
            return email.compareTo(o.email);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Contact bob = new Contact("Bob", "bob@bob.com");
        Contact arthur = new Contact("Arthur", "aneuman1@cscc.edu");

        List<Contact> contacts = new ArrayList<>();
        contacts.add(bob);
        contacts.add(arthur);

        Collections.sort(contacts);

        for(Contact contact: contacts) {
            contact.display();
        }
    }
}