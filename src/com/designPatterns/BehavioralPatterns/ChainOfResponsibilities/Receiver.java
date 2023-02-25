package com.designPatterns.BehavioralPatterns.ChainOfResponsibilities;

public abstract class Receiver {
    protected Receiver nextHandler;

    public void setNextHandler(Receiver handler) {
        this.nextHandler = handler;
    }

    public abstract void processMessage(Message message);
}