package com.designPatterns.BehavioralPatterns.Mediator;

public class client {
    public static void main(String[] args) {
        // some code will go here
        // main code

        // create the chat mediator
        chatMediator mediator = new chatMediator();

        // create users
        Chatter one = new Chatter("john", mediator);
        Chatter two = new Chatter("water", mediator);
        Chatter three = new Chatter("soil", mediator);
        Chatter four = new Chatter("air", mediator);

        // add the users to the mediator
        mediator.addUser(one);
        mediator.addUser(two);
        mediator.addUser(three);
        mediator.addUser(four);

        // chatting
        System.out.println("Chatting has started.........");
        System.out.println("------------------------------");
        one.send(new Message("Hello water i'm john"), "water");
        four.send(new Message("Hello john i'm air"), "john");
        two.send(new Message("Hello soil i'm water"), "soil");

    }
}
