package com.cmax.week071;

/**
 * Created by Clint on 3/3/2016.
 */

enum Direction {North, South, East, West};



class Storm {
    private double latitude;

    private double longitude;
    private double speed;
    private Direction direction;

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public Direction getDirection() {
        return direction;
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }

    public void display() {
        System.out.println("the storm is located at (" + latitude + " " + longitude + " is moving "
                + speed + "MPH" + direction + " .");
    }
}
class ThunderStorm extends Storm {





}


public class Main {
    public static void main(String[] args) {
        ThunderStorm thunderStorm = new ThunderStorm();
        thunderStorm.setLatitude(39.970456);
        thunderStorm.setLongitude(-82.988770);
        thunderStorm.setSpeed(5);
        thunderStorm.setDirection(Direction.East);

        thunderStorm.display();

    }
}
