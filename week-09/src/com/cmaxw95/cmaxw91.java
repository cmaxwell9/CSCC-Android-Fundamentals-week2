package com.cmaxw95;

/**
 * Created by Clint on 3/31/2016.
 */
interface Flier {
    void takeoff();
    void fly();
    void land();
}

class Airplane implements Flier{
    int speed;
    String registration;

    Airplane(int speed, String registration) {
        this.speed = speed;
        this.registration = registration;
    }

    // a method unique to Airplane
    public void loadCargo() {
        // some code related to loading cargo
    }

    @Override
    public void takeoff() {
        System.out.println("Airplane taking off!");
        // code related to take off
    }

    @Override
    public void fly() {
        System.out.println("Airplane flying!");
        // code related to maintaining flight
    }

    @Override
    public void land() {
        System.out.println("Airplane landing!");
        // code related to landing
    }

}

class Bee implements Flier{
    int age;

    Bee(int age ){
        this.age = age;
    }

    // a method unique to Bee
    public void sting() {
        // some code related to stinging
    }

    @Override
    public void takeoff() {
        System.out.println("Bee starting to fly!");
        // code related to starting flight
    }

    @Override
    public void fly() {
        System.out.println("Bee flying!");
        // code related to maintaining flight
    }

    @Override
    public void land() {
        System.out.println("Bee landing!");
        // code related to landing
    }
}

public class cmaxw91 {
    public static void main(String[] args) {
        Airplane plane = new Airplane(500, "A3X95");
        Bee bee = new Bee(1);

        plane.takeoff();
        bee.takeoff();
    }
}
