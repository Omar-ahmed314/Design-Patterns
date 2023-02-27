package com.designPatterns.BehavioralPatterns.Iterator;

public interface Collection {
    Iterator createIterator();
    void addItem(Object item);
    void removeItem();
}
