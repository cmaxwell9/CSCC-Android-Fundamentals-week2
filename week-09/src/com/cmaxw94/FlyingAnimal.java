package com.cmaxw94;

/**
 * Created by Clint on 3/31/2016.
 */
abstract class FlyingAnimal extends Animal {
    FlyingAnimal(String name, int age) {
        super(name, age);
    }

    abstract public void fly();
}
