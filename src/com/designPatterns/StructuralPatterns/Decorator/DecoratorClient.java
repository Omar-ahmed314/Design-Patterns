package com.designPatterns.StructuralPatterns.Decorator;

public class DecoratorClient {
    public static void main(String[] args) {
        // the main code will be written here

        // create new shape
        Rectangle rect = new Rectangle();
        Circle circle = new Circle();

        // create the decorators
        RedShape redShape = new RedShape(rect);
        GreenShape greenShape = new GreenShape(circle);

        // printing before the decorator
        System.out.println("Printing the original shapes");
        rect.draw();
        circle.draw();
        System.out.println("");

        // printing after the decorator
        System.out.println("Printing the Decorated shapes");
        redShape.draw();
        greenShape.draw();
        System.out.println("");


    }
}
