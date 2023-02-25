package com.designPatterns.BehavioralPatterns.Command;

public class Stock {
    private String name;
    private double quantity;

    Stock(String name, double quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    public void buy() {
        System.out.printf("Stock: %s, with Quantity: %.1f bought\n", name, quantity);
    }

    public void sell() {
        System.out.printf("Stock: %s, with Quantity: %.1f Sold\n", name, quantity);
    }
}
