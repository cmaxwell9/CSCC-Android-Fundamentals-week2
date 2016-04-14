package com.cmaxw94;

/**
 * Created by Clint on 3/31/2016.
 */
class Bat extends FlyingAnimal {
    private int weight;
    Bat(String name, int age, int weight) {
        super(name, age);
        this.weight = weight;
    }

    @Override
    public void fly() {
        System.out.println("Flying...");
    }

    @Override
    public void speak() {
        System.out.println("Bat sounds!");
    }
}
