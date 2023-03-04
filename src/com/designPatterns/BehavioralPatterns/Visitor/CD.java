package com.designPatterns.BehavioralPatterns.Visitor;

public class CD extends abstractElement {

    CD(double price, double weight) {
        super(price, weight);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
