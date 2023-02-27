package com.designPatterns.BehavioralPatterns.Mediator;

public class Chatter implements User {
    private String name;
    private Mediator chatMediator;

    public Chatter(String name, Mediator mediator) {
        this.name = name;
        this.chatMediator = mediator;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public void send(Message m, String receiver) {
        chatMediator.notify(m, receiver);
    }

    @Override
    public void receive(Message m) {
        System.out.println("\nI'm, " + name + " received a message: ");
        System.out.println(m.getText());
    }
}