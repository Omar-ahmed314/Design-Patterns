package com.designPatterns.BehavioralPatterns.State;

public class Phone {
    private State phoneState;

    Phone(State initialState) {
        this.phoneState = initialState;
    }

    public void setState(State state) {
        this.phoneState = state;
    }

    public void alert() {
        phoneState.alert();
    }
}
