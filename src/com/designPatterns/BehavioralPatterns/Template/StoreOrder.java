package com.designPatterns.BehavioralPatterns.Template;

public class StoreOrder extends OrderProcessTemplate{
    @Override
    protected void doSelect() {
        System.out.println("This Item is added the cart from the shelf");
    }

    @Override
    protected void doPayment() {
        System.out.println("Payment method is cash");
    }

    @Override
    protected void deliver() {
        System.out.println("Items will be packaged in a bag");
    }
}
