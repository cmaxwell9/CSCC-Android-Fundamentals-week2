package com.week06;
import java.util.*;
/**
 * Created by Clint on 2/20/2016.
 *
 * Write a class that can be used to collect user input and has three methods:
 *  •public String promptString(String message)
 *  •public int promptInt(String message)
 *  •public double promptDouble(String message)
 *
 * Each of these methods should prompt the user for input using the specified
 * message and return the a String, int, or double, depending on the method.
 * The methods should catch any exceptions due to bad input and continue to
 * prompt the user for input until valid input is supplied.

 */
public class Main {
    public static void main(String[] args) {
        System.out.println("The value can be a String, a integer, or a double");
        System.out.println("Once you are done ... enter characters 'END' ");
            java.util.Scanner scanner = new java.util.Scanner(System.in);
            UserInput input = new UserInput();
            int aNumber = input.promptInt("Enter an integer.");
            System.out.println("Twice your number is " + aNumber * 2);
            double dNumber = input.promptDouble("Enter an double.");
            System.out.println("Twice your number is " + dNumber * 2);
            int sNumber = input.promptString("Enter an String.");
            System.out.println("Twice your number is " );
            System.out.println("Cant do multiplcation on a string" );
        }
    }

