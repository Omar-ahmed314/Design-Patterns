package com.designPatterns.CreationalPatterns.AbstractFactoryMethod;

// Abstract factory
interface FactoryMethod {
    Color getColor(String colorType);
    Shape getShape(String shapeType);
}

// color factory
class ColorFactory implements FactoryMethod{
    @Override
    public Color getColor(String colorType) {
        return switch(colorType){
            case "Red" -> new Red();
            case "Blue" -> new Blue();
            default -> null;
        };
    }

    @Override
    public Shape getShape(String shapeType) {
        return null;
    }
}

// shape factory
class ShapeFactory implements FactoryMethod{
    @Override
    public Color getColor(String colorType) {
        return null;
    }

    @Override
    public Shape getShape(String shapeType) {
        return switch(shapeType) {
            case "Rect" -> new Rect();
            case "Circle" -> new Circle();
            default -> null;
        };
    }
}
