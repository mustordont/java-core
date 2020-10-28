package com.yota.task4.definitions;

import java.util.List;

public interface WithItemsInterface<T> {
    List<T> getItems();
    void setItems(List<T> items);
    void addItem(T item);
}
