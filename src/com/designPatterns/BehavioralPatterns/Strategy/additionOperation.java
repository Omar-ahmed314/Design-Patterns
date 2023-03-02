package com.designPatterns.BehavioralPatterns.Strategy;

public class additionOperation implements Strategy {

    @Override
    public void doOperation(double num1, double num2) {
        System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
    }
}