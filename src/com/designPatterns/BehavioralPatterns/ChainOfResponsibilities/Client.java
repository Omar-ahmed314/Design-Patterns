package com.designPatterns.BehavioralPatterns.ChainOfResponsibilities;

public class Client {
    public static void main(String[] args) {
        // chain of responsibilities code
        // main code

        // instantiate the handlers sequence
        Receiver c1 = new FaxErrorHandler();
        Receiver c2 = new EmailErrorHandler();

        // make the sequence
        c1.setNextHandler(c2);

        // messages
        Message faxMessage1 = new Message("Fax is reaching late to destination", Message.MessagePriority.NORMAL);
        Message faxMessage2 = new Message("Fax is not reaching destination", Message.MessagePriority.HIGH);
        Message emailMessage1 = new Message("Email, bcc field is disabled occasionally", Message.MessagePriority.NORMAL);
        Message emailMessage2 = new Message("Email is not going", Message.MessagePriority.HIGH);

        // handling the messages
        c1.processMessage(faxMessage1);
        c1.processMessage(emailMessage2);
        c1.processMessage(emailMessage1);
        c1.processMessage(faxMessage2);

    }
}
