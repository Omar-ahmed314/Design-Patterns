package com.designPatterns.StructuralPatterns.Decorator;

public interface IShape {
    void draw();
}

class Rectangle implements IShape {

    @Override
    public void draw() {
        System.out.println("Shape: Rectangle");
    }
}

class Circle implements IShape {

    @Override
    public void draw() {
        System.out.println("Shape: Circle");
    }
}