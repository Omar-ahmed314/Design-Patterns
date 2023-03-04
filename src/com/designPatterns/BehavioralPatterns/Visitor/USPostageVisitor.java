package com.designPatterns.BehavioralPatterns.Visitor;

public class USPostageVisitor implements Visitor{
    private static double totalPostage = 0;

    @Override
    public void visit(Book book) {
        totalPostage += book.getPrice() + book.getWeight() * 2;
    }

    @Override
    public void visit(CD cd) {
        totalPostage += cd.getPrice() + cd.getWeight() * 2.5;
    }

    @Override
    public void visit(DVD dvd) {
        totalPostage += dvd.getPrice() + dvd.getWeight() * 3;
    }

    public double getTotalPostage() { return totalPostage; }
}
