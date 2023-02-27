package com.designPatterns.BehavioralPatterns.Mediator;

public interface User {
    void send(Message m, String receiver);
    void receive(Message m);
}

