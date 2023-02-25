package com.designPatterns.BehavioralPatterns.Command;

import java.util.ArrayList;
import java.util.List;

public class Broker {
    List<IOrder> orders;

    Broker() {
        orders = new ArrayList<>();
    }

    public void takeOrder(IOrder order) {
        orders.add(order);
    }

    public void placeOrder() {
        for(IOrder order : orders) {
            order.execute();
        }
    }
}
