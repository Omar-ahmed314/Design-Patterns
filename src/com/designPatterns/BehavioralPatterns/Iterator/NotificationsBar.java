package com.designPatterns.BehavioralPatterns.Iterator;

public class NotificationsBar {
    private Collection notifications;

    public NotificationsBar(Collection list) {
        notifications = list;
    }

    public void printNotifications() {
        Iterator itr = notifications.createIterator();
        System.out.println("------Notifications Bar------");
        while(itr.hasNext()) {
            Notification not = (Notification) itr.next();
            System.out.println(not.getText());
        }
    }

}
