package com.designPatterns.AbstractFactoryMethod;

public class client {
    public static void main(String[] args) {
        // some code here
        // get the color factory
        ColorFactory cFactory = (ColorFactory) AbstractFactory.getFactory("ColorFactory");
        Red red = (Red) cFactory.getColor("Red");
        red.greet();

        // get the shape factory
        ShapeFactory sFactory = (ShapeFactory) AbstractFactory.getFactory("ShapeFactory");
        Rect rec = (Rect) sFactory.getShape("Rect");
        rec.greet();
    }
}
