package com.designPatterns.BehavioralPatterns.Strategy;

public class Client {
    public static void main(String[] args) {
        // main code

        // create the calculator
        Calculator calculator = new Calculator(new additionOperation());

        // create some operation
        subtractionOperation sub = new subtractionOperation();
        multiplicationOperation mul = new multiplicationOperation();

        // calculate
        calculator.calculate(1, 2);
        calculator.setOperation(sub);
        calculator.calculate(5, 4);
        calculator.setOperation(mul);
        calculator.calculate(5, 4);

    }
}
