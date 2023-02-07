package com.designPatterns.AbstractFactoryMethod;

// abstract class for the second product
abstract class Shape {
    public abstract void greet();
}

class Rect extends Shape {
    @Override
    public void greet(){
        System.out.println("Hello I'm Rectangle");
    }
}

class Circle extends Shape {
    @Override
    public void greet(){
        System.out.println("Hello I'm Circle");
    }
}
