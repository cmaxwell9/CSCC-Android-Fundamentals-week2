package com.cmaxw94;

public class Main {
    public static void main(String[] args) {
        Dog odie = new Dog("Odie", 5, "beagle");
        Cat garfield = new Cat("Garfield", 6, "orange");
        Bird tweety = new Bird("Tweety", 2, 4);
        Bat batty = new Bat("Batty", 2, 1);

        odie.speak();
        garfield.speak();
        tweety.speak();

        batty.fly();
    }
}
