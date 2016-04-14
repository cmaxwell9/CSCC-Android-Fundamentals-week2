package com.cmaxw94;

/**
 * Created by Clint on 3/31/2016.
 */
class Bird extends FlyingAnimal {
    private int wingspan;

    Bird(String name, int age, int wingspan) {
        super(name, age);
        this.wingspan = wingspan;
    }

    @Override
    public void speak() {
        System.out.println("Chirp!");
    }

    @Override
    public void fly() {
        System.out.println("Flying...");
    }
}
