package com.yota.task4.definitions;

import java.util.List;

public class SideWalk extends WithItems<Pedestrian> {

    public SideWalk(String name) {
        super(name, false);
    }

    public SideWalk(String name, List<Pedestrian> pedestrians) {
        super(name, false, pedestrians);
    }
}
