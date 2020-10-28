package com.yota.task4.definitions;

public class Pedestrian extends GeneralItem {
    public Pedestrian(String name) {
        super(name, true);
    }

    public Pedestrian(String name, boolean movable) {
        super(name, movable);
    }
}
