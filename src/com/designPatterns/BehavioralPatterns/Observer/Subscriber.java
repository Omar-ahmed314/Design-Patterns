package com.designPatterns.BehavioralPatterns.Observer;

public class Subscriber implements Observer{
    private String name;
    private Subject station;

    public Subscriber(String name, Subject station) {
        this.name = name;
        this.station = station;
        subscribe();
    }

    @Override
    public void update() {
        double data = (double) this.station.getData();
        System.out.println("I'm device: " + name + " has been notified with temperature change " + data);
    }

    @Override
    public void subscribe() {
        this.station.attach(this);
    }

    @Override
    public void unsubscribe() {
        this.station.detach(this);
    }
}
