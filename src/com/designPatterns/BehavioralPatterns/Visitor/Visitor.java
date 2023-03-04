package com.designPatterns.BehavioralPatterns.Visitor;

public interface Visitor {
    void visit(Book book);
    void visit(CD cd);
    void visit(DVD dvd);
}
