package com.designPatterns.BehavioralPatterns.Visitor;

public abstract class abstractElement implements Element{
    private double price;
    private double weight;

    abstractElement(double price, double weight) {
        this.price = price;
        this.weight = weight;
    }

    public double getPrice() {return this.price;}

    public double getWeight() { return this.weight;}
}

