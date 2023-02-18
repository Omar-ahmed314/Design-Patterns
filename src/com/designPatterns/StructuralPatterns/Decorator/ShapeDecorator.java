package com.designPatterns.StructuralPatterns.Decorator;

public abstract class ShapeDecorator implements IShape{
    protected IShape shape;

    public ShapeDecorator(IShape shape) {
        this.shape = shape;
    }
}

class RedShape extends ShapeDecorator {

    public RedShape(IShape shape) {
        super(shape);
    }

    @Override
    public void draw() {
        System.out.println("Border Color: Red");
        shape.draw();
        additionalFunc1();
    }

    private void additionalFunc1() {
        System.out.println("I'm the new functionality from the Red Shape Decorator");
    }
}

class GreenShape extends ShapeDecorator {

    public GreenShape(IShape shape) {
        super(shape);
    }

    @Override
    public void draw() {
        System.out.println("Border Color: Green");
        this.shape.draw();
        additionalFunc2();
    }

    private void additionalFunc2() {
        System.out.println("I'm the new functionality from the Green Shape Decorator");
    }
}
