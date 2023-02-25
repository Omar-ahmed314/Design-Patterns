package com.designPatterns.BehavioralPatterns.ChainOfResponsibilities;

public class EmailErrorHandler extends Receiver{

    @Override
    public void processMessage(Message message) {
        String text = message.getText();

        // check if the message starts with fax
        if(text.toLowerCase().startsWith("email")) {
            System.out.printf("EmailErrorHandler processed %s issue: %s\n", message.getPriority(), message.getText());
        } else {
            this.nextHandler.processMessage(message);
        }
    }
}
