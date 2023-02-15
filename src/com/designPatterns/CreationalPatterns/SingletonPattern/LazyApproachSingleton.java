package com.designPatterns.CreationalPatterns.SingletonPattern;

public class LazyApproachSingleton {
    private static LazyApproachSingleton instance = null;

    private LazyApproachSingleton() {}

    public static LazyApproachSingleton getInstance() {
        if(instance == null) {
            instance = new LazyApproachSingleton();
            return instance;
        }
        return instance;
    }

    public void sayHello() {
        System.out.println("Hello from the lazy singleton");
    }
}
