package com.designPatterns.FactoryPattern;

abstract class Shape {
    public abstract void draw();
}

class Rectangle extends Shape {
    public void draw() {
        System.out.println("psst psst, I'm Rectangle");
    }
}

class Circle extends Shape {
    public void draw() {
        System.out.println("psst psst, I'm Circle");
    }
}

class Triangle extends Shape {
    public void draw() {
        System.out.println("psst psst, I'm Triangle");
    }
}

interface FactoryMethod {
    Shape getInstance(String shapeType);
}

class shapeFactory implements FactoryMethod {
    @Override
    public Shape getInstance(String shapeType) {
        return switch (shapeType) {
            case "Rectangle" -> new Rectangle();
            case "Circle" -> new Circle();
            case "Triangle" -> new Triangle();
            default -> null;
        };
    }
}
public class FactoryPattern {
    public static void main(String[] args) {
        // Create the shape factory
        FactoryMethod shapeFactory = new shapeFactory();

        // creating the shapes
        Shape shape1 = shapeFactory.getInstance("Triangle");
        Shape shape2 = shapeFactory.getInstance("Rectangle");
        Shape shape3 = shapeFactory.getInstance("Circle");

        // printing those shapes
        shape1.draw();
        shape2.draw();
        shape3.draw();



    }
}
