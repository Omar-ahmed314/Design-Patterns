package com.designPatterns.BehavioralPatterns.Iterator;

public class Notification {
    private String text;

    public Notification(String text) {
        this.text = text;
    }

    public String getText() {
        return this.text;
    }
}
