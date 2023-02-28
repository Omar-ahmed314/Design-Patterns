package com.designPatterns.BehavioralPatterns.Observer;

public interface Subject {
    void attach(Observer observer);
    void detach(Observer observer);
    void notifyObservers();
    Object getData();
}
