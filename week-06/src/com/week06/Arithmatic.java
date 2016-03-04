package com.week06;

/**
 * Created by Clint on 3/3/2016.
 */

class Arithmetic {
    public static double average(double values []) {
        double average = 0;
        for (double value: values) {
            average += value;
        }
        return average / values.length;
    }
}

