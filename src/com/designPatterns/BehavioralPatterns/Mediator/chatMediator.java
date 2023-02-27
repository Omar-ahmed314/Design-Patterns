package com.designPatterns.BehavioralPatterns.Mediator;

import java.util.ArrayList;
import java.util.List;

public class chatMediator implements Mediator{
    private final List<Chatter> chatters;

    public chatMediator() {
        this.chatters = new ArrayList<>();
    }

    public void addUser(Chatter user) {
        chatters.add(user);
    }

    @Override
    public void notify(Message m, String receiver) {
        for(Chatter user : chatters) {
            if(user.getName().equalsIgnoreCase(receiver))
                user.receive(m);
        }
    }
}
