package com.cmaxw94;

/**
 * Created by Clint on 3/31/2016.
 */
abstract class Animal {
    private String name;
    private int age;

    Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    abstract public void speak();
}

