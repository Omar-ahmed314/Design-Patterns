package com.designPatterns.AbstractFactoryMethod;

class AbstractFactory {
    public static FactoryMethod getFactory(String factoryType) {
        return switch(factoryType) {
            case "ColorFactory" -> new ColorFactory();
            case "ShapeFactory" -> new ShapeFactory();
            default -> null;
        };
    }
}