package org.example;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Daniel Augusto on 01/02/2023
 * @project generics
 **/
public class Demo {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        Car modelS = new TeslaModelS(
                "Tesla Model S Plaid", 4, "Energy",
                "Red", 2021, 300L
        );
        cars.add(modelS);

        Car evoque = new RangeRoverEvoque(
                "Range Rover Evoque", 4, "Fuel",
                "Silver", 2019, 65L
        );
        cars.add(evoque);

        displayList(cars);
    }

    public static <T> void displayList(List<T> list) {
        for(T item: list) {
            System.out.println();
            System.out.println(item);
        }
    }
}
