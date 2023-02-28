package com.designPatterns.BehavioralPatterns.Observer;

import java.util.ArrayList;
import java.util.List;

public class TemperatureStation implements Subject{
    private List<Observer> observerList;
    private double temperature;
    private boolean isChanged;

    public TemperatureStation() {
        observerList = new ArrayList<>();
        temperature = 25.0;
        isChanged = false;
    }
    @Override
    public void attach(Observer observer) {
        if(!observerList.contains(observer)){
            this.observerList.add(observer);
            System.out.println("New subscriber added");
        } else {
            System.out.println("The observer already exist!");
        }
    }

    @Override
    public void detach(Observer observer) {
        this.observerList.remove(observer);
    }

    @Override
    public void notifyObservers() {
        if(isChanged){
            isChanged = false;
            for (Observer user : observerList) {
                user.update();
            }
        } else {
            System.out.println("Data hasn't changed yet");
        }
    }

    public void changeData(double newTemperature) {
        isChanged = true;
        temperature = newTemperature;
        notifyObservers();
    }

    @Override
    public Object getData() {
        return this.temperature;
    }
}
