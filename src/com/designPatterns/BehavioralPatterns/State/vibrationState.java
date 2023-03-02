package com.designPatterns.BehavioralPatterns.State;

public class vibrationState implements State{
    @Override
    public void alert() {
        System.out.println("Vibration");
    }
}
