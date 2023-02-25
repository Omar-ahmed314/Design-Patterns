package com.designPatterns.BehavioralPatterns.ChainOfResponsibilities;


public class Message {
    private String text;
    private MessagePriority mPriority;

    enum MessagePriority {
        NORMAL,
        HIGH
    }

    public Message(String text, MessagePriority priority) {
        this.text = text;
        this.mPriority = priority;
    }

    public String getText() {
        return this.text;
    }

    public MessagePriority getPriority() {
        return this.mPriority;
    }
}
