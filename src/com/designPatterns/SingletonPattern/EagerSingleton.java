package com.designPatterns.SingletonPattern;

public class EagerSingleton {
    private static EagerSingleton instance = new EagerSingleton();

    private EagerSingleton() {}

    public static EagerSingleton getInstance() {
        return instance;
    }

    public void sayHello() {
        System.out.println("Hello from the eager singleton pattern");
    }
}
