package com.cmaxw103;

/**
 * Created by Clint on 4/7/2016.
 */

import java.util.Random;

interface WeatherReport {
    public void display(double value);
}

class WeatherApp {
    private double temperature;

    public void updateTemperature() {
        temperature = new Random().nextDouble() * 100;
    }

    //anonymous class implementing WeatherReport
    public void displayTemperatureReport() {
        new WeatherReport() {
            @Override
            public void display(double value) {
                System.out.println("The current temperature is " + value + ".");
            }
        }.display(temperature);
    }
}
public class Main {
    public static void main(String[] args) {
        WeatherApp weather = new WeatherApp();
        weather.updateTemperature();
        weather.displayTemperatureReport();
    }
}
