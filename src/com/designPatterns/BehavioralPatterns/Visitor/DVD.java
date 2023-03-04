package com.designPatterns.BehavioralPatterns.Visitor;

public class DVD extends abstractElement {

    DVD(double price, double weight) {
        super(price, weight);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
