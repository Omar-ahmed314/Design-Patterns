package com.designPatterns.StructuralPatterns.CompositePattern;

public abstract class FacultyMember implements Faculty {
    protected String name;
    protected int id;

    FacultyMember(String name, int id) {
        this.name = name;
        this.id = id;
    }
}
