package com.designPatterns.StructuralPatterns.BridgePattern;

public abstract class Shape {
    protected int borderWidth;
    protected IColor shapeColor;

    public Shape(IColor color, int borderWidth) {
        shapeColor = color;
        this.borderWidth = borderWidth;
    }

    public void modifyShape(int newBorderWidth) {
        this.borderWidth *= newBorderWidth;
        System.out.println("Now we're changing the border length " + newBorderWidth + " times");
    }

    public abstract void drawShape();
}

class Triangle extends Shape {

    public Triangle(IColor color, int borderWidth) {
        super(color, borderWidth);
    }

    @Override
    public void drawShape() {
        System.out.printf("This Triangle colored with: %s color with %d inch border\n",
                this.shapeColor.fillWithColor(),
                this.borderWidth);
    }
}

class Rectangle extends Shape {

    public Rectangle(IColor color, int borderWidth) {
        super(color, borderWidth);
    }

    @Override
    public void drawShape() {
        System.out.printf("This Rectangle colored with: %s color with %d inch border\n",
                this.shapeColor.fillWithColor(),
                this.borderWidth);
    }
}
