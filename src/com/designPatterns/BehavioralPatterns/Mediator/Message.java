package com.designPatterns.BehavioralPatterns.Mediator;

public class Message {
    private String text;

    public Message(String text) {
        this.text = text;
    }

    public Message() {}

    public void setText(String text) {
        this.text = text;
    }

    public String getText() {
        return this.text;
    }
}
