package com.designPatterns.BehavioralPatterns.Mediator;

public interface Mediator {
    void notify(Message m, String receiver);
}
