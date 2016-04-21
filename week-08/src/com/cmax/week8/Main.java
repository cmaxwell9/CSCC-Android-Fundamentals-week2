package com.cmax.week8;

/**
 * Created by Clint on 3/28/2016.
 */

/**
 * Created by aneuman1 on 3/10/2016.
 */

class Shape {
    public void draw() {
        System.out.println("Drawing a shape.");
    }
}

class Triangle extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a triangle.");
    }
}

class Rectangle extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a rectangle.");
    }
}

class Circle extends Shape {
    private int radius = 10;
    @Override
    public void draw() {
        System.out.println("Drawing a circle.");
    }

    public int getRadius() {
        return radius;
    }
}


public class Main {
    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        Rectangle rectangle = new Rectangle();
        Circle circle1 = new Circle();
        Circle circle2 = new Circle();
        Circle circle3 = new Circle();
        Shape[] shapes = {circle1, circle2, rectangle};

        for (Shape item: shapes) {
            if (!(item instanceof Circle)) {
                continue;
            }

            Circle circleItem = (Circle) item;
            System.out.println(circleItem.getRadius());
        }



    }
}