package com.designPatterns.SingletonPattern;

public class SynchronizedApproach {
    private static SynchronizedApproach instance = null;

    private SynchronizedApproach(){}

    public static synchronized SynchronizedApproach getInstance() {
        if(instance == null) {
            instance = new SynchronizedApproach();
            return instance;
        }
        return instance;
    }

    public void sayHello() {
        System.out.println("Hello from the synchronized version");
    }

}
