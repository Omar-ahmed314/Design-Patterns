package com.designPatterns.BehavioralPatterns.State;

public class Client {
    public static void main(String[] args) {
        // main code

        // create the mobile phone object
        Phone phone = new Phone(new silentState());

        // create states
        silentState silent = new silentState();
        vibrationState vibration = new vibrationState();

        // test the phone
        phone.alert();

        // change the state
        phone.setState(vibration);
        phone.alert();

    }
}
