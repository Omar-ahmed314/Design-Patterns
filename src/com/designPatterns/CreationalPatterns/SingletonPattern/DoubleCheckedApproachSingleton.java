package com.designPatterns.CreationalPatterns.SingletonPattern;

public class DoubleCheckedApproachSingleton {
    private static DoubleCheckedApproachSingleton instance = null;

    private DoubleCheckedApproachSingleton(){}

    public static DoubleCheckedApproachSingleton getInstance() {
        if(instance == null) {
            synchronized (DoubleCheckedApproachSingleton.class) {
                if(instance == null) {
                    instance = new DoubleCheckedApproachSingleton();
                    return instance;
                }
            }
        }
        return instance;
    }

    public void sayHello() {
        System.out.println("Hello from the double checked synchronized version");
    }
}
