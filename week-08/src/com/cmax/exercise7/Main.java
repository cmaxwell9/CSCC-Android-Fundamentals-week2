package com.cmax.exercise7;

/**
 * Created by Clint on 4/19/2016.
 *
 * Write a program that includes a class representing contact information
 * for a person including their name and email address. This class should
 * include a method for displaying the contact's name and email address. The
 * program should also include a class for business contacts that extends the
 * contact class and stores the contact's phone number. The business contact
 * class should override the base class's method that displays the name and
 * email address so that it displays the phone number in addition to the name
 * and email address. Create instances of both classes to demonstrate functionality.
 *
 */

public class Main {
    public static void main(String[] args) {
        Contact clint = new Contact("Clint", "cmax0460@yahoo.com");
        BusinessContact bob = new BusinessContact("bob", "bob@bob.com", "123-456-7890");


        clint.display();
        bob.display();

    }
}


