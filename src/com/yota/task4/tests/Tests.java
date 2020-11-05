package com.yota.task4.tests;

import com.yota.task4.definitions.*;

import java.util.ArrayList;
import java.util.List;

public class Tests {
    public static void main(String[] args) throws Exception {
        Car car1 = new Car("car1", true, new Pedestrian("Petya"));

        Car car2 = new Car("car1", true, new ArrayList<>(List.of(
                new Pedestrian("Vasya", false),
                new Pedestrian("Nastya")))
        );

        car2.addItem(new Pedestrian("test"));

        Street street = new Street(
                "Savushkina street",
                List.of(
                        new StreetLine("Line 1", new ArrayList<>(List.of(car1))),
                        new StreetLine("Line 2"),
                        new StreetLine("Line 3", new ArrayList<>(List.of(car2)))
                ),
                List.of(
                        new SideWalk("Sidewalk 1"),
                        new SideWalk(
                                "Sidewalk 2",
                                new ArrayList<>(List.of(
                                        new Pedestrian("Roma"),
                                        new Pedestrian("Baba Galya", false)
                                ))
                        )
                )
        );

        System.out.println("traffic jam: " + street.hasTrafficJam()); // false

        street.getItems().get(0).addItem(new Car("car3", true, new Pedestrian("Max")));
        street.getItems().get(1).addItem(new Car("car4", true, new Pedestrian("Mad Max")));
        street.getItems().get(1).addItem(new Car("car5", true, new Pedestrian("Alien")));
        street.getItems().get(2).addItem(new Car("car6", true, new Pedestrian("Bart")));

        System.out.println("traffic jam at rush hour: " + street.hasTrafficJam()); // true

        try {
            Street street2 = new Street(
                    "street with 3 sidewalks",
                    List.of(),
                    List.of(
                            new SideWalk("Sidewalk 1"),
                            new SideWalk("Sidewalk 2"),
                            new SideWalk("Sidewalk 3")
                    )
            );
            System.out.println("Street2 with 3 sidewalks " + street2);
        }
        catch (Exception e) {
            System.out.println("Caught: " + e.getMessage());
        }
    }
}
