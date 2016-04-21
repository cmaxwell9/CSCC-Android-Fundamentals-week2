package com.cmax.exercise9;

/**
 * Created by Clint on 4/19/2016.
 *
 * Create an abstract class for contacts that stores a contact's name
 * and defines an abstract method contact(). Create one class that makes
 * use of the abstract contact class that stores and email address and
 * implements the contact() method using the email address and another
 * class that stores a phone number and implements the contact() method
 * using the phone number. The implementation of the contact() method
 * should simply print a string with the appropriate information
 * like "Emailing aneuman1@cscc.edu" or "Calling 123-456-7890".
 *
 */



         abstract class Contact {
         private String name;


         Contact(String name) {
                 this.name = name;
             }


                 abstract public void contact();
     }


         class PhoneContact extends Contact {
         String phoneNumber;


                 PhoneContact(String name, String phoneNumber) {
                 super(name);
                     this.phoneNumber = phoneNumber;
             }


                 @Override
         public void contact() {
                 System.out.println("Dialing " + phoneNumber + ".");
             }
     }


         class EmailContact extends Contact {
         String emailAddress;


                 EmailContact(String name, String emailAddress) {
                 super(name);
                 this.emailAddress = emailAddress;
             }


                 @Override
         public void contact() {
                 System.out.println("Emailing " + emailAddress + ".");
             }
     }


         public class Main {
         public static void main(String[] args){
                 PhoneContact phone = new PhoneContact("Bob", "123-456-7890");
                 EmailContact email = new EmailContact("Sue", "sue@sue.com");


                phone.contact();
             email.contact();
             }
     }


