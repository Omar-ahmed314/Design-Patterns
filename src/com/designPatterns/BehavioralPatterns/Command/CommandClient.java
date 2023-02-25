package com.designPatterns.BehavioralPatterns.Command;

public class CommandClient {
    public static void main(String[] args) {
        // some code here
        // main code

        // creating stock
        Stock googleStock = new Stock("Google", 100);

        // creating command
        BuyStock buyCommand = new BuyStock(googleStock);
        SellStock sellCommand = new SellStock(googleStock);

        // creating broker
        Broker broker = new Broker();

        // assign the commands to the broker
        broker.takeOrder(buyCommand);
        broker.takeOrder(sellCommand);

        // execute the commands
        broker.placeOrder();

    }
}
