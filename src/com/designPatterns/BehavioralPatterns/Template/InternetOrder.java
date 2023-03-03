package com.designPatterns.BehavioralPatterns.Template;

public class InternetOrder extends OrderProcessTemplate {
    @Override
    protected void doSelect() {
        System.out.println("Item added to online cart");
    }

    @Override
    protected void doPayment() {
        System.out.println("Payment method is credit card");
    }

    @Override
    protected void deliver() {
        System.out.println("This item will be delivered online");
    }
}
