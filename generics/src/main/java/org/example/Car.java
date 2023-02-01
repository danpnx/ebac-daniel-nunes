package org.example;

/**
 * @author Daniel Augusto on 01/02/2023
 * @project generics
 **/
public class Car {
    private String modelName;
    private final int wheels = 4;
    private int doors;
    private String fuel;
    private String color;
    private int year;

    public Car(String modelName, int doors, String fuel, String color, int year) {
        this.modelName = modelName;
        this.doors = doors;
        this.fuel = fuel;
        this.color = color;
        this.year = year;
    }

    public String getModelName() {
        return modelName;
    }

    public int getWheels() {
        return wheels;
    }

    public int getDoors() {
        return doors;
    }

    public String getFuel() {
        return fuel;
    }

    public String getColor() {
        return color;
    }

    public int getYear() {
        return year;
    }
}
