package com.week05;

/**
 * Created by Clint on 3/3/2016.
 */


        /**
         * Created by MM12222 on 3/3/2016.
         Create a class that represents contact information for a person. The
         class should store the person's name and their email address.

         Create a second class that represents an address book (a collection of
         contact information for many people) that includes methods for adding
         new contact information and for searching the existing collection for
         a contacts email address when the name is specified.

         The program should create instances of the classes and demonstrate
         the functionality.

         */
        import java.util.ArrayList;

public class Exercise5 {

    public static void main(String[] args) {
        ArrayList<Contacts> AB = new ArrayList<Contacts>();
        String userInput;
        userInput = "6";
        while (((int) Double.parseDouble(userInput)) != 0) {
            System.out.println("Please choose an option:");
            System.out.println("(1) Add a contact.");
            System.out.println("(2) Remove a contact.");
            System.out.println("(3) Update a contact.");
            System.out.println("(4) List contacts.");
            System.out.println("(0) Exit.");
            java.util.Scanner scanner = new java.util.Scanner(System.in);
            userInput = scanner.nextLine();

            try { int x = ((int) Double.parseDouble(userInput));}
            catch(NumberFormatException nfe){userInput = "6";};

            switch ((int) Double.parseDouble(userInput)) {
                case 1:
                    AddressBook.add();
                    break;
                case 2:
                    AddressBook.remove();
                    break;
/*
                case 3:
                    AddressBook.update(AB);
                    break;
*/
                  case 4:
                    AddressBook.list();
                    break;

                case 0:
                    break;
                default:
                    System.out.println("Invalid Entry, Please try again...");
                    break;
            }
        }
    }
}
