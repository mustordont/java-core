package com.yota.task4.definitions;

import java.util.List;

public class StreetLine extends WithItems<Car> {

    public StreetLine(String name) {
        super(name, false);
    }

    public StreetLine(String name, List<Car> cars) {
        super(name, false, cars);
    }
}
