package org.example;

/**
 * @author Daniel Augusto on 01/02/2023
 * @project generics
 **/
public class TeslaModelS extends Car {
    private Long range;

    public TeslaModelS(
            String modelName, int doors, String fuel,
            String color, int year, Long range
    ) {
        super(modelName, doors, fuel, color, year);
        this.range = range;
    }

    @Override
    public String toString() {
        return getModelName() + " { " +
                "doors = " + getDoors() + "," +
                " wheels = " + getWheels() + "," +
                " fuel = " + getFuel() + "," +
                " range = " + range + "," +
                " color = " + getColor() + "," +
                " year = " + getYear() + "," +
                " }";
    }
}