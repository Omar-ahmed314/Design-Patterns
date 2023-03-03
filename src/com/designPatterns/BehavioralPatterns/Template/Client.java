package com.designPatterns.BehavioralPatterns.Template;

public class Client {
    public static void main(String[] args) {
        // main code written here
        OrderProcessTemplate onlineOrder = new InternetOrder();

        onlineOrder.processOrder();

        System.out.println("=====================");

        onlineOrder = new StoreOrder();

        onlineOrder.processOrder();
    }
}
