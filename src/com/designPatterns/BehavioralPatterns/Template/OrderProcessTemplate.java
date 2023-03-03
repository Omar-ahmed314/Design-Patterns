package com.designPatterns.BehavioralPatterns.Template;

public abstract class OrderProcessTemplate {

    // function is final, so no override from subclasses is allowed
    public final void processOrder() {
        doSelect();
        doPayment();
        deliver();
    }

    protected abstract void doSelect();

    protected abstract void doPayment();

    protected abstract void deliver();

}
