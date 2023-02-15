package com.designPatterns.CreationalPatterns.AbstractFactoryMethod;

// abstract class for the first product
abstract class Color{
    public abstract void greet();
}

class Red extends Color{
    @Override
    public void greet(){
        System.out.println("Hello I'm red color");
    }
}

class Blue extends Color{
    @Override
    public void greet(){
        System.out.println("Hello I'm Blue color");
    }
}
