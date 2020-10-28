package com.yota.task4.definitions;

import java.util.Arrays;
import java.util.List;

public class Car extends WithItems<Pedestrian> {
    public Car(String name, boolean movable) {
        super(name, movable);
    }

    public Car(String name, boolean movable, Pedestrian driver) {
        super(name, movable, Arrays.asList(driver));
    }

    public Car(String name, boolean movable, List<Pedestrian> items) {
        super(name, movable, items);
    }
}
