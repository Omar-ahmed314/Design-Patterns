package com.designPatterns.BehavioralPatterns.State;

public class silentState implements State{
    @Override
    public void alert() {
        System.out.println("Silent");
    }
}
