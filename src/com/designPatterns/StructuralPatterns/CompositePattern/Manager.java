package com.designPatterns.StructuralPatterns.CompositePattern;

public class Manager extends FacultyMember {

    public Manager(String name, int id) {
        super(name, id);
    }

    @Override
    public void getDetails() {
        System.out.printf("Manager: %s with id: %d\n", name, id);
    }
}
