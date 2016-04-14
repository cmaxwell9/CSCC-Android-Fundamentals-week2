package com.cmax.week072;


enum Direction {NORTH, SOUTH, EAST, WEST};

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
        System.out.println("The storm is currently located at ("
                + latitude + ", " + longitude + ") moving "
                + speed + "MPH " + direction + ".");
    }
}

class ThunderStorm extends Storm {
    private int numberOfLightningStrikes;

    public int getNumberOfLightningStrikes() {
        return numberOfLightningStrikes;
    }

    public void setNumberOfLightningStrikes(int numberOfLightningStrikes) {
        this.numberOfLightningStrikes = numberOfLightningStrikes;
    }

    public void displayLightningStrikes() {
        String message;
        if (numberOfLightningStrikes == 1) {
            message = "There has been 1 lightning strike.";
        }
        else {
            message = "There have been " + numberOfLightningStrikes + " lightning strikes.";
        }
        System.out.println(message);
    }
}


public class Main {
    public static void main(String[] args) {
        ThunderStorm thunderStorm = new ThunderStorm();
        thunderStorm.setLatitude(39.970456);
        thunderStorm.setLongitude(-82.988770);
        thunderStorm.setSpeed(5);
        thunderStorm.setDirection(Direction.EAST);
        thunderStorm.setNumberOfLightningStrikes(10);

        thunderStorm.display();
        thunderStorm.displayLightningStrikes();
    }
}
