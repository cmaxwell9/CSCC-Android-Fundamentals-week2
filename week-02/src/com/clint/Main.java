package com.clint;


public class Main {
public static void main (String[] args)
{

    String[] weekDays = {"SUN", "MON", "Tues", "WED", "THUR", "FRI", "SAT"};
    int[] temps = {45,29,10,22,41,28,33};
    int[] precipitation = {95,60,25,5,0,75,90};

    for (int index = 0; index < weekDays.length; index++){
        if ((temps[index] <= 32) && (precipitation[index] > 50)){
            System.out.println(weekDays[index]);
        }
    }
}
}
