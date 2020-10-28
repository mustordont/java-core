package com.yota.task4.definitions;

public abstract class GeneralItem implements GeneralItemInterface {
    private String name;
    private final boolean movable;

    public GeneralItem(String name, boolean movable) {
        this.name = name;
        this.movable = movable;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getMovable() {
        return this.movable;
    }
}


