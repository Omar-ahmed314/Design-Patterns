package com.designPatterns.PrototypePattern;

abstract class BasicCar implements Cloneable {
    private String name;
    private int price;

    public BasicCar(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return this.name;
    }

    public int getPrice() {
        return this.price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void show() {
        System.out.println("Car name: " + this.name + " and the Car Price: " + this.price);
    }

    @Override
    public BasicCar clone() {
        BasicCar clone = null;
        try {
            clone = (BasicCar) super.clone();
            // TODO: copy mutable state here, so the clone can't change the internals of the original
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }
}

class Ford extends BasicCar {

    public Ford() {
        super("Ford", 120000);
    }

    public Ford(Ford car) {
        super(car.getName(), car.getPrice());
    }

}

class Nano extends BasicCar {

    public Nano() {
        super("Nano", 120000);
    }

    public Nano(Nano car) {
        super(car.getName(), car.getPrice());
    }

}