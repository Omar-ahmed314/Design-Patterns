package com.designPatterns.BehavioralPatterns.IteratorPattern;

public class IteratorClient {
    public static void main(String[] args) {
        // some code here
        // main code written here

        // create a notification collection
        ArrayCollection notifications = new ArrayCollection();

        // create notifications
        Notification not1 = new Notification("Notification 1");
        Notification not2 = new Notification("Notification 2");
        Notification not3 = new Notification("Notification 3");
        Notification not4 = new Notification("Notification 4");

        // adding the notifications
        notifications.addItem(not1);
        notifications.addItem(not2);
        notifications.addItem(not3);
        notifications.addItem(not4);

        // creating the notificationsBar
        NotificationsBar bar = new NotificationsBar(notifications);

        // printing the notifications
        bar.printNotifications();


    }
}
