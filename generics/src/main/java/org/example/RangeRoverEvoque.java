package org.example;

/**
 * @author Daniel Augusto on 01/02/2023
 * @project generics
 **/
public class RangeRoverEvoque extends Car {
    private final Long fuelCapacity;

    public RangeRoverEvoque(
            String modelName, int doors, String fuel,
            String color, int year, Long fuelCapacity
    ) {
        super(modelName, doors, fuel, color, year);
        this.fuelCapacity = fuelCapacity;
    }

    @Override
    public String toString() {
        return getModelName() + " { " +
                "doors = " + getDoors() + "," +
                " wheels = " + getWheels() + "," +
                " fuel = " + getFuel() + "," +
                " fuel capacity = " + fuelCapacity + "," +
                " color = " + getColor() + "," +
                " year = " + getYear() + "," +
                " }";
    }
}
