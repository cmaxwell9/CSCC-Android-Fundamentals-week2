package com.week06;

/**
 * Created by Clint on 2/20/2016.
 */
public class Main {
    public static void main(String[] args) {
        UserInput input = new UserInput();
        int aNumber = input.promptInt("Enter an integer.");
        System.out.println("Twice your number is " + aNumber * 2);
    }
}
