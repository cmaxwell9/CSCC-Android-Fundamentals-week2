package com.week06;

/**
 * Created by Clint on 2/20/2016.
 */
public class Main {
    public static void main(String[] args) {
        double[] someValues = {1, 2, 3};

        try {
            double averageValue = Arithmetic.average(someValues);
            System.out.println(averageValue);
        }
        catch (Exception e){
            System.out.println("An Exceiption occured");
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

    }
}
