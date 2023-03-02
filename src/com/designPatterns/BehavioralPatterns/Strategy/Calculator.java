package com.designPatterns.BehavioralPatterns.Strategy;

public class Calculator {
    private Strategy operation;

    Calculator(Strategy initialOperation) {
        this.operation = initialOperation;
    }

    public void setOperation(Strategy operation) {
        this.operation = operation;
    }

    public void calculate(double num1, double num2) {
        operation.doOperation(num1, num2);
    }
}
