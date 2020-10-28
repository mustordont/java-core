package com.yota.task4.definitions;

import java.util.List;

// no union of types in java so can`t do like: WithItems<StreetLine|SideWalk>
public class Street extends WithItems<StreetLine> {
    private List<SideWalk> sidewalks;

    public Street(String name, List<StreetLine> items) throws Exception {
        super(name, false, items);
    }

    public Street(String name, List<StreetLine> items, List<SideWalk> sideWalks) throws Exception {
        super(name, false, items);
        if (sideWalks.size() > 2) {
            System.out.println("street can't have more than 2 sidewalks");
            throw new Exception("street can't have more than 2 sidewalks");
        }
        this.sidewalks = sideWalks;
    }

    public boolean hasTrafficJam() {
        for (StreetLine line: this.getItems()) {
            if (line.getItems().size() < 2) {
                return false;
            }
        }
        return true;
    }
}
