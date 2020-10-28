package com.yota.task4.definitions;

import java.util.ArrayList;
import java.util.List;

public abstract class WithItems<T> extends GeneralItem implements WithItemsInterface<T> {

    private List<T> items = new ArrayList<T>();

    public WithItems(String name, boolean movable) {
        super(name, movable);
    }

    public WithItems(String name, boolean movable, List<T> items) {
        super(name, movable);
        this.items = items;
    }

    @Override
    public List<T> getItems() {
        return this.items;
    }

    @Override
    public void setItems(List<T> items) {
        this.items = items;
    }

    @Override
    public void addItem(T item) {
        this.items.add(item);
    }
}
