package com.cmaxwe126;

/**
 * Created by Clint on 4/21/2016.
 */
import java.util.ArrayList;
import java.util.List;


public class Main {
    public static <T> void copyList(List<T> source, List<T> destination) {
        for (T object: source) {
            destination.add(object);
        }
    }

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("bob");
        names.add("sue");
        List<String> namesCopy = new ArrayList<>();
        copyList(names, namesCopy);
        for (String name: namesCopy) {
            System.out.println(name);
        }

    }

}