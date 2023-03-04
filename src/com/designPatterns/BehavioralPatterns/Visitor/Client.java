package com.designPatterns.BehavioralPatterns.Visitor;

import java.util.ArrayList;
import java.util.StringTokenizer;

public class Client {
    public static void main(String[] args) {
        // main code will be written here
        Book book1 = new Book(20, 10);
        Book book2 = new Book(40, 5);
        Book book3 = new Book(10, 15);

        // cd classes
        CD cd1 = new CD(10, 2);
        CD cd2 = new CD(11, 1);
        CD cd3 = new CD(50, 5);

        // dvds
        DVD dvd1 = new DVD(15, 6);
        DVD dvd2 = new DVD(20, 7);
        DVD dvd3 = new DVD(10, 8);

        // list of items
        ArrayList<Element> elements = new ArrayList<>();
        elements.add(book1);
        elements.add(book2);
        elements.add(book3);
        elements.add(cd1);
        elements.add(cd2);
        elements.add(cd3);
        elements.add(dvd1);
        elements.add(dvd2);
        elements.add(dvd3);

        // create us visitor
        USPostageVisitor usPostageVisitor = new USPostageVisitor();
        SouthAmericaPostageVisitor southAmericaPostageVisitor = new SouthAmericaPostageVisitor();

        // calculate the usPostageVisitor
        for (Element element : elements) {
            element.accept(usPostageVisitor);
        }

        for (Element element : elements) {
            element.accept(southAmericaPostageVisitor);
        }

        System.out.println("Total Postage cost inside the us: " + usPostageVisitor.getTotalPostage());
        System.out.println("Total Postage cost outside the us: " + southAmericaPostageVisitor.getTotalPostage());
    }
}
