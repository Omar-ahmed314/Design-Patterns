package com.designPatterns.BehavioralPatterns.Observer;

public class Client {
    public static void main(String[] args) {
        // some code will be written here
        // main code

        // create temperature station
        TemperatureStation station = new TemperatureStation();

        // create new subscribers
        Subscriber sub1 = new Subscriber("sub1", station);
        Subscriber sub2 = new Subscriber("sub2", station);
        Subscriber sub3 = new Subscriber("sub3", station);
        Subscriber sub4 = new Subscriber("sub4", station);

        // change the data will notify users
        station.changeData(41);

        // it supposes to give error
        station.notifyObservers();


    }
}
