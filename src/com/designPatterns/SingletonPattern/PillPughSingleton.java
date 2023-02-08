package com.designPatterns.SingletonPattern;

public class PillPughSingleton {

    private static class helper {
        private static PillPughSingleton instance = new PillPughSingleton();
    }

    public static PillPughSingleton getInstance() {
        return helper.instance;
    }

    public void sayHello() {
        System.out.println("hello from teh pill pugh singleton");
    }
}
