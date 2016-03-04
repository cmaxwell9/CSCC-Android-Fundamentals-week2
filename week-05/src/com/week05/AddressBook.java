package com.week05;

/**
 * Created by Clint on 3/3/2016.
 */

import java.util.ArrayList;

/**
 * Created by MM12222 on 3/3/2016.
 */
public class AddressBook {
    static ArrayList<Contacts> AB = new ArrayList<Contacts>();
    static String add(){
        System.out.println("Enter the name of the contact.");
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        Contacts contact1 = new Contacts();
        String userInput;
        userInput = scanner.nextLine();
        contact1.Name = userInput;
        System.out.println("Enter contacts Email address.");
        userInput = scanner.nextLine();
        contact1.Email = userInput;
        AB.add(contact1);
        System.out.println("****** added ******");
        return "add";
    }
    static String remove(){
        System.out.println("Enter the index of the contact to remove.");
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        String userInput;
        userInput = scanner.nextLine();

        try { int x = ((int) Double.parseDouble(userInput));}
        catch(NumberFormatException nfe){
            System.out.println(" invalid index ");
            return "remove";}
        try {  AB.remove((int) Double.parseDouble(userInput)-1);}
        catch(IndexOutOfBoundsException IOOBE){
            System.out.println(" invalid index / out of bounds");
            return "remove";}


        System.out.println("****** removed ******");
        return "remove";
    }
    /*
    static String update(ArrayList<Contacts> AB){
        System.out.println("Enter the index of the task to update.");
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        String userInput;
        userInput = scanner.nextLine();
        try { int x = ((int) Double.parseDouble(userInput)-1);}
        catch(NumberFormatException nfe){
            System.out.println(" invalid index ");
            return "update";}
        int x = ((int) Double.parseDouble(userInput)-1);
        System.out.println("Enter the new description of the task.");
        java.util.Scanner scanner2 = new java.util.Scanner(System.in);
        userInput = scanner.nextLine();

        try {AB.set(x,userInput);}
        catch(IndexOutOfBoundsException IOOBE){
            System.out.println(" invalid index / out of bounds");
            return "update";}
        System.out.println("****** updated ******");
        return "update";
    }
   */
    static String list(){
        for (int x = 0; x< 100; x++) {

            if (x < AB.size()) {
                Contacts contact1 = AB.get(x);
                System.out.println((x+1) +". " + contact1.Name + " " + contact1.Email);}
            else
            {break;
            }
        }
        System.out.println("****** listed ******");
        return "list";
    }



}

