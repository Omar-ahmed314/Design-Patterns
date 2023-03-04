package com.designPatterns.BehavioralPatterns.Visitor;

public class Book extends abstractElement {

    Book(double price, double weight) {
        super(price, weight);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
