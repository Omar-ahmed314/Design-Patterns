package com.designPatterns.StructuralPatterns.CompositePattern;

// implements the leaf nodes
public class Professor extends FacultyMember {
    protected String type;

    public Professor(String name, int id, String type) {
        super(name, id);
        this.type = type;
    }

    @Override
    public void getDetails() {
        System.out.printf("%s Professor: %s with id: %d\n", type, name, id);
    }
}