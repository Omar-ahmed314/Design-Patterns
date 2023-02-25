package com.designPatterns.BehavioralPatterns.IteratorPattern;

public interface Collection {
    Iterator createIterator();
    void addItem(Object item);
    void removeItem();
}
