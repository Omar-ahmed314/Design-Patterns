package com.designPatterns.CreationalPatterns.SingletonPattern;



public class SingletonPatternMain {
    public static void main(String[] args) {
        // the main code written here
        LazyApproachSingleton lInstance = LazyApproachSingleton.getInstance();
        lInstance.sayHello();

        SynchronizedApproach sInstance = SynchronizedApproach.getInstance();
        sInstance.sayHello();

        DoubleCheckedApproachSingleton dInstance = DoubleCheckedApproachSingleton.getInstance();
        dInstance.sayHello();

        EagerSingleton eInstance = EagerSingleton.getInstance();
        eInstance.sayHello();

        PillPughSingleton pInstance = PillPughSingleton.getInstance();
        pInstance.sayHello();
    }
}
